package com.training.string;

public class StringComparision {
	public static void main(String[] args) {

		String org = "Test";

//		System.out.println(org + "Leaf");// TestLeaf
//		org = org + "Leaf";
//		System.out.println(org);

		String org1 = new String("Test");
		System.out.println(org == org1);
		System.out.println(org.equals(org1));
		String org3 = "Test";
		System.out.println(org == org3);
		System.out.println(org.equals(org3));
		System.out.println(org.length());
		System.out.println(org.toUpperCase());
		System.out.println(org.charAt(1));
		System.out.println(org.charAt(7));
		System.out.println(org.indexOf('t'));
		System.out.println(org.indexOf('j'));
		System.out.println(org.concat(" Leaf"));
		System.out.println(org.replace('t', 'z'));

		String age = "23e";
		int parseAge = Integer.parseInt(age);
		System.out.println(parseAge);

		int number = 100;
		String valueString = String.valueOf(number);
		System.out.println(valueString);

	}

}
