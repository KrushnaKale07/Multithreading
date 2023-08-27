package com.krushna.multithreading.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThread2 is running");
		sum();
	}
	
	public void sum() {
		System.out.println("Sum method called");
		
	}
}
