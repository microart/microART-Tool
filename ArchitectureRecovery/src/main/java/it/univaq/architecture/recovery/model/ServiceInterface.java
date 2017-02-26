package it.univaq.architecture.recovery.model;

import java.util.List;

public class ServiceInterface {

	private String endPoint;
	
	private List<Integer> ports;
	
	private List<InterfaceOperation> operations;

	public ServiceInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public List<Integer> getPorts() {
		return ports;
	}

	public void setPorts(List<Integer> ports) {
		this.ports = ports;
	}

	public List<InterfaceOperation> getOperations() {
		return operations;
	}

	public void setOperations(List<InterfaceOperation> operations) {
		this.operations = operations;
	}
	
	
}
