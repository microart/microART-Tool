package MicroservicesArchitecture.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ServiceDiscoveryListener {

	static File serviceDiscoveryFile;
	static String path = System.getProperty("user.home") + File.separator + "ArchitectureRecovery";
	static String filename = path + File.separator + "info.txt";

	public static void createDirectoryAndFile() {
		System.out.println("Try to create directory and file");
		serviceDiscoveryFile = new File(path);
		File customDir = new File(path);

		if (customDir.exists()) {
			System.out.println(customDir + " already exists");
		} else if (customDir.mkdirs()) {
			System.out.println(customDir + " was created");
		} else {
			System.out.println(customDir + " was not created");
		}
		File info = new File(filename);
		try {
			info.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writeServiceDiscovery(String serviceDiscoveryIP) {
		System.out.println("YOP");
		BufferedWriter writer = null;
		try {

			File logFile = new File(filename);
			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write(serviceDiscoveryIP);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close the writer regardless of what happens...
				writer.close();
			} catch (Exception e) {
			}
		}
	}
}
