package com.krushna.multithreading.main;

import com.krushna.multithreading.thread.MyThread;
//import com.krushna.multithreading.thread.MyThread11;
import com.krushna.multithreading.thread.MyThread2;

public class ThreadMain11 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread("myThread2");

		myThread.start();
		thread.start();

	}

}
