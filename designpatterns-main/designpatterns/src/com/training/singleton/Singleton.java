package com.training.singleton;

// until JDK 1.4 
// JDK 1.5 and above use enums for singleton object 

public final class Singleton {
	private static volatile Singleton instance;
	String value = "";

	private Singleton(String value) {
		this.value = value;
	}

	public static Singleton getInstance(String value) {
		synchronized (Singleton.class) {

			if (instance == null) {
				instance = new Singleton(value);
			}
		}

		return instance;
	}              
}
