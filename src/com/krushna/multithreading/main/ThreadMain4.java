package com.krushna.multithreading.main;

import com.krushna.multithreading.thread.MyThread4;

public class ThreadMain4 {

	public static void main(String[] args) {
		MyThread4 myThread4 = new MyThread4();
		Thread thread = new Thread(myThread4);
		thread.setName("Thread");
		thread.setPriority(2);
		thread.start();
	}
}
