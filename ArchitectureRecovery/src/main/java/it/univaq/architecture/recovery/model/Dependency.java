package it.univaq.architecture.recovery.model;

import java.util.List;

public class Dependency {

	//Le Sue Dipendenze
	List<PseudoMicroService> dependOn;
	//Chi dipende da lui
	List<PseudoMicroService> dependent;
	
	
	public List<PseudoMicroService> getDependOn() {
		return dependOn;
	}
	public void setDependOn(List<PseudoMicroService> dependOn) {
		this.dependOn = dependOn;
	}
	public List<PseudoMicroService> getDependent() {
		return dependent;
	}
	public void setDependent(List<PseudoMicroService> dependent) {
		this.dependent = dependent;
	}
	
	public void addDependency(PseudoMicroService dependOn){
		this.dependOn.add(dependOn);
	}
	
	public void addDependent(PseudoMicroService dependent){
		this.dependent.add(dependent);
	}
	
}
