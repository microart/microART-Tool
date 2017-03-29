package it.univaq.architecture.recovery.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties
public class Config {

	@Value("${git.repository.buildpath}")
	private String buildPath;

	@Value("${git.repository.url}")
	private String gitUrl;
	
	@Value("${git.path}")
	private String gitPath;
	
	@Value("${git.repository.name}")
	private String gitRepoName;

	@Value("${operating.system}")
	private String oS;

	@Value("${docker.path}")
	private String dockerPath;

	@Value("${tcpdump.path}")
	private String tcpdumpPath;

	@Value("${log.load.existing.file}")
	private boolean existingLog;

	@Value("${log.load.existing.directory}")
	private String logDirectory;

	@Value("${log.load.existing.filename}")
	private String logFilename;

	@Value("${runtime.eclipse.path}")
	private String runtimeEclipsePath;
	
	@Value("${runtime.eclipse.model}")
	private String modelName;

	public String getBuildPath() {
		return buildPath;
	}

	public void setBuildPath(String buildPath) {
		this.buildPath = buildPath;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}
	
	public String getGitUrl() {
		return gitUrl;
	}

	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}

	public String getDockerPath() {
		return dockerPath;
	}

	public void setDockerPath(String dockerPath) {
		this.dockerPath = dockerPath;
	}

	public String getTcpdumpPath() {
		return tcpdumpPath;
	}

	public void setTcpdumpPath(String tcpdumpPath) {
		this.tcpdumpPath = tcpdumpPath;
	}

	public boolean isExistingLog() {
		return existingLog;
	}

	public void setExistingLog(boolean existingLog) {
		this.existingLog = existingLog;
	}

	public String getLogDirectory() {
		return logDirectory;
	}

	public void setLogDirectory(String logDirectory) {
		this.logDirectory = logDirectory;
	}

	public String getLogFilename() {
		return logFilename;
	}

	public void setLogFilename(String logFilename) {
		this.logFilename = logFilename;
	}

	public String getRuntimeEclipsePath() {
		return runtimeEclipsePath;
	}

	public void setRuntimeEclipsePath(String runtimeEclipsePath) {
		this.runtimeEclipsePath = runtimeEclipsePath;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getGitRepoName() {
		return gitRepoName;
	}

	public void setGitRepoName(String gitRepoName) {
		this.gitRepoName = gitRepoName;
	}

	public String getGitPath() {
		return gitPath;
	}

	public void setGitPath(String gitPath) {
		this.gitPath = gitPath;
	}

}
