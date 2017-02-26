package it.univaq.architecture.recovery.service.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.CreateBranchCommand.SetupUpstreamMode;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.junit.Before;
import org.junit.Test;

public class TestJGit {

	private String localPath, remotePath;
    private Repository localRepo;
    private Git git;
    
    

    public TestJGit(String localPath, String remotePath) {
		super();
		this.localPath = localPath;
		this.remotePath = remotePath;
	}

	@Before
    public Git init() throws IOException {
//        localPath = "/home/grankellowsky/Tesi/Codice/prova";
//        remotePath = "https://github.com/yanglei99/acmeair-nodejs.git";
        //remotePath = "git@github.com:me/mytestrepo.git";
        this.localRepo = new FileRepository(this.localPath + "/.git");
        this.git = new Git(this.localRepo);
        return this.git;
    }

    @Test
    public void testCreate() throws IOException {
        Repository newRepo = new FileRepository(localPath + ".git");
        newRepo.create();
    }

    @Test
    public void testClone() throws IOException, GitAPIException {
        Git.cloneRepository().setURI(remotePath)
                .setDirectory(new File(localPath)).call();
    }

    @Test
    public void testAdd() throws IOException, GitAPIException {
        File myfile = new File(localPath + "/myfile");
        myfile.createNewFile();
        git.add().addFilepattern("myfile").call();
    }

    @Test
    public void testCommit() throws IOException, GitAPIException,
            JGitInternalException {
        git.commit().setMessage("Added myfile").call();
    }

    @Test
    public void testPush() throws IOException, JGitInternalException,
            GitAPIException {
        git.push().call();
    }

    @Test
    public void testTrackMaster() throws IOException, JGitInternalException,
            GitAPIException {
        git.branchCreate().setName("master")
                .setUpstreamMode(SetupUpstreamMode.SET_UPSTREAM)
                .setStartPoint("origin/master").setForce(true).call();
    }

    @Test
    public void testPull() throws IOException, GitAPIException {
        git.pull().call();
    }

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public String getRemotePath() {
		return remotePath;
	}

	public void setRemotePath(String remotePath) {
		this.remotePath = remotePath;
	}

	public Repository getLocalRepo() {
		return localRepo;
	}

	public void setLocalRepo(Repository localRepo) {
		this.localRepo = localRepo;
	}

	public Git getGit() {
		return git;
	}

	public void setGit(Git git) {
		this.git = git;
	}
    
}
