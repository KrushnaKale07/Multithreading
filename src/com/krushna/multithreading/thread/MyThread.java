package com.krushna.multithreading.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My thread is running");
		}

	}
}
