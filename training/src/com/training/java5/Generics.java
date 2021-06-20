package com.training.java5;

import java.util.ArrayList;

import com.training.arrays.Product;

public class Generics<B, P, S> {
	public static void main(String[] args) {

		// without generics
		ArrayList list = new ArrayList<>();

		list.add(new Product());
		list.add("test");
		list.add("leaf");
		list.add("testleaf");
		list.add(1);

		
		Object obj = list.get(0);
		Product product = (Product) list.get(0);
		String s1 = (String) list.get(1);
		String s2 = (String) list.get(2);
		String s3 = (String) list.get(3);
		int i = (int) list.get(4);

		// with generics

		ArrayList<String> newList = new ArrayList<>();

		// newList.add(new Product());
		newList.add("test");
		newList.add("leaf");
		newList.add("testleaf");
		// newList.add(1);

		// Product product = (Product) newList.get(0);
		// int i = (int) newList.get(4);
		String ss1 = newList.get(0);
		String ss2 = newList.get(1);
		String ss3 = newList.get(2);

	}


	// B,P
//	static <B, P> P print(B b, P p) {
	P print(B b, P p) {
		System.out.println(b);
		System.out.println(p);
		return p;
	}

	// B,S
//	static <B, S> S review(B b, S s) {
	S review(B b, S s) {
		System.out.println(b);
		System.out.println(s);
		return s;
	}

}
