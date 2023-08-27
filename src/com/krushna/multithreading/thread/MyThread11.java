package com.krushna.multithreading.thread;

import java.util.Iterator;

public class MyThread11 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("MyThread11 is runnng now");
		}
	}
}
