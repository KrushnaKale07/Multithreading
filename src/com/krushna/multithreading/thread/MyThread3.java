package com.krushna.multithreading.thread;

public class MyThread3 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread name = "+getName());
		System.out.println("Thread priority "+getPriority());
		System.out.println("MyThread3 is running ");
	}
}
