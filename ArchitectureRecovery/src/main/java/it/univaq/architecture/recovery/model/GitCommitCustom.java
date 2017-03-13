package it.univaq.architecture.recovery.model;

import java.util.ArrayList;
import java.util.List;

public class GitCommitCustom {

	String commitId;
	String date;
	String author;
	String email;
	String message;
	List<String> files;
	
	
	public GitCommitCustom() {
		super();
		files = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
	public String getCommitId() {
		return commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getFiles() {
		return files;
	}
	public void setFiles(List<String> files) {
		this.files = files;
	}
	
	public void addFiles(String pathFilename){
		this.files.add(pathFilename);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
