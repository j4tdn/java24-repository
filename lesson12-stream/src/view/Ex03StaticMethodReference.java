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
		
		// tìm các quả táo có xuất sứ ở VN và có id là số nguyên tố
		final var target = filter(inventory, Ex03StaticMethodReference::test);
		
		final var target1 = filter(inventory, Apple::test);
		
		CollectionUtils.generate("greenApples", greenApples);
		CollectionUtils.generate("target", target);
		CollectionUtils.generate("target1", target1);
		// Ex03StaticMethodReference::test => static method reference
		
		
	}
	// viết static class cho method reference, xem thử nó lấy gì làm input và trả về gì
	private static boolean test(Apple apple) {
		final var fromVn = "Vietnam".equalsIgnoreCase(apple.getCountry());

		boolean isPrime = true;
		final var id = apple.getId();

		for (int i = 2; i <= Math.sqrt(id); i++) {
			if (id % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		return id > 1 && fromVn && isPrime;
		
	}
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
