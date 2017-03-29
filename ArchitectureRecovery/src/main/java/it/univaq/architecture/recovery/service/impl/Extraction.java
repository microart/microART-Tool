package it.univaq.architecture.recovery.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.springframework.util.StringUtils;

import MicroservicesArchitecture.Interface;
import MicroservicesArchitecture.Link;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.Product;

public class Extraction {

	public Converter converter;
	public static MSALoaderImpl factory;
	public String logFileName;

	public Extraction(String logFileName) {
		super();
		converter = new Converter();
		factory = new MSALoaderImpl();
		this.logFileName = logFileName;
	}

	public void dynamicAnalysis(Product product, String ClientIP) {
		Product prd = product;
		// Prendo Il Log Completp
		File log = getLog();
		// Applico un filtro al log per eliminare le righe non necessarie
		String[] filteredLog = filterLog(log);
		// Ora ho product che ha tutti i servizi

		readLog(prd, filteredLog, ClientIP);
		cleanDependency(prd);
		 MicroService client = getMicroservice(prd, ClientIP);
		 eraseDependency(client, prd);
		 prd.getComposedBy().remove(client);
//		EcoreUtil.delete(client);
		
	}

	private void cleanDependency(Product prd) {
		Iterator<Link> links = prd.getLinks().iterator();
		EList<Link> cleanedList = new BasicEList<Link>();
		while (links.hasNext()) {
			Link link = (Link) links.next();
			if (!cleanedList.contains(link)) {
				cleanedList.add(link);
			}
		}
		prd.getLinks().clear();
		prd.getLinks().addAll(cleanedList);

	}

	public void dynamicAnalysisWithServiceDiscovery(Product product, String ClientIP, String ServiceDiscovery) {
		Product prd = product;
		// Prendo Il Log Completp
		File log = getLog();
		// Applico un filtro al log per eliminare le righe non necessarie
		String[] filteredLog = filterLog(log);
		// Ora ho product che ha tutti i servizi
		MicroService serviceDiscovery = getMicroservice(prd, ServiceDiscovery);
		
		cleanInterfaceAndLinks(prd);
		readLogWithServiceDiscovery(prd, filteredLog, ClientIP, serviceDiscovery);
		cleanDependency(prd);
		// cleanDatabase(prd);
		MicroService client = getMicroservice(prd, ClientIP);
//		System.out.println(client);
		eraseDependency(client, prd);
		cleanRequestedUseless(client.getName(), prd);
		cleanRequestedUseless(serviceDiscovery.getName(), prd);
		eraseDependency(serviceDiscovery, prd);
		prd.getComposedBy().remove(client);
//		prd.getComposedBy().remove(serviceDiscovery);
		EcoreUtil.delete(serviceDiscovery);
//		EcoreUtil.delete(client);
//		prd.getComposedBy().remove(client);

		// collapseArrows();

	}

	private void cleanRequestedUseless(String name, Product prd) {
		// TODO Auto-generated method stub
		Iterator<MicroService> it = prd.getComposedBy().iterator();

		while (it.hasNext()) {
			MicroService microService = (MicroService) it.next();
			Iterator<Interface> it2 = microService.getRequire().iterator();
			EList<Interface> list = new BasicEList<Interface>();
			while (it2.hasNext()) {
				Interface interface1 = (Interface) it2.next();
				if (!interface1.getEndPoint().equals("/" + name + "/")) {
					list.add(interface1);
				}
			}
			microService.getRequire().clear();
			microService.getRequire().addAll(list);
		}

	}

	private void cleanInterfaceAndLinks(Product prd) {
		// TODO Auto-generated method stub
		prd.getLinks().clear();
		Iterator<MicroService> it = prd.getComposedBy().iterator();
		while (it.hasNext()) {
			MicroService microService = (MicroService) it.next();
			microService.getExpose().clear();
			microService.getRequire().clear();
		}
	}

	private void cleanDatabase(Product prd) {
		EList<MicroService> brandNewMs = new BasicEList<MicroService>();
		Iterator<MicroService> it = prd.getComposedBy().iterator();
		while (it.hasNext()) {
			MicroService microService = (MicroService) it.next();
			if (microService.getName().contains("_db")) {
				eraseDependency(microService, prd);
				// prd.getComposedBy().remove(microService);
			} else {
				brandNewMs.add(microService);
			}
		}
		prd.getComposedBy().clear();
		prd.getComposedBy().addAll(brandNewMs);

	}

