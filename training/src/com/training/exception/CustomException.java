package com.training.exception;

public class CustomException {
	public static void main(String[] args) {
		try {
			validateId();
		} catch (InvalidIdException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void validateId() throws InvalidIdException {
		int id = -10;
		if (id <= 0) {

			InvalidIdException iie = new InvalidIdException("Please Enter Valid Id");
			throw iie;

		} else {
			System.out.println("You have entered correct id");
		}
	}

}
