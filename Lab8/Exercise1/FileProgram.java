package com.capgemini.lab8;

import java.io.File;

public class FileProgram {

	public static void main(String args[]) {
    
    // initializing the source file
		File file_source=new File("D:\\EclipseProjects\\Lab_Programs\\src\\com\\capgemini\\lab8\\source.txt"); 
    
    // initializing the target file
		File file_target=new File("D:\\CapgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\shrijit\\lab8\\target.txt"); 
		CopyDataThread ct = new CopyDataThread(file_source,file_target);
		ct.start();
	}

}
