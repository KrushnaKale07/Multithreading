package com.krushna.multithreading.thread;

public class MyThread5 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i%2 !=0) {
				System.out.println("Odd index at "+ i + " " +getName() + " is run");
			}
		}
	}

}