package com.krushna.multithreading.main;

import com.krushna.multithreading.thread.MyThread;

public class ThreadMain1 {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
	}
}
