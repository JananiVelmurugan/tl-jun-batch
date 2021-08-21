package com.training.springbootdemo.user;

public class UserNotFoundException extends Exception {
	public UserNotFoundException(String msg) {
		System.out.println(msg);
	}
}
