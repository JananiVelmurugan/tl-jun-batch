package com.training.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<>();
		names.put(1, "Test");
		names.put(2, "Leaf");
		names.put(3, "Chennai");

//		names.keySet()
		Iterator<Entry<Integer, String>> it = names.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> obj = it.next();
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}

		for (Map.Entry<Integer, String> m : names.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

		
	}
}
