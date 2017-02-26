package it.univaq.architecture.recovery.service.impl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.Product;
import it.univaq.architecture.recovery.model.PseudoMicroService;

public class Converter {

	public static MSALoaderImpl factory;

	public Converter() {
		super();
		factory = new MSALoaderImpl();
	}

	public static Product createProduct(List<PseudoMicroService> services, String Client) {
		Product product = factory.createProduct();
		Iterator<PseudoMicroService> it = services.iterator();
		EList<MicroService> tempList = new BasicEList<MicroService>();
		while (it.hasNext()) {
			PseudoMicroService pseudoMicroService = (PseudoMicroService) it.next();
			MicroService temp = factory.createMicroService();
			temp.setName(pseudoMicroService.getName().trim());
			temp.setHost(pseudoMicroService.getIp().trim());
			tempList.add(temp);
		}
		// Creazione Client
		MicroService client = factory.createMicroService();
		client.setName("Client-User");
		client.setHost(Client);
		tempList.add(client);
		product.getComposedBy().addAll(tempList);
		System.out.println(" ");
		return product;
	}

	public EList<MicroService> getMicroservices() {

		return null;
	}

	public MicroService getMicroservice() {

		return null;
	}

}
