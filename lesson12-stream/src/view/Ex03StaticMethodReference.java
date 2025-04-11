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
		
		CollectionUtils.generate("Green apple", greenApples);
		
		// Tìm các quả táo có xuất sứ ở Vietnam và có id là số nguyên tố
		final var target1 = filter(inventory, Apple::test);
		
		final var target2 = filter(inventory, Apple::test);
		
		CollectionUtils.generate("Tìm các quả táo có xuất sứ ở Vietnam và có id là số nguyên tố", target1);
		
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
