package com.training.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	public static void printdata(Emp object1) {

		System.out.println("name = " + object1.name);
		System.out.println("age = " + object1.age);
		System.out.println("a = " + object1.a);
		System.out.println("b = " + object1.b);
	}

	public static void main(String[] args) {
		Emp object = new Emp("ab", 20, 2, 1000);
		String filename = "shubham.txt";

		// Serialization
		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			printdata(object);

			// value of static variable changed
			object.b = 2000;
		}

		catch (IOException ex) {
			// System.out.println("IOException is caught");
			ex.printStackTrace();
		}

		object = null;

		// Deserialization
		try {

			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object = (Emp) in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(object);

			// System.out.println("z = " + object1.z);
		}

		catch (IOException ex) {
			// System.out.println("IOException is caught");
			ex.printStackTrace();
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
