// package it.univaq.architecture.recovery.service.impl;
//
// import java.util.Iterator;
// import java.util.List;
//
// import org.eclipse.emf.common.util.EList;
// import org.springframework.util.StringUtils;
//
// import MicroservicesArchitecture.Interface;
// import MicroservicesArchitecture.Operation;
// import MicroservicesArchitecture.Service;
// import MicroservicesArchitecture.SystemMSA;
// import it.univaq.architecture.recovery.model.PseudoMicroService;
//
// public class Conversion {
//
// MSALoaderImpl factory;
// MSALoaderImpl factory2;
//
// public Conversion() {
// super();
// this.factory = new MSALoaderImpl();
// this.factory2 = new MSALoaderImpl();
// }
//
// public void cloneNodesMSA(SystemMSA original, SystemMSA copy, String
// ServiceDiscovery) {
// Iterator<Service> originalServices = original.getComposedBy().iterator();
// while (originalServices.hasNext()) {
// Service service = (Service) originalServices.next();
// if (!service.getHost().trim().equals(ServiceDiscovery.trim())
// || !ServiceDiscovery.equals(service.getHost().trim())) {
// Service temp = factory.createService();
// temp.setHost(service.getHost());
// temp.setName(service.getName());
// copy.getComposedBy().add(temp);
// }
// }
// }
//
// public void getNode(SystemMSA system, List<PseudoMicroService> services) {
// Iterator<PseudoMicroService> it = services.iterator();
// System.out.println("====Conversione da MicroService in un SystemMSA");
// while (it.hasNext()) {
// PseudoMicroService microService = (PseudoMicroService) it.next();
// // System.out.println("Microservice name: " + microService.getName()
// // + "ContainerID: "
// // + microService.getContainerID() + "IP: " + microService.getIp());
// // System.out.println("..convertito in:");
// if (microService.getName().trim() != null && microService.getIp().trim() !=
// null) {
// Service servizio = factory.createService();
// servizio.setName(microService.getName().trim());
// servizio.setHost(microService.getIp().trim());
// // System.out.println("Servizio Name " + servizio.getName() +
// // "HostName: " + servizio.getHost());
// system.getComposedBy().add(servizio);
// }
//
// }
// System.out.println("====FINE Conversione");
//
// }
//
// public Service detectService(EList<Service> services, String ipDestination) {
//
// Iterator<Service> it = services.iterator();
// while (it.hasNext()) {
//
// Service tep = it.next();
// // System.out.println(ipDestination + "Detect Service Controllo: " +
// // tep.getHost());
// if (tep.getHost() != null && ipDestination != null
// && (tep.getHost().trim().equals(ipDestination) ||
// ipDestination.trim().equals(tep.getHost())
// || tep.getHost().trim().equals(ipDestination)
// || ipDestination.trim().equals(tep.getHost()))) {
// return tep;
// }
// }
//
// return null;
// }
//
// public void printDependencies(SystemMSA system) {
// System.out.println("Dependencies");
// System.out.println(" ");
// Iterator<Service> it = system.getComposedBy().iterator();
// while (it.hasNext()) {
// Service service = it.next();
// System.out.println("");
// System.out.println("The service Name:" + service.getName().toUpperCase() + "
// Host: " + service.getHost());
// System.out.println(" ");
// Iterator<Interface> its = service.getExpose().iterator();
// System.out.println("Espone Interfacce per i Seguenti Servizi: ");
//
// while (its.hasNext()) {
// Interface interface1 = (Interface) its.next();
// Iterator<Service> itu = interface1.getUsedBy().iterator();
// System.out.println("Interface: " + interface1.getEndPoint() + " Name: " +
// interface1.getName());
// while (itu.hasNext()) {
// Service service2 = (Service) itu.next();
// System.out.println("> " + service2.getName().toUpperCase());
// }
// System.out.println(" ");
// }
//
// Iterator<Interface> its2 = service.getUse().iterator();
// System.out.println("Consuma i seguenti servizi: ");
// System.out.println(" ");
// while (its2.hasNext()) {
// Interface interface1 = (Interface) its2.next();
// Iterator<Service> itu = interface1.getUsedBy().iterator();
// System.out.println("Interface: " + interface1.getEndPoint() + " Name: " +
// interface1.getName());
// while (itu.hasNext()) {
// Service service2 = (Service) itu.next();
// System.out.println("> " + service2.getName().toUpperCase());
// }
//
// }
// }
// System.out.println("");
// }
//
// public void printConversionState(SystemMSA system) {
// System.out.println(" ");
// System.out.println("Sistema a Microservice Cosi composto");
// System.out.println("Nome Sistema:" + system.getName());
// System.out.println("Available Services:");
// System.out.println(" ");
// Iterator<Service> it = system.getComposedBy().iterator();
// while (it.hasNext()) {
// Service service = it.next();
// System.out.println("The Service Name:" + service.getName().toUpperCase() + "
// Host: " + service.getHost());
//
// System.out.println("Expone " + service.getExpose().size() + " Interfaces");
// System.out.println(" ");
// Iterator<Interface> its = service.getExpose().iterator();
// while (its.hasNext()) {
// Interface interface1 = (Interface) its.next();
// System.out.println("> EndPoint:" + interface1.getEndPoint());
// System.out.println("> Nome:" + interface1.getName());
//
// Iterator<Operation> itu = interface1.getExpose().iterator();
// while (itu.hasNext()) {
// System.out.println("> Operation:");
// Operation service2 = (Operation) itu.next();
// System.out.println("> > " + service2.getName());
// }
// System.out.println(" ");
// }
// System.out.println("Consume " + service.getUse().size() + " Interfaces");
// System.out.println(" ");
// Iterator<Interface> its2 = service.getUse().iterator();
// while (its2.hasNext()) {
// Interface interface1 = (Interface) its2.next();
// System.out.println("> EndPoint:" + interface1.getEndPoint());
// System.out.println("> Nome:" + interface1.getName());
// System.out.println("> Port:" + interface1.getPort());
//
// Iterator<Operation> itu = interface1.getExpose().iterator();
// while (itu.hasNext()) {
// System.out.println("> Operation:");
// Operation service2 = (Operation) itu.next();
// System.out.println("> > " + service2.getName());
// }
// System.out.println(" ");
// }
//
// }
// System.out.println("");
//
// }
//
// public void checkInterfaceRequested(String line, Service service, Service
// source) {
//
// // TODO Auto-generated method stub
// Interface hostInterface = factory.createInterface();
// String url = line.substring(line.indexOf("/"),
// line.lastIndexOf("HTTP/1.1")).trim();
// String endPoint = null, operation = null;
// if (StringUtils.countOccurrencesOf(url, "/") >= 5) {
// endPoint = getEndPoint(url, 0).trim();
// operation = getOperation(url, 0).trim();
// if (!existInterface(service, endPoint)) {
// hostInterface.setEndPoint(endPoint.trim());
// hostInterface.setName(operation);
// hostInterface.setPort(8080);
//
// Operation operationRequested = factory.createOperation();
// operationRequested.setName(operation.substring(operation.lastIndexOf("/")));
// operationRequested.setPartOf(hostInterface);
//
// hostInterface.getExpose().add(operationRequested);
// // Host Espone hostInterface
// service.getExpose().add(hostInterface);
// // Source Usa HostInterface
// source.getUse().add(hostInterface);
// } else {
// // Aggiungere solo Operazione
// Interface tempInterface = factory.createInterface();
//
// Operation operationRequested = factory.createOperation();
// operationRequested.setName(operation.substring(operation.lastIndexOf("/")));
// operationRequested.setPartOf(hostInterface);
//
// tempInterface.getExpose().add(operationRequested);
// }
//
// } else {
//
// }
//
// }
//
// public void checkInterfaceUsed(String line, Service service, Service
// destination) {
//
// Interface destInterface = factory.createInterface();
//
// String url = line.substring(line.indexOf("/"),
// line.indexOf("HTTP/1.1")).trim();
// String endPoint = null, operation = null;
// // get the url until the 5th / symbol
// if (StringUtils.countOccurrencesOf(url, "/") >= 5) {
// endPoint = getEndPoint(url, 1);
// operation = getOperation(url, 5);
// if (!existInterface(service, endPoint)) {
// // If non esiste endPoint lo creo
// destInterface.setEndPoint(endPoint);
// destInterface.setName(operation);
// destInterface.setPort(80);
//
// Operation operationRequired = factory.createOperation();
// operationRequired.setName(operation.substring(operation.lastIndexOf("/")));
// operationRequired.setPartOf(destInterface);
//
// destInterface.getExpose().add(operationRequired);
// destInterface.setExposedBy(destination);
// service.getUse().add(destInterface);
// } else {
// // Esiste, forse devo aggiungere una operazione
// Interface temp = getInterfaceByEndPoint(service, endPoint);
// // Check Operazioni
// Operation operationOptional = factory.createOperation();
// // Se l'operazione non e' presente la aggiungo altrimenti pace
//
// }
// }
//
// }
//
// public Interface getInterfaceByEndPoint(Service service, String endPoint) {
// Iterator<Interface> it = service.getUse().iterator();
// Iterator<Interface> it2 = service.getExpose().iterator();
// while (it.hasNext()) {
// Interface tempInterface = (Interface) it.next();
// if (tempInterface.getEndPoint().trim().equals(endPoint.trim())
// || endPoint.trim().equals(tempInterface.getEndPoint().trim())) {
// return tempInterface;
// }
// }
// while (it2.hasNext()) {
// Interface tempInterface = (Interface) it2.next();
// if (tempInterface.getEndPoint().trim().equals(endPoint.trim())
// || endPoint.trim().equals(tempInterface.getEndPoint().trim())) {
// return tempInterface;
// }
// }
// return null;
//
// }
//
// public boolean existInterface(Service service, String endPoint) {
// Iterator<Interface> it = service.getUse().iterator();
// Iterator<Interface> it2 = service.getExpose().iterator();
// System.out.println("Ckeck di presenza di Interfaccia: " + endPoint + " Del
// servizio: " + service.getName());
// while (it.hasNext()) {
// Interface tempInterface = (Interface) it.next();
// System.err.println("tempInterface.getEndPoint().trim(): " +
// tempInterface.getEndPoint().trim() + " EndPoint: " + endPoint.trim());
// if (tempInterface.getEndPoint().trim().equals(endPoint.trim()) ||
// endPoint.trim().equals(tempInterface.getEndPoint().trim())) {
// System.out.println("Interface is the same");
// return true;
// }
// }
// while (it2.hasNext()) {
// Interface tempInterface = (Interface) it2.next();
// System.err.println("tempInterface.getEndPoint().trim(): " +
// tempInterface.getEndPoint().trim() + " EndPoint: " + endPoint.trim());
// if (tempInterface.getEndPoint().trim().equals(endPoint.trim()) ||
// endPoint.trim().equals(tempInterface.getEndPoint().trim())) {
// System.out.println("Interface is the same");
// return true;
// }
// }
// return false;
// }
//
// public void createDependency(String callingHost, String destinationCall,
// SystemMSA systemLogic, String logLine) {
//
// Service callingHostService = getServiceByIp(systemLogic, callingHost);
// Service destinationCallService = getServiceByIp(systemLogic,
// destinationCall);
//
// Interface destinationCallInterface = null;
// Interface callingHostInterface = null;
//
// String url = null;
// String endPoint = null, operation = null, name = null;
// int caller = 0, called = 0;
// url = logLine.substring(logLine.indexOf("/"),
// logLine.indexOf("HTTP/1.1")).trim();
// operation = getOperation(url, 5);
//
// // Crea Servizio destinatioHost
// // Crea interfaccia che verra' consumata
//
// // Check se Chiamante e Chiamato sono gia' all'interno dell'architettura
// // logica
//// System.out.println(callingHostService.getName() + " CALLS > " +
// destinationCallService.getName());
// if (StringUtils.countOccurrencesOf(url, "/") >= 2) {
// // Check Existence Interface
// endPoint = getEndPoint(url, StringUtils.countOccurrencesOf(url, "/"));
// System.out.println("EndPoint risultante: " + endPoint);
// name = getEndPoint(url,StringUtils.countOccurrencesOf(url, "/"));
// name = name.substring(name.indexOf("/"));
// System.out.println("Nome Risultante: " + name);
// if (!existInterface(destinationCallService, endPoint)) {
// destinationCallInterface = factory2.createInterface();
// destinationCallInterface.setName(name);
// destinationCallInterface.setPort(8080);
// destinationCallInterface.setEndPoint(getEndPoint(url, 4));
// } else {
// destinationCallInterface = getInterfaceByEndPoint(destinationCallService,
// endPoint);
// }
//
// destinationCallInterface.setExposedBy(destinationCallService);
//
//
// Operation calledOperation = factory2.createOperation();
// calledOperation.setPartOf(destinationCallInterface);
// calledOperation.setName(operation);
// destinationCallInterface.getExpose().add(calledOperation);
//
// destinationCallInterface.getUsedBy().add(callingHostService);
// callingHostService.getUse().add(destinationCallInterface);
//// systemLogic.getComposedBy().add(callingHostService);
//// systemLogic.getComposedBy().add(destinationCallService);
// }
//
// // Assegna i due servizi a system logic
//
// // fa consumare a callingHost
//
// }
//
// private boolean logicServiceExist(SystemMSA systemLogic, String callingHost)
// {
//
// Iterator<Service> it = systemLogic.getComposedBy().iterator();
// while (it.hasNext()) {
// Service service = (Service) it.next();
// System.out.println("Service: " + service + " ");
// if (service.getHost().trim().equals(callingHost.trim())
// || callingHost.trim().equals(service.getHost().trim())) {
// System.out.println("Service: " + service + " already existem");
// return true;
// }
// }
// return false;
// }
//
// public Service getServiceByIp(SystemMSA systemArchitecture, String serviceIP)
// {
//
// Iterator<Service> it = systemArchitecture.getComposedBy().iterator();
// while (it.hasNext()) {
// Service service = (Service) it.next();
// if (service != null && (service.getHost().trim().equals(serviceIP.trim())
// || serviceIP.trim().equals(service.getHost().trim()))) {
// return service;
// } else {
//
// }
// }
// System.out.println();
// return factory.createService();
// }
//
//
// private String getEndPoint(String line, int times) {
// int occurence = 0;
// int index = 0;
// String endPoint = null;
// System.out.println("Arrivata la Stringa :" + line);
// switch (StringUtils.countOccurrencesOf(line, "/")) {
// case 1:
// return line;
// case 2:
// return line;
// case 3:
// return line;
// case 4:
// // caso /container/rest/api/interface no paramenter
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 3) {
// endPoint = line.substring(0, i);
// return endPoint;
// }
// }
// }
//
// case 5:
// // caso /servizio/container/rest/api/interface
// // if (times == 1) {
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 5) {
// endPoint = line.substring(0, i);
// return endPoint;
// }
// }
// }
//
// case 6:
// // if (times == 1) {
// // caso /servizio/container/rest/api/interface/metodo
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 6) {
// endPoint = line.substring(0, i);
// return endPoint;
// }
// }
// }
//
// case 7:
// // caso /servizio/container/rest/api/interface/metodo/parametri
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 6) {
// endPoint = line.substring(0, i-1);
// return endPoint;
// }
// }
// }
// default:
// return line;
// }
//
// }
//
// private String getOperation(String line, int times) {
// int occurence = 0;
// int index = 0;
// String operation = null;
// switch (StringUtils.countOccurrencesOf(line, "/")) {
// case 4:
// case 5:
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 4) {
// index = i;
// operation = line.substring(i);
// return operation;
// }
// }
// }
// case 6:
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 5) {
// index = i;
// operation = line.substring(i);
// return operation;
// }
// }
// }
// case 7:
// for (int i = 0; i < line.length(); i++) {
// char cr = line.charAt(i);
// if (cr == '/') {
// occurence++;
// if (occurence == 6) {
// index = i;
// operation = line.substring(6);
// return operation;
// }
// }
// }
// default:
// return line;
//
// }
//
// }
//
// }
