package it.univaq.architecture.recovery.service;

import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryManager {

	public Git init() throws IOException;
	public void testClone() throws IOException, GitAPIException;
	
	public void setLocalPath(String localPath);
	public String getLocalPath();
	
	public String getRemotePath();
	public void setRemotePath(String remotePath);
	
	public Repository getLocalRepo();
	public void setLocalRepo(Repository localRepo);
}
