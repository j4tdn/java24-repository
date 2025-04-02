package view;

import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex02MethodReference {
	
	public static void main(String[] args) {
		var inventory = DataModel.getApples();
		
		Consumer<Apple> c1 = (Apple apple) -> {
			System.out.println(apple);
		};
		
		Consumer<Apple> c2 = (Apple apple) -> System.out.println(apple);;
		
		
//		Dạng 1 (T t) -> class/object.method(t) --> class/object::method
		Consumer<Apple> c3 = System.out::println;
		
		
//		inventory.forEach(c1);
//		inventory.forEach(c2);
//		inventory.forEach(c3);
//		================
		
//		inventory.sort(comparing);
		
		
//		Function<Apple, Integer> f1 = (Apple apple) -> apple.getId();
//		Function<Apple, Integer> f11 = Apple::getId;
//		
//		
//		Function<Apple, String> f2 = (Apple apple) -> apple.getCountry();
//		Function<Apple, String> f22 = Apple::getCountry;
//		
		
//		C2:
		Function<Apple, Integer> f3 = Apple::getId;
		Function<Apple, String> f4 = Apple::getCountry;
		
//		VD2:
		var ids = mapping(inventory, f3);
		var contries = mapping(inventory, f4);
		
		
//		CollectionUtils.generate("1.Ds ids: ", ids);
//		CollectionUtils.generate("1.Ds countries: ", contries);
		
//		Áp dụng cho sắp xếp
//		VD: Sắp xếp tăng dần theo id
//		Comparator<Apple> cpt1 = (s1, s2) -> s1.getCountry().compareTo(s2.getCountry());
//		
		Comparator<Apple> cpt2 = Comparator.comparing(Apple::getCountry, Comparator.reverseOrder()).thenComparing(Apple::getId, Comparator.reverseOrder());
		
		Comparator<Apple> cpt3 = comparing(Apple::getId, reverseOrder()).thenComparing(Apple::getWeight, reverseOrder());
		
		
		
	}
	
	private static <T, R> Set<R> mapping(List<T> elements, Function<T, R> function) {
		Set<R> output = new HashSet<>();
		
		for (T element: elements) {
			output.add(function.apply(element));
		}
		return output;
	}

	
	
	
	
	
}
