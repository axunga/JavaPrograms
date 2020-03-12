package com.Threads.model;

public class MultiThreadingUsingInterface implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Threads " + Thread.currentThread().getId() + " runnig using Runnable interface");
		}catch(Exception e) {
			System.out.println("Something goes wrong");
		}
	}
	
}
