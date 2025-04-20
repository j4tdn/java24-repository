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
		
		final var greenApples = filter(inventory, apple -> {
			return "green".equals(apple.getColor());
		});
		
		// tìm các qquả táo có xuat sứ ở vietnam và có id là số nguyên
		final var target = filter(inventory,Apple::test);
		
		CollectionUtils.generate("greenApples", greenApples);
		CollectionUtils.generate("greenApples", target);
	}
	
	
	
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}

}
