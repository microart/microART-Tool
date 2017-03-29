package it.univaq.architecture.recovery.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import it.univaq.architecture.recovery.configuration.Config;
import it.univaq.architecture.recovery.model.PseudoMicroService;

@ComponentScan(basePackages = { "it.univaq.architecture.recovery.configuration" })
public class DockerManager {

	private Config config;

	public List<PseudoMicroService> getNetwork(List<PseudoMicroService> services) {
		List<PseudoMicroService> richServices = services;
		Iterator<PseudoMicroService> it = richServices.iterator();

		while (it.hasNext()) {
			PseudoMicroService service = (PseudoMicroService) it.next();
			String s = null;
			Process p;
			try {
				p = Runtime.getRuntime().exec(config.getDockerPath() + " inspect " + service.getContainerID());
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

				while ((s = br.readLine()) != null) {
					if (s.contains("NetworkMode")) {
						service.setNetwork(s.substring(s.indexOf(":") + 3, s.length() - 2));
					} else if (s.contains("IPAddress")) {
						service.setIp((s.substring(s.indexOf(":") + 3, s.length() - 2)));
					}

				}

				p.waitFor();
				p.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return richServices;
	}

	public String getClientIP(String network) {
		String clientIP = null;
		Process p;
		String s = null;
		try {

			p = Runtime.getRuntime().exec(config.getDockerPath() + " network inspect " + network);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			while ((s = br.readLine()) != null) {

				if (s.contains("Gateway")) {
					clientIP = s.substring(s.indexOf(":") + 3, s.lastIndexOf('"'));
					if (clientIP.contains("\"")) {
						clientIP = clientIP.substring(clientIP.indexOf("\""));
					}
					clientIP = clientIP.trim();
				}

			}
			p.waitFor();
			p.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientIP;
	}

	public List<PseudoMicroService> getContainerId(List<PseudoMicroService> services) {
		// String result = this.reader("docker ps");
		List<PseudoMicroService> richServices = services;
		Iterator<PseudoMicroService> it = richServices.iterator();
		while (it.hasNext()) {
			PseudoMicroService service = (PseudoMicroService) it.next();
			String s = null;
			Process p;
			try {
				String exec = config.getDockerPath().concat(" ps");
				p = Runtime.getRuntime().exec(exec);
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

				while ((s = br.readLine()) != null) {
					if (s.contains(service.getName())) {
						String containerID = s.substring(0, 13);
						service.setContainerID(containerID);
					}

				}
				p.waitFor();
				p.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return richServices;

	}

	public List<String> checkIfContainerHasTheSameNetwork(List<PseudoMicroService> containers) {
		List<String> networks = new ArrayList<String>();

		Iterator<PseudoMicroService> it = containers.iterator();
		while (it.hasNext()) {
			PseudoMicroService microService = (PseudoMicroService) it.next();
			if (!networks.contains(microService.getNetwork())) {
				networks.add(microService.getNetwork());
			}
		}

		return networks;
	}

	public Config getConfig() {
		return config;
	}

	@Autowired
	public void setConfig(Config config) {
		this.config = config;
	}
}
