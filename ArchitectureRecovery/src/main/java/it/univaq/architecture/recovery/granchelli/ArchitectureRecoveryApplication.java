package it.univaq.architecture.recovery.granchelli;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.Product;
import it.univaq.architecture.recovery.model.GitCommitCustom;
import it.univaq.architecture.recovery.model.MicroserviceArch;
import it.univaq.architecture.recovery.service.impl.Converter;
import it.univaq.architecture.recovery.service.impl.DockerManager;
import it.univaq.architecture.recovery.service.impl.DockerParser;
import it.univaq.architecture.recovery.service.impl.Extraction;
import it.univaq.architecture.recovery.service.impl.GitHubManager;
import it.univaq.architecture.recovery.service.impl.MSALoaderImpl;
import it.univaq.architecture.recovery.service.impl.TcpDumpLoggerImpl;

@SpringBootApplication
@ComponentScan(basePackages = { "it.univaq.architecture.recovery.service.impl.*" })
@EnableAutoConfiguration
@Configuration
public class ArchitectureRecoveryApplication {

	final static Logger logger = Logger.getLogger(ArchitectureRecoveryApplication.class);
	public static MSALoaderImpl factory = new MSALoaderImpl();
	public static TcpDumpLoggerImpl tcpDumpLoggerImpl = new TcpDumpLoggerImpl();
	static String logFileName = System.getProperty("user.home") + File.separator + "ArchitectureRecovery"
			+ File.separator + "log_23feb.txt";
	public Extraction extractor = new Extraction(logFileName);

