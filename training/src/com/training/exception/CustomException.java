package com.training.exception;

public class CustomException {
	public static void main(String[] args) {

		int id = 10;
		if (id <= 0) {
			try {
				InvalidIdException iie = new InvalidIdException("Please Enter Valid Id");
				throw iie;
			} catch (InvalidIdException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("You have entered correct id");
		}

	}

}
