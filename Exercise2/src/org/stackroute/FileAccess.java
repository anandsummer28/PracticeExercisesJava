package org.stackroute;

import java.io.File;

public class FileAccess {
	
	
	public void getAllFiles() {

		File folder = new File("/home/summer/Downloads");
		File[] listOfFiles = folder.listFiles();
		
		for(int i=0; i<listOfFiles.length; ++i) {
			if(listOfFiles[i].isFile()) {
				System.out.println("File "+ listOfFiles[i].getName());
			}
		}
	
	}
	
	public static void main(String[] args) {
		FileAccess fileaccess = new FileAccess();
		fileaccess.getAllFiles();
	}
}
