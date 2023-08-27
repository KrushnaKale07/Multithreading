package com.krushna.multithreading.main;

import com.krushna.multithreading.thread.MyThread;
import com.krushna.multithreading.thread.MyThread3;

public class ThreadMain3 {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		myThread3.setName("MyThread3");
		myThread3.setPriority(7);
//		System.out.println("Name of the thread"+myThread3.getName());
//		System.out.println("Priority of the thread"+myThread3.getPriority());
		myThread3.start();
	}

}
