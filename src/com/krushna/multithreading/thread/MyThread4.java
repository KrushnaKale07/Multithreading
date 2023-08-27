package com.krushna.multithreading.thread;

public class MyThread4 implements Runnable {

	@Override
	public void run() {
		System.out.println("Name of the thread "+Thread.currentThread().getName());
		System.out.println("Priority of the thread "+Thread.currentThread().getPriority());
	}
	
}