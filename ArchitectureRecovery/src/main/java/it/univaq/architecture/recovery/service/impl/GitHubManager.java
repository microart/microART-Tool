package it.univaq.architecture.recovery.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jgit.api.CreateBranchCommand.SetupUpstreamMode;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Service;

import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.Product;
import it.univaq.architecture.recovery.configuration.Config;
import it.univaq.architecture.recovery.model.GitCommitCustom;
import it.univaq.architecture.recovery.model.MicroserviceArch;
import it.univaq.architecture.recovery.service.RepositoryManager;

@Service
public class GitHubManager implements RepositoryManager {

	private String localPath, remotePath;
	private Repository localRepo;
	private Git git;
	private MSALoaderImpl factory = new MSALoaderImpl();
	private Config config;
	public GitHubManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GitHubManager(String localPath, String remotePath) {
		super();
		this.localPath = localPath;
		this.remotePath = remotePath;
	}

	@Before
	public Git init() throws IOException {
		// localPath = "/home/grankellowsky/Tesi/Codice/prova";
		// remotePath = "https://github.com/yanglei99/acmeair-nodejs.git";
		// remotePath = "git@github.com:me/mytestrepo.git";
		this.localRepo = new FileRepository(this.localPath + "/.git");
		this.git = new Git(this.localRepo);
		return this.git;
	}

	@Test
	public void testCreate() throws IOException {
		Repository newRepo = new FileRepository(localPath + ".git");
		newRepo.create();
		newRepo.close();
	}

	@Test
	public void testClone() throws IOException, GitAPIException {
		Git.cloneRepository().setURI(remotePath).setDirectory(new File(localPath)).call();
	}

	@Test
	public void testAdd() throws IOException, GitAPIException {
		File myfile = new File(localPath + "/myfile");
		myfile.createNewFile();
		git.add().addFilepattern("myfile").call();
	}

	@Test
	public void testCommit() throws IOException, GitAPIException, JGitInternalException {
		git.commit().setMessage("Added myfile").call();
	}

	@Test
	public void testPush() throws IOException, JGitInternalException, GitAPIException {
		git.push().call();
	}

	@Test
	public void testTrackMaster() throws IOException, JGitInternalException, GitAPIException {
		git.branchCreate().setName("master").setUpstreamMode(SetupUpstreamMode.SET_UPSTREAM)
				.setStartPoint("origin/master").setForce(true).call();
	}

	@Test
	public void testPull() throws IOException, GitAPIException {
		git.pull().call();
	}

	public EList<Developer> getCommits() throws NoHeadException, GitAPIException {
		EList<Developer> devs = new BasicEList<Developer>();
		LogCommand log = git.log();
		Iterable<RevCommit> commits = log.call();
		Iterator<RevCommit> it = commits.iterator();
		while (it.hasNext()) {
			RevCommit revCommit = (RevCommit) it.next();
			Developer dev = factory.createDeveloper();
			dev.setName(revCommit.getAuthorIdent().getName());
			dev.setEmail(revCommit.getAuthorIdent().getEmailAddress());
			// dev.setUsername(revCommit.getName());
			if (!exist(devs, dev)) {
				devs.add(dev);
			}

		}
		return devs;

	}

	public List<GitCommitCustom> assignDevToTeam(Product products) throws IOException, InterruptedException {
		Process p;
		String s = null;
		String[] logs = new String[100000];
		String command = config.getGitPath() + " log --numstat";
		// System.out.println(command);
		p = Runtime.getRuntime().exec(command, new String[0], new File(localPath));
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		int i = 0;
		List<GitCommitCustom> commits = new ArrayList<GitCommitCustom>();
		while ((s = br.readLine()) != null) {
			// System.out.println(i + " => " + s);
			if (s.equals("") || s.equals(" ")) {
				continue;
			} else {
				logs[i] = s;
				i++;
			}

		}
		// System.out.println("I is equal to " +i);
		i--;
		String[] fittedArray = new String[i];
		fittedArray = Arrays.copyOf(logs, i);
		// System.out.println("I is equal to " +i);
		p.waitFor();
		p.destroy();
		extractCommitInfos(fittedArray, commits, products);
//		collapseDeveloper(products);
		return commits;
	}


