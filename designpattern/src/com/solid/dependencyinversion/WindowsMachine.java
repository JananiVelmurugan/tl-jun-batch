package com.solid.dependencyinversion;

public class WindowsMachine {

	public Keyboard keyboard;
	public Monitor monitor;

	// tightly coupled - three tightly coupled instances
//	public WindowsMachine() {
//		keyboard = new Keyboard();
//		monitor = new Monitor();
//	}

	// loosely coupled code
	public WindowsMachine(Keyboard keyboard, Monitor monitor) {

		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}
