package view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

import static java.util.Comparator.*;

public class Ex02MethodReference {
	
	public static void main(String[] args) {
		var inventory = new ArrayList<>(DataModel.getApples());
		
		// VD1
		Consumer<Apple> c1 = (Apple apple) -> {
			System.out.println(apple);
		};
		
		Consumer<Apple> c2 = (Apple apple) -> System.out.println(apple);
		
		
		// Dạng 1: (T t...) -> class/object.method(t..) --> class/object::method
		Consumer<Apple> c3 = System.out::println;
		
		inventory.forEach(c1);
		
		System.out.println("\n");
		
		inventory.forEach(c2);
		
		System.out.println("\n");
		
		inventory.forEach(c3);
		
		
		// VD2
		// Dạng 2: (T t) -> t.method() ==> T::method
		
		Function<Apple, Integer> f1 = (Apple apple) -> apple.getId();
		Function<Apple, Integer> f11 = Apple::getId;
		
		Function<Apple, String> f2 = (Apple apple) -> apple.getCountry();
		Function<Apple, String> f22 = Apple::getCountry;
		
		var ids = mapping(inventory, f11);
		var countries = mapping(inventory, f22);
		
		CollectionUtils.generate("1. Danh sách ids", ids);
		
		CollectionUtils.generate("2. Danh sách countries", countries);
		
		// Áp dụng cho sắp xếp
		// VD: Sắp xếp tăng dần theo country
		
		Comparator<Apple> cpt1 = (a1, a2) -> a1.getCountry().compareTo(a2.getCountry());
		
		Comparator<Apple> cpt2 = comparing((Apple a) -> a.getCountry());
		
		Comparator<Apple> cpt3 = comparing(Apple::getCountry);
		
		// (a1, a2) -> a1.getCountry().compareTo(a1.getCountry());
				
		/*
		 
		 public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor)
		    {
		        Objects.requireNonNull(keyExtractor);
		        return (Comparator<T> & Serializable)
		            (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
		    }
		 
		 */
		
		inventory.sort(comparing(Apple::getCountry));
		CollectionUtils.generate("Sắp xếp tăng dần theo country", inventory);
		
		
		inventory.add(2, null);
		inventory.add(6, null);
		
		// Lưu ý: hỗ trợ nulls first/last cho đối tượng đang sắp xếp
		//      : không hỗ trợ xử lý null cho thuộc tính của đối tượng, tự xử lý
		
		// VD: Sắp xếp tăng dần theo country, weight
		inventory.sort(nullsLast(comparing(Apple::getCountry).thenComparing(Apple::getWeight)));
		CollectionUtils.generate("Sắp xếp tăng dần theo country, weight", inventory);
		
		
		/*inventory.sort((a1, a2) -> {
			int countryInt = a1.getCountry().compareTo(a2.getCountry());
			
			if (countryInt != 0) {
				return countryInt;
			}
			
			return Double.compare(a1.getWeight(), a2.getWeight());
		});*/
	}
	
	private static <T, R> Set<R> mapping(List<T> elements, Function<T, R> func) {
		Set<R> output = new HashSet<>();
		
		for (T element: elements) {
			output.add(func.apply(element));
		}
		
		return output;
	}
	
}
