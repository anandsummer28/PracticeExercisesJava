package org.stackroute.exercisetwo;

import java.io.*;

public class FileReading {

    public static void changeToUpperCases() {
    	
    	FileReader fr;
        BufferedReader br;
        String s;
        
		try {
			fr = new FileReader("/home/summer/workspace/Testfiles/testfile.txt");
			br = new BufferedReader(fr);
			
			while((s = br.readLine())!= null)
			{
				System.out.println(s.toUpperCase());
			}
		}
		catch(FileNotFoundException e1) {
	        System.out.println("File was not found!");
	    }
	    catch(IOException e2) {
	        System.out.println("No file found!");
	    }
    }
    
    public static void main(String[] args) {
    	changeToUpperCases();
    }
}

