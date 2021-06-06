package com.capgemini.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
* @author genesis
*/
public class CopyDataThread extends Thread{
	
	File source;
	File target;
	
	public CopyDataThread(File source,File target) {
		this.source=source;
		this.target=target;
	}
	
	public void run() {
		FileInputStream input = null;
		try {
			input = new FileInputStream(source);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    
    
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(target);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    
    
		int counter=0;
		int characters=0;
		
    try {
			while((characters=input.read())>0) {
				output.write((char)characters);
				counter++;
				if(counter%10==0) {
				try {
					System.out.println("10 characters copied");
					Thread.sleep(3000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
