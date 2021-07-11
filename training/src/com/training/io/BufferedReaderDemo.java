package com.training.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String args[]) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your name");
		String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) {
					br.close();
				}
				if(r!=null) {
					r.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Welcome " + name);
	}
}
