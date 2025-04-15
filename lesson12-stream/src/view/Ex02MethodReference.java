package view;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02MethodReference {

	public static void main(String[] args) {
		var inventory = new ArrayList<Apple>(DataModel.getApples());

		Consumer<Apple> c1 = (Apple apple) -> {
			System.out.println(apple);
		};

		Consumer<Apple> c2 = (Apple apple) -> System.out.println(apple);

		Consumer<Apple> c3 = System.out::println;

		inventory.forEach(c1);
		System.out.println("\n");

		inventory.forEach(c2);
		System.out.println("\n");

		inventory.forEach(c3);
		System.out.println("\n");
		
		// VD2
		// Dang 2: (T t) -> t.method() ==> T::method

		Function<Apple, Integer> f1 = (Apple apple) -> apple.getId();
		Function<Apple, Integer> f11 = Apple::getId; // non-static method reference
		Function<Apple, Integer> f111 = Apple::retrieveId; //  static method reference
		

		Function<Apple, String> f2 = (Apple apple) -> apple.getCountry();
		Function<Apple, String> f22 = Apple::getCountry;

		var ids = mapping(inventory, f11);
		var countries = mapping(inventory, f22);

		// Áp dụng cho sắp xếp
		// Vd: sắp xếp theo country
		
		Comparator<Apple> cpt1 = (a1, a2) -> a1.getCountry().compareTo(a2.getCountry());
		Comparator<Apple> cpt2 = comparing((Apple a) -> a.getCountry());
		Comparator<Apple> cpt3 = comparing(Apple::getCountry);
		
	
		
		inventory.sort(nullsFirst(comparing(Apple::getCountry)));
		CollectionUtils.generate("Sắp xếp tăng dần theo Country", inventory);
		
		//inventory.add(2, null);
		//inventory.add(6, null);
		
		// Lưu ý: Hỗ trợ null first/last cho đối tượng đang sắp xếp
		// 		: Không hỗ trợ null cho thuộc tính của đối tượng

		// Sắp xếp theo country, weigth
		inventory.sort(nullsFirst(comparing(Apple::getCountry, reverseOrder()).thenComparing(Apple::getWeight)));
		CollectionUtils.generate("Sắp xếp tăng dần theo Country, weigth", inventory);
		
		/*inventory.sort((a1, a2) -> {
			int countryInt = a1.getCountry().compareTo(a2.getCountry());

			if (countryInt != 0) {
				return countryInt;
			}

			return Double.compare(a1.getWeight(), a2.getWeight());
		});
		*/
		
		inventory.add(new Apple(null));
		
//		inventory.sort((a1,a2) -> {
//			if(a1.getCountry() == null) {
//				return 1;
//			}
//			
//			if(a2.getCountry() == null ) {
//				return -1;
//			}
//			
//			return a1.getCountry().compareTo(a2.getCountry());
//		});
//		
		CollectionUtils.generate("Sắp xếp tăng dần theo Country, weigth", inventory);
	}

	private static <T, R> Set<R> mapping(List<T> elements, Function<T, R> func) {
		Set<R> output = new HashSet<>();

		for (T element : elements) {
			output.add(func.apply(element));
		}
		return output;
	}
}