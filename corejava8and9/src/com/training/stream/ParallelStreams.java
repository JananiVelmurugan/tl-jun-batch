package com.training.stream;

import java.util.stream.*;

public class ParallelStreams {

	public static long iterativeSum(long n) {
		long result = 0;
		for (long i = 0; i <= n; i++) {
			result += i;
		}
		return result;
	}

	public static long sequentialSum(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).reduce(Long::sum).get();
	}

	public static long parallelSum(long n) {

		Stream.iterate(1L, i -> i + 1).limit(n).filter(num -> {
			System.out.println(Thread.currentThread().getName());
			return num % 2 == 0;
		}).forEach(System.out::println);

		Stream.iterate(1L, i -> i + 1).parallel().limit(n).filter(num -> {
			System.out.println(Thread.currentThread().getName());
			return num % 2 == 0;
		}).forEach(System.out::println);
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(Long::sum).get();
	}

	public static long rangedSum(long n) {
		return LongStream.rangeClosed(1, n).reduce(Long::sum).getAsLong();
	}

	public static long parallelRangedSum(long n) {
		return LongStream.rangeClosed(1, n).parallel().reduce(Long::sum).getAsLong();
	}

	public static long sideEffectSum(long n) {
		Accumulator accumulator = new Accumulator();
		LongStream.rangeClosed(1, n).forEach(accumulator::add);
		return accumulator.total;
	}

	public static long sideEffectParallelSum(long n) {
		Accumulator accumulator = new Accumulator();
		LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
		return accumulator.total;
	}

	public static class Accumulator {
		private long total = 0;

		public void add(long value) {
			total += value;
		}
	}
}
