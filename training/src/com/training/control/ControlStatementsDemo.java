package com.training.control;

public class ControlStatementsDemo {
	public static void main(String[] args) {
		int a = 1;
		if (a == 0) {
			System.out.println("Neither Even Nor Odd");
		} else if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		System.out.println("Using Conditional Operator");
		String result = (a == 0) ? "Neither Even Nor Odd" : (a % 2 == 0 ? "Even" : "Odd");
		System.out.println(result);
		System.out.println("Using Switch Case");
		int choice = a % 2;
		switch (choice) {
		case 0:
			if (a == 0) {
				System.out.println("Neither Even Nor Odd");
			} else {
				System.out.println("Even");
			}
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Neither Even Nor Odd");
			break;
		}
		int[] arr = { 1, 20, 0, 4 };
		int len = arr.length;// 4
		int i = 0;
		System.out.println("Using While");
		// 0(T),1(T),2(T),3(T),4(F)
		while (i < len) {
			System.out.println(arr[i]);
			if (arr[i] == 0) {
				System.out.println("Neither Even Nor Odd");
			} else if (arr[i] % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
			i++;
		}

		System.out.println("Using For");
		for (int j = 0; j < len; j++) {
			System.out.println(arr[j]);
			if (arr[j] == 0) {
				System.out.println("Neither Even Nor Odd");
			} else if (arr[j] % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

		System.out.println("Using For Each");
		for (int t : arr) {
			System.out.println(t);
			if (t == 0) {
				System.out.println("Neither Even Nor Odd");
			} else if (t % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

		System.out.println("Using Do While");
		int k = 0;
		do {
			System.out.println(arr[k]);
			if (arr[k] == 0) {
				System.out.println("Neither Even Nor Odd");
			} else if (arr[k] % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
			k++;
		} while (k < len);
	}

}
