package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StaticMethodReference {

	public static void main(String[] args) {
		final var inventory = DataModel.getApples();
		
		final var greensApples = filter(inventory, apple -> {
			return "green".equals(apple.getColor());
		});
		
		final var target1 = filter(inventory, Ex03StaticMethodReference::test);
		
		final var target2 = filter(inventory, Apple::test);
		
		CollectionUtils.generate("greenApples", greensApples);
		
		CollectionUtils.generate("target1", target1);
		
		CollectionUtils.generate("target2", target2);
	}

	private static boolean test(Apple apple) {
		final var fromVN = "Vietnam".equalsIgnoreCase(apple.getCountry());

		boolean isPrime = true;
		
		final var id = apple.getId();
		
		for (int i = 2; i <= Math.sqrt(id); i++) {
			if (id % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		return id > 1 && fromVN && isPrime;
	}

	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> res = new ArrayList<>();

		for (Apple a : inventory) {
			if (predicate.test(a)) {
				res.add(a);
			}
		}

		return res;
	}

}
