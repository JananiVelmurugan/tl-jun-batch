package com.training.general;

import java.util.Map;
import java.util.Scanner;

public class SystemTest {
	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter id");
//		int id = scanner.nextInt();
//		System.out.println("Enter name");
//		String name = scanner.next();
//		System.out.println("Enter gender");
//		char ch = scanner.next().charAt(0);
//
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(ch);
//
//		int[] array = new int[10];
//		array[0] = 1;
//		array[1] = 2;
//		array[2] = 3;
//		array[3] = 4;
		int[] array = {1,2,3,4,5};
		System.out.println(array.length);
		long start, startNano;
		long end, endNano;

		System.out.println("Using Simple For");
		start = System.currentTimeMillis();
		startNano = System.nanoTime();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		endNano = System.nanoTime();
		end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(endNano - startNano);

		System.out.println("Using For Each");
		start = System.currentTimeMillis();
		startNano = System.nanoTime();
		for (int i : array) {
			System.out.println(i);
		}
		end = System.currentTimeMillis();
		endNano = System.nanoTime();
		System.out.println(end - start);
		System.out.println(endNano - startNano);
		Map<String, String> getenv = System.getenv();
		System.out.println(getenv);
		int[] newArray = new int[5];
		System.arraycopy(array, 2, newArray, 0, newArray.length);
		for (int i : newArray) {
			System.out.println(i);
		}

//		scanner.close();

//		System.out.println("Enter id");
//		id = scanner.nextInt();
//		System.out.println(id);
	}

}
