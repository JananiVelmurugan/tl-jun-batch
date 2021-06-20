package com.training.java5;

public enum Day {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
	private final int d;

	Day(int d) {
		this.d = d;
	}

	private int d() {
		return d;
	}
}