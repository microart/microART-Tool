package it.univaq.architecture.recovery.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.Interface;
import MicroservicesArchitecture.Link;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitectureFactory;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;
import MicroservicesArchitecture.Product;
import MicroservicesArchitecture.Team;
import MicroservicesArchitecture.serviceType;
import MicroservicesArchitecture.impl.MicroservicesArchitectureFactoryImpl;
import it.univaq.architecture.recovery.service.MSALoader;

public class MSALoaderImpl implements MSALoader {

	MicroservicesArchitectureFactoryImpl factory = new MicroservicesArchitectureFactoryImpl();

	public void Loader() {
		EFactory factory = MicroservicesArchitecturePackage.eINSTANCE.getEFactoryInstance();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("microservicesarchitecture", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI("src/main/model/acmeair.microservicesarchitecture"), true);
	}

	public Product createProduct() {
		return factory.createProduct();
	}

	public MicroService createMicroService() {
		return factory.createMicroService();
	}

	public Interface createInterface() {
		return factory.createInterface();
	}

	public Link createLink() {
		return factory.createLink();
	}

	public Team createTeam() {
		return factory.createTeam();
	}

	public Developer createDeveloper() {
		return factory.createDeveloper();
	}

	public void getModel(String path) {

	}

	public void saveModel(Product product, String url, String modelName) {

		MicroservicesArchitectureFactoryImpl.init();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("microservicesarchitecture", new XMIResourceFactoryImpl());
		m.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(url + modelName));
		printProduct(product);
		resource.getContents().add(product);
		
		// now save the content.
		try {
			resource.save(m);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printProduct(Product product) {
		
		System.out.println(product.toString());
		System.out.println(product.getComposedBy().toString());
		
	}

	public Product getModel(String pathToSaveModel, String nameOfTheModel) throws IOException {
		// TODO Auto-generated method stub

		MicroservicesArchitectureFactoryImpl.init();

		// Register the XMI resource factory for the .website extension
		EPackage.Registry.INSTANCE.put(MicroservicesArchitecturePackage.eNS_URI, MicroservicesArchitecturePackage.eINSTANCE);
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(MicroservicesArchitecturePackage.);
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("microservicesarchitecture", new XMIResourceFactoryImpl());
		m.put(XMLResource.OPTION_ENCODING, "UTF-8");
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
//		File source = new File(pathToSaveModel + nameOfTheModel);
//		File destination = new File(System.getProperty("user.home") + File.separator + "ArchitectureRecovery" + File.separator + nameOfTheModel);
//		copyFile(source, destination);

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(pathToSaveModel + nameOfTheModel), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Product prd = (Product) resource.getContents().get(0);

		return prd;
	}

	public String getServiceDiscovery(Product product) {
		String serviceDiscovery = "NoServiceDiscovery";
//		System.out.println(serviceType.SERVICE_DISCOVERY);
		Iterator<MicroService> it = product.getComposedBy().iterator();
		while (it.hasNext()) {
			MicroService microService = (MicroService) it.next();
				if (microService.getType().equals(serviceType.SERVICE_BROKERING)) {
					serviceDiscovery = microService.getHost();
					return serviceDiscovery;
				}
		}

		return serviceDiscovery;
	}
	
	private void copyFile(File source, File dest)
			throws IOException {
		if (dest.exists()) {
			Path path = dest.toPath();
			Files.delete(path);
			dest = new File(path.toString());
		}
		Files.copy(source.toPath(), dest.toPath());
	}
}
