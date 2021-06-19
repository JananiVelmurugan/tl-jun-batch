package com.training.packagedemo;

import static java.lang.Math.PI;

import com.training.abstractdemo.Book;
import com.training.demo.AuthorService;

public class Calculator {
	public static void main(String[] args) {

		System.out.println(PI);

		System.out.println(PI);

		System.out.println(PI);
		System.out.println(PI);

//		System.out.println(min(23, 45));

		Book b;
		AuthorService service = new AuthorService();
		service.print();
	}
}
