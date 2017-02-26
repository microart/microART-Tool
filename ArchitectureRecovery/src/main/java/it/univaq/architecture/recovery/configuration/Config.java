package it.univaq.architecture.recovery.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = { "it.univaq.architecture.recovery.*" })
@PropertySource("classpath:application.properties")
public class Config {

	@Autowired
	Environment env;

	// hello
	@Value("${git.repository.buildpath}")
	private String buildPath;

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;

	}

	public String getBuildPath() {
		return buildPath;
	}

	public void setBuildPath(String buildPath) {
		this.buildPath = buildPath;
	}
	

}
