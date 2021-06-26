package com.training.exception;

import java.net.MalformedURLException;
import java.net.URL;

import com.training.lang.Employee;

public abstract class ExceptionTest {

	abstract void print() throws NullPointerException;

	public ExceptionTest() throws CloneNotSupportedException {
	}

	public static void main(String[] args) throws MalformedURLException {

		System.out.println("Start");
		System.out.println(1 / 1);
		System.out.println("Test".charAt(3));
		System.out.println("End");

		URL url = new URL("https://www.google.com/");
//		Employee emp1 = new Employee();
//		emp1.clone();

		try {
			doDivide();
//			System.out.println("After doDivide()");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("After doDivide()");
		}
		try {
			doClone();
			// System.out.println("After doClone()");
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		} finally {
			System.out.println("After doClone()");
		}

		try {
			doDivide();
			doClone();
		} catch (CloneNotSupportedException cnse) {
			System.out.println(cnse);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} finally {
			System.out.println("After doDivide()");
			System.out.println("After doClone()");
		}

		try {
			doDivide();
			doClone();
		} catch (CloneNotSupportedException cnse) {
			System.out.println(cnse);
		} finally {
			System.out.println("After doDivide()");
			System.out.println("After doClone()");
		}

	}

	static void doDivide() throws ArithmeticException {
		System.out.println("Unchecked Exception");
		System.out.println(1 / 1);
	}

	static void doClone() throws CloneNotSupportedException {
		System.out.println("Checked Exception");
		Employee emp1 = new Employee();
		emp1.clone();
	}

}
