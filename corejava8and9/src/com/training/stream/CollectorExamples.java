package com.training.stream;

import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.summingInt;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorExamples {

	public CollectorExamples() {

		Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

		// To find min calory dish
		Optional<Dish> mostCalorieDish = Dish.menu.stream().collect(minBy(dishCaloriesComparator));

		// To find sum of all calories
		// select sum(calories) from dish;
		// Get all calories from dish and do sum up in business logic
		System.out.println(mostCalorieDish.get());

		int totalCalories = Dish.menu.stream().collect(summingInt(Dish::getCalories));

		System.out.println(totalCalories);

		// select avg(cal) from dish;
		double avgCalories = Dish.menu.stream().collect(Collectors.averagingInt(Dish::getCalories));

		System.out.println(avgCalories);

		IntSummaryStatistics menuStatistics = Dish.menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
		System.out.println(menuStatistics);

		String shortMenu = Dish.menu.stream().map(Dish::getName).collect(Collectors.joining());
		System.out.println(shortMenu);

		String shortMenuTwo = Dish.menu.stream().map(Dish::getName).collect(Collectors.joining(","));
		System.out.println(shortMenuTwo);
	}

	public static void main(String[] args) {
		CollectorExamples ex = new CollectorExamples();
	}

}
