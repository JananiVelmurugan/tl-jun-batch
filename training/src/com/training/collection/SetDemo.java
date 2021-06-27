package com.training.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		names.add("Test");
		names.add("Leaf");
		names.add("Chennai");
		names.add("Leaf");
	

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		LinkedHashSet<String> countries = new LinkedHashSet<>();
		countries.add("India");
		countries.add("UK");
		countries.add("Canada");
		
		Iterator<String> cit = countries.iterator();
		while (cit.hasNext()) {
			System.out.println(cit.next());
		}

		TreeSet<String> games = new TreeSet<>();
		games.add("Cricket");
		games.add("Golf");
		games.add("Badminton");

		Iterator<String> git = games.iterator();
		while (git.hasNext()) {
			System.out.println(git.next());
		}

	}

}
