package com.capgemini.shrijit.lab8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author genesis
 *
 */

public class ThreadTimer implements Runnable{
	
	// synchronized display method to display the present time 
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		System.out.print("Time Now : ");
		while(true) {
			try {
				display();
				Thread.sleep(5000);
				System.out.print("Time after 5 seconds : ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
  //main method
	public static void main(String[] args) {
    
		ThreadTimer threadtimer=new ThreadTimer();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}