	private void eraseDependency(MicroService microService, Product prd) {
		// Take the list of Product's Link
		EList<Link> links = prd.getLinks();
		// Creation of a new List of Links
		EList<Link> brandNewLinks = new BasicEList<Link>();
		// Get the Exposed Interface of the Services
		EList<Interface> exposed = microService.getExpose();
		// Check for exposed
		
		Iterator<Interface> itInterface = exposed.iterator();

		while (itInterface.hasNext()) {
			Interface interface1 = (Interface) itInterface.next();
			Iterator<Link> it = links.iterator();

			while (it.hasNext()) {
				Link link = (Link) it.next();
				if (link.getTarget().equals(interface1)) {
					brandNewLinks.add(link);
				}
			}
		}

		EList<Interface> required = microService.getRequire();
		itInterface = required.iterator();
		while (itInterface.hasNext()) {
			Interface interface1 = (Interface) itInterface.next();
			Iterator<Link> it = links.iterator();

			while (it.hasNext()) {
				Link link = (Link) it.next();
				if (link.getSource().equals(interface1)) {
					brandNewLinks.add(link);
				}
			}
		}
		prd.getLinks().removeAll(brandNewLinks);

	}

	private void readLogWithServiceDiscovery(Product product, String[] log, String clientIP,
			MicroService serviceDiscovery) {
		MicroService client= factory.createMicroService();
		client.setHost(clientIP);
		client.setName("Client-User");
		product.getComposedBy().add(client);
		for (int i = 0; i < log.length; i++) {
			String row = log[i];
			String senderIP = extractSender(row);
			String targetIP = extractTarget(row);
			
				MicroService senderService = getMicroservice(product, senderIP);
				if (senderService == null) {
					// System.out.println("Errore - SenderService Null");
				}
				MicroService targetService = getMicroservice(product, targetIP);
				if (targetService == null) {
					// System.out.println("Errore - targetService Null");
				}
				if (targetService.equals(serviceDiscovery)) {
					// Vai alla riga successiva per scoprire il vero ricevente
					i++;
					row = log[i];
					targetIP = extractTarget(row);
					targetService = getMicroservice(product, targetIP);
				}
				// So now Sender Dependes on Target
				// if (!checkLinkExistence(product, senderService, targetService)) {
				// Non esiste un Link con nessuna interfaccia di Sender Target
				Link dependency = createLink(senderService, targetService, row);
				dependency.setDependency(product);

				// }
			
			

		}

	}

	public void readLog(Product product, String[] log, String ClientIP) {

		for (int i = 0; i < log.length; i++) {
			String row = log[i];
			String senderIP = extractSender(row);
			String targetIP = extractTarget(row);
			MicroService senderService = getMicroservice(product, senderIP);
			if (senderService == null) {
				// System.out.println("Errore - SenderService Null");
			}
			MicroService targetService = getMicroservice(product, targetIP);
			if (targetService == null) {
				// System.out.println("Errore - targetService Null");
			}
			// So now Sender Dependes on Target
			// if (!checkLinkExistence(product, senderService, targetService)) {
			// Non esiste un Link con nessuna interfaccia di Sender Target
			Link dependency = createLink(senderService, targetService, row);
			dependency.setDependency(product);

			// }

		}

	}

	private boolean checkLinkExistence(Product product, MicroService senderService, MicroService targetService) {

		boolean sourceFound = false;
		boolean targetFound = false;

		EList<Interface> senderInterfaces = senderService.getRequire();
		EList<Interface> targetInterfaces = targetService.getExpose();
		// Per ogni Link di Porduct
		// Check if already exist the Link
		//
		EList<Link> links = product.getLinks();
		Iterator<Link> it = links.iterator();
		while (it.hasNext()) {
			// Itero tra tutti i link di Product
			Link temp = (Link) it.next();
			// Estraggo le interfacce per Ogni Link
			Interface tempSourceLinks = temp.getSource();
			Interface tempTargetLinks = temp.getTarget();
			// Devo Controllare che la source Interface sia uguale alla mia

			Iterator<Interface> itSender = senderInterfaces.iterator();
			while (itSender.hasNext()) {
				Interface senderInterface = (Interface) itSender.next();
				if (senderInterface.equals(tempSourceLinks)) {
					sourceFound = true;
					break;
				}

			}

			Iterator<Interface> itTarget = targetInterfaces.iterator();
			while (itTarget.hasNext()) {
				Interface targetInterface = (Interface) itTarget.next();
				if (targetInterface.equals(tempTargetLinks)) {
					targetFound = true;
					break;
				}

			}

		}
		if (targetFound && sourceFound) {
			return true;
		} else {
			return false;
		}

	}

