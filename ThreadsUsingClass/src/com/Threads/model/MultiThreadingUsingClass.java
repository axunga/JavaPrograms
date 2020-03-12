package com.Threads.model;

public class MultiThreadingUsingClass extends Thread {
	
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " running using Thread class");
		}catch(Exception e){			
			System.out.println("Something goes wrong");
		}
	
	}
}
