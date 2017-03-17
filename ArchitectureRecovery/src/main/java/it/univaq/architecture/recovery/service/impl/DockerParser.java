package it.univaq.architecture.recovery.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.github.dockerjava.core.dockerfile.Dockerfile;
import com.github.dockerjava.core.dockerfile.DockerfileStatement;


import it.univaq.architecture.recovery.model.DockerComposeFile;
import it.univaq.architecture.recovery.model.PseudoMicroService;
import it.univaq.architecture.recovery.model.MicroserviceArch;
import it.univaq.architecture.recovery.service.Parser;

public class DockerParser implements Parser {

	final static Logger logger = Logger.getLogger(DockerParser.class);
	private String basDirectory;
	private String dockerFile;
	private String dockerComposeFile;
	private MicroserviceArch microServicesArch;
	private int containerCounter;

	public String getBasDirectory() {
		return basDirectory;
	}

	public void setBasDirectory(String basDirectory) {
		this.basDirectory = basDirectory;
	}

	public String getDockerFile() {
		return dockerFile;
	}

	public void setDockerFile(String dockerFile) {
		this.dockerFile = dockerFile;
	}

	public DockerParser() {
		super();
	}

	public DockerParser(String basDirectory, String dockerFile) {
		super();
		this.basDirectory = basDirectory;
		this.dockerFile = dockerFile;
	}

	public DockerParser(MicroserviceArch microServicesArch) {
		this.microServicesArch = microServicesArch;
	}

	public MicroserviceArch getMicroServicesArch() {
		return microServicesArch;
	}

	public void setMicroServicesArch(MicroserviceArch microServicesArch) {
		this.microServicesArch = microServicesArch;
	}

	public String getDockerComposeFile() {
		return dockerComposeFile;
	}

	public void setDockerComposeFile(String dockerComposeFile) {
		this.dockerComposeFile = dockerComposeFile;
	}

	public void find() {
		logger.info("Inizio Ricerca per Docker-Compose");
		if (findDockerCompose()) {
			dockerComposeReader();
		} else {
			logger.info("No DockerCompose File");
			if (findDockerFile()) {
				logger.info("File Docker Trovato, iniziare Parsing");
			} else {
				logger.info("No DockerFile");
			}
		}

	}

