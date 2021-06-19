package com.training.abstractdemo;

public abstract class Book {
	Book(){
		System.out.println("I am a Book");
	}
	int id;
	static int j;
	void print() {}
	static void review() {}
	abstract String read();
}
