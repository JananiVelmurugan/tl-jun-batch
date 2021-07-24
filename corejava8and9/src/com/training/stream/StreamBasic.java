package com.training.stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamBasic {

	public static void main(String... args) {
		// Java 7
		getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);

		System.out.println("---");

		// Java 8
		getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
		List<String> lowCaloricDishesNamesInJava8 = getLowCaloricDishesNamesInJava8(Dish.menu);
		System.out.println(lowCaloricDishesNamesInJava8);
	}

	public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
		List<Dish> lowCaloricDishes = new ArrayList<>();
		int count = 0;
		for (Dish d : dishes) {
			if (count == 2) {
				break;
				
			}else if (d.getCalories() > 400) {
					lowCaloricDishes.add(d);
					count++;
				
			}
		}
		List<String> lowCaloricDishesName = new ArrayList<>();
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
		});
		for (Dish d : lowCaloricDishes) {
			lowCaloricDishesName.add(d.getName());
		}
		return lowCaloricDishesName;
	}

	public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
		return dishes.stream().filter(d -> d.getCalories() > 4000).sorted(comparing(Dish::getCalories))
				.filter(d -> d.getName().startsWith("p")).map(Dish::getName).collect(toList());
	}
}