	public static void main(String[] args)
			throws IOException, InvalidRemoteException, TransportException, GitAPIException, InterruptedException {
		SpringApplication.run(ArchitectureRecoveryApplication.class, args);

		// this.repoManager.setLocalPath("/home/grankellowsky/Tesi/Codice/prova2");
		// this.repoManager.setRemotePath("https://github.com/yanglei99/acmeair-nodejs.git");
		// System.out.println("INSTANZIAZIONE MANAGER GITHUB");
		
		logger.info("STATIC ANALYSIS -  READY");
		logger.info("Cloning GIT REPO: https://github.com/acmeair/acmeair-nodejs.git");
		
		GitHubManager test = new GitHubManager("/home/grankellowsky/Tesi/Codice/prova3",
				"https://github.com/yanglei99/acmeair-nodejs.git");
		test.init();
		
		logger.info("Wait the end of the Git Repo Download");
		logger.info("Git Repo Download Finished!");
		logger.info("STATIC ANALYSIS -  STARTED");
		
		EList<Developer> devs = test.getCommits();
		
		logger.info("microServicesArch Element Created");
		
		MicroserviceArch microServicesArch = new MicroserviceArch();
		logger.info("DockerParser Started");
		
		DockerParser dockerParser = new DockerParser(microServicesArch);
		dockerParser.setBasDirectory("/home/grankellowsky/Tesi/Codice/dockerProject/acmeair-nodejs");
		dockerParser.find();
		
		logger.info("=========================");
		logger.info("Docker Reader Starting:");
		
		dockerParser.dockerFilereader();

		DockerManager manager = new DockerManager();
		manager.getContainerId(microServicesArch.getServices());
		manager.getNetwork(microServicesArch.getServices());
		microServicesArch.setNetworkName(manager.checkIfContainerHasTheSameNetwork(microServicesArch.getServices()));
		microServicesArch.setClientIp(manager.getClientIP(microServicesArch.getNetworkName().get(0)));

		// Da Gli pseudo Microservice Ottenuti da Docker, Creo un istanza di
		// Product
		// Questo sarà il primo passo iterativo
		
		logger.info("Docker Extraction Finished.");
		logger.info("Remeber to Run your MicroService Architecture");
		logger.info("");
		
		Product product = Converter.createProduct(microServicesArch.getServices(), microServicesArch.getClientIp());
		product.getDevelopers().addAll(devs);
		List<GitCommitCustom> commits = test.assignDevToTeam(product);
		test.crossedCheckCommitsDevs(microServicesArch,product, commits);
		
		logger.info("STATIC ANALYSIS -  FINISHED");
		logger.info("DYNAMIC ANALYSIS -  READY");
		
		Extraction extract = new Extraction(logFileName);
		
		// Attivazione TCPDUMMP
		logger.info("A .sh Script has been generated in: " + System.getProperty("user.home") + File.separator
				+ "ArchitectureRecovery");
		logger.info("The Scipt name is:" + System.getProperty("user.home") + File.separator + "ArchitectureRecovery"
				+ File.separator + "runScript.sh");
		logger.info("Don't Forget to make it runnable:");
		logger.info("- typing on the bash chmod +x runScript.sh");
		logger.info("- Or with Right Click -> Permissions -> is Executable");
		
		tcpDumpLoggerImpl.setLoggerFilename(logFileName);
		tcpDumpLoggerImpl.startLogger(microServicesArch.getClientIp());
		
		logger.info("DYNAMIC ANALYSIS -  STARTED");
		
		Thread.sleep(1000);
		promptEnterKey("Press Enter if you finished your Log Analysis");

		logger.info("Analysis Finished");
		logger.info("Log File: " + logFileName);
		
		// Fine TCPDUMP
		extract.dynamicAnalysis(product, microServicesArch.getClientIp());
		
		// extract.showDependency(product);
		// Where to Save and Retrive model
		
		logger.info("DYNAMIC ANALYSIS -  FINISHED");
		
		String pathToSaveModel = "/home/grankellowsky/Tesi/Codice/workspaces/runtime-EclipseApplication/it.univaq.recovery.diagram";
		String nameOfTheModel = "/acmerair.microservicesarchitecture";
		// Save Architectural Model
		
		factory.saveModel(product, pathToSaveModel, nameOfTheModel);
		
		// Messages
		logger.info("REFINEMENT PHASE -  READY - WAITING FOR ARCHITECT INTERACTION");
		logger.info("The model as been saved in the runtime Eclipse project ");
		logger.info("Model saved in Path: " + pathToSaveModel);
		logger.info("Model saved with Name: " + nameOfTheModel);
		logger.info("======================================");
		logger.info("Go to the Eclipse-RunTime Project and choose the Service Discovery");
		promptEnterKey();
		// Get the new Model

		Thread.sleep(1500);
		Product filteredProduct = factory.getModel(pathToSaveModel, nameOfTheModel);
		String serviceDiscovery = factory.getServiceDiscovery(filteredProduct);
		
		while (CheckServiceDiscovery(serviceDiscovery)) {
			promptEnterKey();
			filteredProduct = factory.getModel(pathToSaveModel, nameOfTheModel);
			serviceDiscovery = factory.getServiceDiscovery(product);

		}
		logger.info("ServiceDiscory: " + serviceDiscovery);
		extract.dynamicAnalysisWithServiceDiscovery(filteredProduct, microServicesArch.getClientIp(), serviceDiscovery);
		// extract.showDependency(filteredProduct);
		factory.saveModel(filteredProduct, pathToSaveModel, nameOfTheModel);
		logger.info("Your Model is now update. Check the Eclipse-RunTime");
		logger.info("A Logical Architecture has been generated");
	}

	private static boolean CheckServiceDiscovery(String serviceDiscovery) {
		if (serviceDiscovery.equals("NoServiceDiscovery")) {
			logger.info(
					"You Didn't Selected the Service Discovery, please, in order to filter this infrastructural node, go back to elcipse runtime, select and save.");
			return true;
		}
		return false;
	}

	private static void promptEnterKey() {
		logger.info("Press \"ENTER\" if you finished your modifications.(Don't Forget to Save and Close)");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

	}

	private static void promptEnterKey(String message) {
		logger.info(message);
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

	}
}
