package com.training.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		// array initialization with values
		int[] num = { 10, 20, 30 };// int[] num = new int[3];// 0,1,2
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;

		// array declaration with size
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;

		arr = new int[50];
		int[] a = new int[] { 10, 20, 30 };
		int[] b;
//		System.out.println(b);
		
		int[][] matrix = new int[2][3];
		matrix[0][0] = 10;
		System.out.println(num);
		for (int t : num) {
			System.out.println(t);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
