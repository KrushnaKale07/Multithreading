package com.krushna.multithreading.thread;

public class MyThread5 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println(getName() + " is run");
			}
		}
	}

}
