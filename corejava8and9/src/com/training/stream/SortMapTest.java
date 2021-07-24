package com.training.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(30, "Test");
		map.put(50, "Leaf");
		map.put(70, "Object");
		map.put(80, "Class");
		map.put(20, "Inheritance");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getKey()).compareTo((Comparable) ((Map.Entry) (o2)).getKey());
			}
		});

		Collections.sort(list, (o1, o2) -> ((Comparable) ((Map.Entry) (o1)).getKey())
				.compareTo((Comparable) ((Map.Entry) (o2)).getKey()));

		System.out.println(list);
	}

}