	public boolean findDockerCompose() {
		File localPath = new File(getBasDirectory());
		logger.info("LocalPath" + localPath.toString());
		File[] files = localPath.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (file.getName().contains("docker-compose")) {
				logger.info("Trovato Docker-Compose: " + file.getName());
				setDockerComposeFile(getBasDirectory() + "/" + file.getName());
				return true;
			}

		}
		return false;

	}

	public boolean findDockerFile() {
		File localPath = new File(getBasDirectory());
		File[] files = localPath.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (file.getName().contains("Dockerfile")) {
				logger.info("Trovato DockerFile:" + file.getName());
				setDockerFile(getBasDirectory() + "/" + file.getName());
				return true;
			}

		}
		return false;
	}

	public void dockerComposeReader() {
		try {
			Dockerfile dockerfile = new Dockerfile(new File(getDockerComposeFile()), new File(getBasDirectory()));

			Iterable<DockerfileStatement> statements = dockerfile.getStatements();
			List<DockerComposeFile> containerName = new ArrayList<DockerComposeFile>();

			// CHECK FOR CONTAINER NAME
			for (Iterator<DockerfileStatement> iterator = statements.iterator(); iterator.hasNext();) {
				DockerfileStatement temp = (DockerfileStatement) iterator.next();
				
				// If Contains the word cotainer_name, this represent a
//				temp.ge
				// Microservices
				if (temp.toString().contains("container_name")) {
					
					if(temp.toString() != null &&temp.toString() != "" ){
						DockerComposeFile container = new DockerComposeFile();
						container.setContainerName(temp.toString());
						containerName.add(container);	
					}
					
				}

			}
			containerCounter = 0;
			Iterator<DockerComposeFile> containerIterator = containerName.iterator();
			while (containerIterator.hasNext()) {
				DockerComposeFile containerTemp = containerIterator.next();

				for (Iterator<DockerfileStatement> iterator = statements.iterator(); iterator.hasNext();) {
					DockerfileStatement temp = (DockerfileStatement) iterator.next();

					if (containerTemp.getContainerName().equals(temp.toString())) {
						containerCounter = 1;
						while (iterator.hasNext()) {
							DockerfileStatement temp2 = iterator.next();

							if (!temp2.toString().contains("container_name")) {
								if (temp2.toString().contains("build")) {
									containerTemp.setBuild(temp2.toString());
								} else if (temp2.toString().contains("dockerfile")) {
									containerTemp.setDockerFile(temp2.toString());
								}
							} else {
								break;
							}
						}
					}

				}
			}
			// Start Parsing
			parseDockerCompose(containerName);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	private void parseDockerCompose(List<DockerComposeFile> containerName) {

		List<PseudoMicroService> microServices = new ArrayList<PseudoMicroService>();
		Iterator<DockerComposeFile> iterator = containerName.iterator();
		while (iterator.hasNext()) {

			DockerComposeFile dockercompose = iterator.next();
			String ContainerName = extractvalue(dockercompose.getContainerName());
			String buildPoint = null;
			String dockerFileName = null;
			File dockerFile = null;
			File baseDirectory = null;
			Dockerfile dockerInst = null;
			PseudoMicroService microservice = new PseudoMicroService();

			microservice.setName(ContainerName);
			if (dockercompose.getBuild() != null) {
				buildPoint = extractvalue(dockercompose.getBuild());
				if (buildPoint.equals(".")) {
					baseDirectory = new File(this.basDirectory + "/");
				} else {
					baseDirectory = new File(this.basDirectory + "/" + buildPoint);
				}

			} else {
				baseDirectory = new File(this.basDirectory + "/");
			}
			if (dockercompose.getDockerFile() != null) {

				dockerFileName = extractvalue(dockercompose.getDockerFile());
				dockerFile = new File(this.basDirectory + "/" + dockerFileName);
				dockerInst = new Dockerfile(dockerFile, new File(this.basDirectory + "/"));
				microservice.setDockerfile(dockerInst);
			}else{
//				Per i Database che non hai dockerfile bisogna inventarsi qualcosa
//				microservice.setDockerfile(new Dockerfile(new File(""),new File(this.basDirectory + "/")));
			}

			microServices.add(microservice);
		}
		this.microServicesArch.setServices(microServices);

	}

	public void dockerFilereader() {

		List<PseudoMicroService> microservices = getMicroServicesArch().getServices();
		Iterator<PseudoMicroService> it = microservices.iterator();
		while (it.hasNext()) {
			PseudoMicroService microService = (PseudoMicroService) it.next();
			try {
				Dockerfile dockerfile = microService.getDockerfile();
				Iterable<DockerfileStatement> statements = dockerfile.getStatements();
				DockerfileStatement expose = null;
				for (Iterator iterator = statements.iterator(); iterator.hasNext();) {
					DockerfileStatement temp = (DockerfileStatement) iterator.next();
					if (temp.toString().contains("EXPOSE")) {
						expose = (DockerfileStatement) temp;
					}

				}
				List<Integer> ports = extractPorts(expose.toString());
				microService.setPorts(ports);

			} catch (IOException e) {
				// TODO: handle exception
			} catch (NullPointerException nu) {
				nu.getStackTrace();
			}

		}

	}

	public String extractvalue(String key) {
		if (key.isEmpty() || key.equals(null))
			return "";
		int indexSemiColon = key.indexOf(":");
		String substring = key.substring(indexSemiColon + 2);
		return substring;
	}

	public List<Integer> extractPorts(String expose) {

		Scanner in = new Scanner(expose).useDelimiter("[^0-9]+");
		List<Integer> ports = new ArrayList<Integer>();
		
		while (in.hasNext()) {
			ports.add(new Integer(in.nextInt()));
		}
		
		return ports;
	}

}
