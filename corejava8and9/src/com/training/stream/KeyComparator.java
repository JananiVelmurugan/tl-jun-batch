package com.training.stream;

import java.util.Comparator;
import java.util.Map;

public class KeyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Comparable) ((Map.Entry) (o1)).getKey()).compareTo((Comparable) ((Map.Entry) (o2)).getKey());
	}
}
