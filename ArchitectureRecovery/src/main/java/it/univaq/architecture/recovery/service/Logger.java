package it.univaq.architecture.recovery.service;

public interface Logger {

	public void startLogger();

	public void stopLogger();

	void startLogger(String clientIp);

}
