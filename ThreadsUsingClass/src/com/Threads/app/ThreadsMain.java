package com.Threads.app;

import com.Threads.model.MultiThreadingUsingClass;
import com.Threads.model.MultiThreadingUsingInterface;

public class ThreadsMain {

	public static void main(String[] args) {
		
		int ThreadsQuantity = 10;
		
		//Using Thread Class
		for(int i=0 ; i<ThreadsQuantity ; i++) {
			MultiThreadingUsingClass classThread = new MultiThreadingUsingClass();
			classThread.start();
			
			MultiThreadingUsingInterface it = new MultiThreadingUsingInterface();
			Thread interfaceThread = new Thread(it);
			interfaceThread.start();
		}

	}

}
