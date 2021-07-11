package com.training;

public class Calculator {

	public int add(int i, int j) {
		if (i == 0) {
			i += 10;
		}
		if (j == 0) {
			j += 10;
		}
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}
}
