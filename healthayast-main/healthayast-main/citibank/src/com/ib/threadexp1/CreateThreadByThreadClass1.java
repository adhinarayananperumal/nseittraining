package com.ib.threadexp1;

public class CreateThreadByThreadClass1 extends Thread {

	public void run() {
		System.out.println("Thread 1 line1 thread class");
		System.out.println("Thread 1 CreateThreadByRunnableInterfaceProcessFeedFile2 thread is running...");
		System.out.println("Thread 1 line3");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 line4");
		System.out.println("Thread 1 line5  end of run() method  - thread ended ");
	}

}
