package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		System.out.println("Second element " + numbers.get(9));
		for (int t : numbers) {
			if (t % 2 == 0) {
				System.out.println(t);
			}
		}

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}

		for (int i = 0; i < numbers.size(); i++) {
			
		}
		System.out.println(numbers.size());
		System.out.println("=======================");
		LinkedList<Integer> numbersll = new LinkedList<>();
		numbersll.add(10);
		numbersll.add(20);
		numbersll.add(30);

		for (int t : numbersll) {
			System.out.println(t);
		}

		Iterator<Integer> dit = numbersll.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}

		System.out.println(numbersll.size());
	}

}