	private Link createLink(MicroService senderService, MicroService targetService, String row) {
		// Check if exist a Link Betweend these two service
		Link senderToReceive = factory.createLink();
		// Creo Interfaccia Fittizia di Chiamata
		// per Sender e Unisco Microservice e Interfaccia
		Interface senderInterface = getRequiredInterface(senderService, targetService, row);
		// Creo Interfaccia Reale
		// per Target e Unisco Microservice e Interfaccia
		Interface targetInterface = getExposedInterface(senderService, targetService, row);
		// Istanzio il Link
		senderToReceive.setName("From: " + senderService.getName() + " To: " + targetService.getName());
		senderToReceive.setSource(senderInterface);
		senderToReceive.setTarget(targetInterface);
		return senderToReceive;
	}

	private Interface getExposedInterface(MicroService senderService, MicroService targetService, String row) {
		Interface targetInterface = null;

		if (checkIfExposedInterfaceExist(targetService, extractEndPointTarget(row))) {
			targetInterface = getExposedInterfaceByEndPoint(targetService, extractEndPointTarget(row));
		} else {
			targetInterface = factory.createInterface();
		}

		targetInterface.setEndPoint(extractEndPointTarget(row));
		targetInterface.setName("Request From: " + senderService.getName());

		targetInterface.setExposedBy(targetService);
		// Add to taget the exposed Interface
		targetService.getExpose().add(targetInterface);
		return targetInterface;
	}

	private String extractNameTarget(String row) {
		String NameTarget = row.substring(row.indexOf("HTTP:"), row.indexOf("HTTP/1.1"));
		// NameTarget = NameTarget.substring(NameTarget.indexOf("/"),
		// NameTarget.lastIndexOf("/"));
		return NameTarget;
	}

	private String extractEndPointTarget(String row) {

		String EndPoint = row.substring(row.indexOf("HTTP:") + 5, row.indexOf("HTTP/1.1")).trim();

		if (!EndPoint.isEmpty() || !EndPoint.equals("")) {

			EndPoint = EndPoint.substring(EndPoint.indexOf("/"));

			return getEndPoint(EndPoint);
		} else {
			return "Ack";
		}

	}

	private String extractInterfaceName(String row) {
		// TODO Auto-generated method stub
		return null;
	}

	private MicroService getMicroservice(Product product, String ip) {

		Iterator<MicroService> it = product.getComposedBy().iterator();
		while (it.hasNext()) {

			MicroService tep = it.next();
			if (tep.getHost().equals(ip) || ip.equals(tep.getHost())) {
				return tep;
			}
		}

		return null;
	}

	private String extractTarget(String row) {
		int index = row.indexOf(">");
		String IpDestination = extractIp(row.substring(index + 1, index + 15));
		// System.out.println("Ip Destination: " + IpDestination);
		return IpDestination.trim();
	}

	public String extractIp(String ip) {
		String newIP = null;
		newIP = ip.substring(0, ip.lastIndexOf("."));
		return newIP.trim();
	}

	private String extractSender(String row) {
		int index = row.indexOf(">");
		String ipSource = extractIp(row.substring(index - 18, index - 1));
		if (ipSource.contains("P")) {
			ipSource = ipSource.substring(2);
		}
		// System.out.println("Ip Source: " + ipSource);
		return ipSource.trim();
	}

	public void startMonitoring() {
		// Inserisci comando bash per attivare TCPDUMP
	}

	public void stopMonitoring() {
		// Interrompi TCPDUMP e check se il file creato esiste!
	}

	public File getLog() {
		File file = new File(this.logFileName);
		return file;
	}

