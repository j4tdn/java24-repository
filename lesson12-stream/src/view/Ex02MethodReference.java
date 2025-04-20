package view;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
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
		
		var inventory = new ArrayList<>(DataModel.getApples());
		
		//VD 1:
		Consumer<Apple> c1 = (Apple apple) -> {
			System.out.println(apple);
		};
		
		Consumer<Apple> c2 = (Apple apple) -> System.out.println(apple);
		
		//Dạng 1 (T t) -> class/object.method(t) --> class/object::method
		Consumer<Apple> c3 =  System.out::println;
		
		inventory.forEach(c1);
		System.out.println("\n");
		
		inventory.forEach(c2);
		System.out.println("\n");
		
		inventory.forEach(c3);
		System.out.println("\n");
		
		
		//VD2:
		//Dạng 2: (T t) -> t.method() ==> T::method
		// Function là dạng truyền T trả về R => non-static method reference
		Function<Apple, Integer> f1 = (Apple apple) -> apple.getId();
		Function<Apple, Integer> f11 = Apple::getId; // non-static method reference
		Function<Apple, Integer> f111 = Apple::retrieveId; // static method reference
		
		Function<Apple, String> f2 = (Apple apple)-> apple.getCountry();
		Function<Apple, String> f22 = Apple::getCountry;
		
		var ids = mapping(inventory, f1);
		
		CollectionUtils.generate("1. Danh sách ids", ids);
	
		var countries = mapping(inventory, f2);
		CollectionUtils.generate("2. Danh sách country", countries );
	
		// Áp dụng cho sort
		// VD: sx tăng dần theo country
		Comparator<Apple> cpt1 = (a, b) -> {
			return a.getCountry().compareTo(b.getCountry());
		};
		Comparator<Apple> cpt2 = comparing(a -> a.getCountry());
		
		Comparator<Apple> cpt3 = comparing(Apple::getCountry);
		inventory.sort(cpt1);
		CollectionUtils.generate("danh sach tang dan theo country", inventory);
		
		
	//	inventory.add(2, null);
	//	inventory.add(6, null);
		
		// VD: sx tăng dần theo country, weight
		inventory.sort(comparing(Apple::getCountry)
				.thenComparing(comparing(Apple::getWeight)));
		
		
		/*
		 * inventory.sort(
		 * (a, b) -> { if (a.getCountry().compareTo(b.getCountry()) == 0 ) 
		 * { return Double.compare(a.getWeight(), b.getWeight()); } 
		 * return a.getCountry().compareTo(b.getCountry()); });
		 */
		
		
		
		CollectionUtils.generate("danh sach tang dang theo country, weight", inventory);
	
		
		// Lambda -> method reference --> non-static tuân theo 1 số dạng công thức
		
		// lambda --> static method reference
	
	}
	private static <T,R> Set<R> mapping(List<T> elements, Function<T, R> func){
		Set<R> output = new HashSet<>();
		
		for (T element: elements) {
			output.add(func.apply(element));
		}
		return output;
	}
}
