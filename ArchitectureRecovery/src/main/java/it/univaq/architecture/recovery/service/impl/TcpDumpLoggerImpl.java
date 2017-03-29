package it.univaq.architecture.recovery.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.univaq.architecture.recovery.configuration.Config;
import it.univaq.architecture.recovery.service.Logger;

@ComponentScan(basePackages = { "it.univaq.architecture.recovery.configuration" })
@Configuration
public class TcpDumpLoggerImpl implements Logger {

	String loggerFilename;
	File loggerFile;
	private Config config;
	
	public String getNetworkInterface(String clientIp) {
		Process p;
		String s = null;
		String result = null;
		try {
			String[] ifconfig = new String[100000];
			String command = "ifconfig";
//			System.out.println(command);
			p = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			int i = 0;
			while ((s = br.readLine()) != null) {
//				System.out.println(s);
				ifconfig[i] = s;
				i++;
			}
			p.waitFor();
			p.destroy();
			String[] fittedArray = new String[i];
			fittedArray = Arrays.copyOf(ifconfig, i);
			for (int j = 0; j < fittedArray.length; j++) {
				String line = fittedArray[j];
				if (line.contains(clientIp)) {
					result =  ifconfig[j-1];
//					System.out.println(result);
					result = result.substring(0, result.indexOf(" "));
//					System.out.println(result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void startLogger(String clientIp) {

		String networkName = getNetworkInterface(clientIp);
		// Creation of a bash shell file to execute tcpdump
		File fout = new File(config.getLogDirectory() + File.separator + "loggingRun.sh");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fout);

			BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(fos));
			if (config.getoS().equals("Mac")) {
				osw.write("#!/bin/bash");
			}else{
				osw.write("#!/bin/sh");
			}
			osw.newLine();
			osw.write("echo 'Logging Ready - Root user needed'");
			osw.newLine();
			osw.write("sudo "+ config.getTcpdumpPath() + " -i " + networkName + " > " + loggerFilename);
			osw.newLine();
			osw.write("echo 'Logging Finished'");
			osw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void stopLogger() {
		// TODO Auto-generated method stub

	}

	private static void promptEnterKey() {
		System.out.println("Press \"ENTER\" if you finished your modifications.(Don't Forget to Save and Close)");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

	}

	public TcpDumpLoggerImpl(String loggerFilename) {
		super();
		this.loggerFilename = loggerFilename;
	}

	public TcpDumpLoggerImpl() {
		// TODO Auto-generated constructor stub
	}

	public String getLoggerFilename() {
		return loggerFilename;
	}

	public void setLoggerFilename(String loggerFilename) {
		this.loggerFilename = loggerFilename;
	}

	public File getLoggerFile() {
		return loggerFile;
	}

	public void setLoggerFile(File loggerFile) {
		this.loggerFile = loggerFile;
	}

	@Override
	public void startLogger() {
		// TODO Auto-generated method stub

	}
	public Config getConfig() {
		return config;
	}

	@Autowired
	public void setConfig(Config config) {
		this.config = config;
	}
}
