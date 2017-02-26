package it.univaq.architecture.recovery.model;

public class DockerComposeFile {

	String containerName;
	String build;
	String dockerFile;
	String net;
	
	public String toString(){
		
		return "ContainerName: " + containerName + "|| dockerFile: " + dockerFile + "|| build: " + build;
		
	}
	
	public DockerComposeFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getContainerName() {
		return containerName;
	}
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getDockerFile() {
		return dockerFile;
	}
	public void setDockerFile(String dockerFile) {
		this.dockerFile = dockerFile;
	}
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}

}
