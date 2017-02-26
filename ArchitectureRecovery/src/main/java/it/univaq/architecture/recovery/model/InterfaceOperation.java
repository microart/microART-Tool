package it.univaq.architecture.recovery.model;

import java.util.List;

public class InterfaceOperation {

	private String method;
	
	private String returnType;
	
	private List<String> paramenters;
	
	private boolean aSync;

	public InterfaceOperation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public List<String> getParamenters() {
		return paramenters;
	}

	public void setParamenters(List<String> paramenters) {
		this.paramenters = paramenters;
	}

	public boolean isaSync() {
		return aSync;
	}

	public void setaSync(boolean aSync) {
		this.aSync = aSync;
	}
	
	
	
	
}