	public String[] filterLog(File log) {
		String s = null;
		String realLog[] = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(log));
			String filtedLog[] = new String[10000000];
			int index = 0;
			while ((s = br.readLine()) != null) {
				if (s.contains("HTTP:") && !s.contains(".js") && !s.contains(".css") && !s.contains(".png")
						&& !s.contains(".jpg") && !s.contains("304")) {
					filtedLog[index] = s;
					index++;
				}
			}
			br.close();
			realLog = new String[index];
			realLog = Arrays.copyOf(filtedLog, index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return realLog;
	}

	public void showDependency(Product product) {

		Iterator<MicroService> ms = product.getComposedBy().iterator();
		while (ms.hasNext()) {
			MicroService microService = (MicroService) ms.next();
			System.out.println(microService.getName() + " Host: " + microService.getHost());
		}

	}

	private String getEndPoint(String line) {
		int occurence = 0;
		int index = 0;
		String endPoint = null;

		switch (StringUtils.countOccurrencesOf(line, "/")) {
		case 1:
			return line;
		case 2:
			return line;
		case 3:
			return line;
		case 4:
			// caso /container/rest/api/interface no paramenter
			for (int i = 0; i < line.length(); i++) {
				char cr = line.charAt(i);
				if (cr == '/') {
					occurence++;
					if (occurence == 3) {
						endPoint = line.substring(0, i);
						return endPoint;
					}
				}
			}

		case 5:
			// caso /servizio/container/rest/api/interface
			// if (times == 1) {
			for (int i = 0; i < line.length(); i++) {
				char cr = line.charAt(i);
				if (cr == '/') {
					occurence++;
					if (occurence == 5) {
						endPoint = line.substring(0, i);
						return endPoint;
					}
				}
			}

		case 6:
			// if (times == 1) {
			// caso /servizio/container/rest/api/interface/metodo
			for (int i = 0; i < line.length(); i++) {
				char cr = line.charAt(i);
				if (cr == '/') {
					occurence++;
					if (occurence == 6) {
						endPoint = line.substring(0, i);
						return endPoint;
					}
				}
			}

		case 7:
			// caso /servizio/container/rest/api/interface/metodo/parametri
			for (int i = 0; i < line.length(); i++) {
				char cr = line.charAt(i);
				if (cr == '/') {
					occurence++;
					if (occurence == 6) {
						endPoint = line.substring(0, i - 1);
						return endPoint;
					}
				}
			}
		default:
			return line;
		}

	}

	private Interface getExposedInterfaceByEndPoint(MicroService targetService, String extractEndPointTarget) {
		Iterator<Interface> it = targetService.getExpose().iterator();
		while (it.hasNext()) {
			Interface interface1 = (Interface) it.next();
			if (interface1.getEndPoint().equals(extractEndPointTarget)) {
				return interface1;
			}
		}
		return null;
	}

	private boolean checkIfExposedInterfaceExist(MicroService targetService, String targetInterface) {
		Iterator<Interface> it = targetService.getExpose().iterator();
		while (it.hasNext()) {
			Interface interface1 = (Interface) it.next();
			if (interface1.getEndPoint().equals(targetInterface)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkIfRequiredInterfaceExist(MicroService senderService, String endPoint) {
		Iterator<Interface> it = senderService.getExpose().iterator();
		while (it.hasNext()) {
			Interface interface1 = (Interface) it.next();
			if (interface1.getEndPoint().equals(endPoint)) {
				return true;
			}
		}
		return false;
	}

	private Interface getRequiredInterfaceByEndPoint(MicroService senderService, String endPoint) {
		Iterator<Interface> it = senderService.getExpose().iterator();
		while (it.hasNext()) {
			Interface interface1 = (Interface) it.next();
			if (interface1.getEndPoint().equals(endPoint)) {
				return interface1;
			}
		}
		return null;
	}

	private Interface getRequiredInterface(MicroService senderService, MicroService targetService, String row) {
		Interface senderInterface = null;
		String endPoint = "/" + targetService.getName() + "/";
		if (checkIfRequiredInterfaceExist(senderService, endPoint)) {
			senderInterface = getRequiredInterfaceByEndPoint(senderService, endPoint);
		} else {
			senderInterface = factory.createInterface();
		}
		senderInterface.setEndPoint(endPoint);
		senderInterface.setName("Needs: " + targetService.getName() + " @Addr: " + targetService.getHost());
		senderInterface.setRequiredBy(senderService);
		// Add to Source the required Interface
		senderService.getRequire().add(senderInterface);
		return senderInterface;
	}
}
