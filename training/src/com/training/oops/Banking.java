package com.training.oops;


public class Banking {

	void login(int id, String password) {
		System.out.println("Logging in using id and password");
	}

	void login(long mobileNumber) {
		System.out.println("Logging in using mobile number");
	}

	void login() {
		
	}

	public static void main(String[] args) {
		Banking account = new Banking();
		account.login();
		account.login(9600020028l);
		account.login(123, "der");
	}

}
