package com.training.general;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) throws IOException, InterruptedException {
//		Runtime obj = new Runtime();
		Runtime obj = Runtime.getRuntime();
//		obj.addShutdownHook(new Thread() {
//			
//			@Override
//			public void run() {
//				System.out.println("JVM is shutting down");
//				
//			}
//		});
		ThreadTest test = new ThreadTest();
		obj.addShutdownHook(test);
		System.out.println(obj.totalMemory());
		System.out.println(obj.availableProcessors());
		System.out.println(obj.freeMemory());
		System.out.println(obj.maxMemory());
		Process process = obj.exec("notepad");
//		process.waitFor();

	}

}