	private void extractCommitInfos(String[] logs, List<GitCommitCustom> commits, Product products) {

		for (int i = 0; i < logs.length; i++) {
			GitCommitCustom customsCommit = new GitCommitCustom();
			if (logs[i].contains("commit")) {
				customsCommit.setCommitId(logs[i].substring(7).toString().trim());
				i++;
			}
			if (logs[i].contains("Author")) {
				customsCommit.setAuthor(logs[i].substring(8, logs[i].indexOf("<")).toString().trim());
				customsCommit.setEmail(logs[i].substring(logs[i].indexOf("<") + 1, logs[i].indexOf(">")));
				i++;
			}
			if (logs[i].contains("Date:")) {
				customsCommit.setDate(logs[i].substring(5).toString().trim());
				i++;
			}
			 while (!Character.isDigit(logs[i].charAt(0))) {
				if (customsCommit.getMessage() != null) {
					customsCommit.setMessage(customsCommit.getMessage().concat(logs[i]));
				}else{
					customsCommit.setMessage(logs[i]);
				}
				
				i++;

			}
			while (i < logs.length && !logs[i].contains("commit")) {
				String temp = logs[i];
				if (temp.equals(null)) {
					
				} else {
					String extractedFilePathName = extractioFilePathName(temp);
					customsCommit.addFiles(extractedFilePathName);
					i++;
				}
			}



			commits.add(customsCommit);
			if (i < logs.length && logs[i].contains("commit")) {
				i--;
			}

		}

//		Iterator<GitCommitCustom> it = commits.iterator();
//		while (it.hasNext()) {
//			GitCommitCustom customCommit = (GitCommitCustom) it.next();
//
//			System.out.println("\n Analysis of Commits");
//			System.out.println("Commit: " + customCommit.getCommitId() + " \n Autore: " + customCommit.getAuthor()
//					+ " \n Email : " + customCommit.getEmail() + " \n Data  : " + customCommit.getDate()
//					+ " \n Mess  : " + customCommit.getMessage() + " \n");
//			Iterator<String> filepathname = customCommit.getFiles().iterator();
//			System.out.println("\n Filenamed Changed\n");
//			while (filepathname.hasNext()) {
//				String string = (String) filepathname.next();
//				System.out.println(string);
//			}
//
//		}
	}

	private String extractioFilePathName(String temp) {
		// TODO Auto-generated method stub
		int size = temp.length();
		for (int i = 0; i < size; i++) {
			if (Character.isLetter(temp.charAt(i))) {
				String result = temp.substring(i);
				return result;
			}
		}
		return ".";
	}

	public static boolean check(String input) {
		// ^[0-9]*\s[a-z]*$
		// "\\d+\\s*\\d+ +.*"
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		Scanner in = new Scanner(regex).useDelimiter("\\d+\\s*\\d+ +.*");
		Matcher matcher = pattern.matcher(input);
		
		MatchResult match = in.match();
		
		if (matcher.matches()){
			
			return true;
		}else{
			
			return false;
		}
	}

	private boolean exist(EList<Developer> devs, Developer dev) {

		Iterator<Developer> it = devs.iterator();
		while (it.hasNext()) {
			Developer temp = (Developer) it.next();
			if (temp.getEmail().substring(0,temp.getEmail().indexOf("@")).contains(dev.getEmail().substring(0, dev.getEmail().indexOf("@")))) {
				return true;
			}

		}
		return false;
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

	public void crossedCheckCommitsDevs(MicroserviceArch microServicesArch, Product product,
			List<GitCommitCustom> commits) {

		Iterator<MicroService> services = product.getComposedBy().iterator();

		while (services.hasNext()) {

			MicroService microService = (MicroService) services.next();
			Iterator<GitCommitCustom> customCommits = commits.iterator();
			while (customCommits.hasNext()) {

				GitCommitCustom gitCommitCustom = (GitCommitCustom) customCommits.next();
				Developer tempDev = getDevFromCommit(gitCommitCustom, product.getDevelopers());
				if (product.getDevelopers().contains(tempDev)) {
					getDevForService(gitCommitCustom, microService, tempDev);
				}

			}
		}

		// Iterator<Developer> devs = product.getDevelopers().iterator();
		// Iterator<Team> teams = product.getTeams().iterator();

	}

	private void getDevForService(GitCommitCustom gitCommitCustom, MicroService microService, Developer tempDev) {

		List<String> paths = gitCommitCustom.getFiles();
		Iterator<String> it = paths.iterator();
		EList<Developer> eList = new BasicEList<Developer>();
		while (it.hasNext()) {

			String string = (String) it.next();
			String compareString = null;
			if (microService.getName().indexOf("_") == -1) {
				compareString = microService.getName();
			} else {
				compareString = microService.getName().substring(0, microService.getName().indexOf("_"));
			}
			if (string.contains(compareString)) {
				
				eList.add(tempDev);
			}
		}
		if (eList.size() > 0) {
			microService.getOwned().getComposedBy().clear();
			microService.getOwned().getComposedBy().addAll(eList);
		}

	}

	private Developer getDevFromCommit(GitCommitCustom gitCommitCustom, EList<Developer> eList) {
		Iterator<Developer> it = eList.iterator();
		while (it.hasNext()) {
			Developer developer = (Developer) it.next();
			if (gitCommitCustom.getEmail() != null) {
				if (developer.getEmail().substring(0,developer.getEmail().indexOf("@") ).contains(gitCommitCustom.getEmail().substring(0,gitCommitCustom.getEmail().indexOf("@"))) ) {
//					System.out.println(developer.getEmail().substring(0,developer.getEmail().indexOf("@") ) +" compared to " + (gitCommitCustom.getEmail().substring(0,gitCommitCustom.getEmail().indexOf("@"))));
					return developer;
				}
			}

		}
//		System.out.println("dev not found " + gitCommitCustom.getEmail() + " " +gitCommitCustom.getAuthor());
		Developer tempDev = factory.createDeveloper();
		tempDev.setEmail(gitCommitCustom.getEmail());
		tempDev.setName(gitCommitCustom.getAuthor());
		// tempDev.setUsername(gitCommitCustom.get);
		return tempDev;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

}
