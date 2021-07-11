package com.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		FileWriter writer = null;
		BufferedWriter buffer = null;
		try {
			writer = new FileWriter("D:\\testout.txt");
			buffer = new BufferedWriter(writer);
			buffer.write("Welcome to javaTpoint.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buffer != null) {
					buffer.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Success");
	}
}
