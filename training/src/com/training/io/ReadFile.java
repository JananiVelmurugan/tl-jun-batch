package com.training.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
	public static void main(String[] args) {
		// variable declaration
		int ch;

		// check if File exists or not
		FileReader fr = null;
		try {
			fr = new FileReader("output.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}

		// read from FileReader till the end of file
		try {
			while ((ch = fr.read()) != -1) {
				System.out.println(ch);
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close the file
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}