package com.training.string;

public class StringBufferBuilderTest {
	public static void main(String[] args) {
//		StringBuffer sb = "Test"; //(not possible)
		StringBuffer sb1 = new StringBuffer("Test");
		sb1.append("Leaf");
		
//		StringBuilder sb2 = "Test"; //(not possible)
		StringBuilder sb3 = new StringBuilder("Test");
		sb3.append("Leaf");
		
		sb1.append("Chennai");
		sb3.append("Chennai");
		
		sb1.toString().toLowerCase();
		sb3.toString().toUpperCase();
		
	}

}
