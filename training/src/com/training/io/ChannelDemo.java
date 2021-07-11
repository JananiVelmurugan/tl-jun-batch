package com.training.io;

import java.nio.CharBuffer;

public class ChannelDemo {
	public static void main(String[] args) {

		CharBuffer buffer = CharBuffer.allocate(15);

		String text = "test";
		System.out.println("input: " + text);

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			buffer.put(c);
		}

		int position = buffer.position();
		System.out.println("After writing data position is: " + position);

		buffer.flip();

		position = buffer.position();
		System.out.println("After flipping data position is: " + position);

		System.out.println("output: ");
		while (buffer.hasRemaining()) {
			System.out.print(buffer.get());
		}

	}

}
