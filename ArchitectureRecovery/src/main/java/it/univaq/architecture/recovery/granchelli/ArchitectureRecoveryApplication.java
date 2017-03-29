package it.univaq.architecture.recovery.granchelli;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.Product;
import it.univaq.architecture.recovery.configuration.Config;
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
@ComponentScan(basePackages = { "it.univaq.architecture.recovery.configuration" })
@EnableAutoConfiguration
@Configuration
public class ArchitectureRecoveryApplication {

	final static Logger logger = Logger.getLogger(ArchitectureRecoveryApplication.class);
	public static MSALoaderImpl factory = new MSALoaderImpl();
	public static TcpDumpLoggerImpl tcpDumpLoggerImpl = new TcpDumpLoggerImpl();
	private static Config config;

	public static void main(String[] args)
			throws IOException, InvalidRemoteException, TransportException, GitAPIException, InterruptedException {
		SpringApplication.run(ArchitectureRecoveryApplication.class, args);

		String logFileName = config.getLogDirectory() + config.getLogFilename();
		logger.info("STATIC ANALYSIS -  READY");
		logger.info("Cloning GIT REPO: " + config.getGitUrl());

		GitHubManager test = getGitHubRepo(config.getGitRepoName());
		test.setConfig(config);
		String repoo = config.getGitRepoName();
		logger.info("Wait the end of the Git Repo Download");
		logger.info("Git Repo Download Finished!");
		logger.info("STATIC ANALYSIS -  STARTED");

		EList<Developer> devs = test.getCommits();
		logger.info("microServicesArch Element Created");
		MicroserviceArch microServicesArch = new MicroserviceArch();
		logger.info("DockerParser Started");
		DockerParser dockerParser = new DockerParser(microServicesArch);
		dockerParser.setBasDirectory(repoo);
		dockerParser.find();

		logger.info("=========================");
		logger.info("Docker Reader Starting:");

		
		dockerParser.dockerFilereader();
		
		DockerManager manager = new DockerManager();
		manager.setConfig(config);
		manager.getContainerId(microServicesArch.getServices());
		manager.getNetwork(microServicesArch.getServices());
		microServicesArch.setNetworkName(manager.checkIfContainerHasTheSameNetwork(microServicesArch.getServices()));
		microServicesArch.setClientIp(manager.getClientIP(microServicesArch.getNetworkName().get(0)));

		// Da Gli pseudo Microservice Ottenuti da Docker, Creo un istanza di
		// Product
		// Questo sarà il primo passo iterativo

		logger.info("Docker Extraction Finished.");
		logger.info("Remeber to Run your MicroService Architecture");
		Converter converter = new Converter();
		Product product = converter.createProduct(microServicesArch.getServices(), microServicesArch.getClientIp());
		product.getDevelopers().addAll(devs);
		List<GitCommitCustom> commits = test.assignDevToTeam(product);
		
		test.crossedCheckCommitsDevs(microServicesArch, product, commits);
		logger.info("STATIC ANALYSIS -  FINISHED");
		
		logger.info("DYNAMIC ANALYSIS -  READY");
		
		Extraction extract = new Extraction(logFileName);
		logger.info("DYNAMIC ANALYSIS -  STARTED");
		if (config.isExistingLog()) {
			logger.info("You selected to read a pre-existent log ");
			logger.info("Log File: " + logFileName);
		}else{
			// Creation of TCPDUMMP script
			logger.info("A .sh Script has been generated in: " + config.getBuildPath());
			logger.info("The Scipt name is:" + config.getBuildPath() + File.separator + "loggingRun.sh");
			logger.info("Don't Forget to make it runnable:");
			logger.info("-> typing on the bash chmod +x runScript.sh");
			logger.info("-> Or with Right Click -> Permissions -> is Executable");
			tcpDumpLoggerImpl.setConfig(config);
			tcpDumpLoggerImpl.setLoggerFilename(logFileName);
			tcpDumpLoggerImpl.startLogger(microServicesArch.getClientIp());
			Thread.sleep(1000);
			promptEnterKey("Press Enter if you finished your Log Analysis");
		}
		logger.info("A Log File: " + logFileName + " Has been read");
		// Fine TCPDUMP
		extract.dynamicAnalysis(product, microServicesArch.getClientIp());
		
		// extract.showDependency(product);
		// Where to Save and Retrive model
		logger.info("DYNAMIC ANALYSIS -  FINISHED");

		String pathToSaveModel = config.getRuntimeEclipsePath();
		String nameOfTheModel = config.getModelName();
		// Save Architectural Model
//		logger.info("The architectural model has been saved in: " + pathToSaveModel + File.separator + nameOfTheModel);
		
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
		logger.info("A Refined Architecture has been generated");
	}

	

	private static GitHubManager getGitHubRepo(String gitRepoName) {
		// TODO Auto-generated method stub
		String repoo = config.getGitRepoName();
		GitHubManager test = new GitHubManager(repoo,config.getGitUrl());
		File cloneOrNot = new File(repoo);
		try {
			test.init();
		if (!cloneOrNot.exists()) {
			
			test.testClone();
		}
		} catch (IOException | GitAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return test;
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

	private static String promptEnterGitHub(String message) {
		logger.info(message);
		Scanner scanner = new Scanner(System.in);
		String repo = scanner.nextLine();
		
		return repo;
	}

	private static String promptEnterLocalRepo(String message) {
		logger.info(message);
		Scanner scanner = new Scanner(System.in);
		String repo = scanner.nextLine();
		
		return repo;
	}

	public Config getConfig() {
		return config;
	}

	@Autowired
	public void setConfig(Config config) {
		this.config = config;
	}
}
