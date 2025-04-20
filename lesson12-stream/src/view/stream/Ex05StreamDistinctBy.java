package view.stream;

import static utils.CollectionUtils.generate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

public class Ex05StreamDistinctBy {
	
	public static void main(String[] args) {
		
		// Collectors.toList
		// Collectors.toSet
		// Collectors.toMap
		// Collectors.toCollection
		// Collectors.joining
		
		List<Integer> elements = List.of(0, 0, 1, 21, 0, 2, 2, 3, 5, 8, 13, 5, 21, 34, 21);
		
		Supplier<TreeSet<Integer>> s1 = TreeSet::new;
		
		generate(
			"1. Liệt kê các số với kết quả trả về không trùng nhau", 
			elements.stream()
				.collect(Collectors.toCollection(s1))
		);
		
		List<Apple> inventory = DataModel.getApples();
		
		generate(
			"2. Liệt kê những quả táo không trùng xuất sứ", 
			distinctBy(inventory, Apple::getCountry)
		);
		
		generate(
			"2. Liệt kê những quả táo không trùng cân nặng", 
			distinctBy(inventory, Apple::getWeight)
		);
	}
	
	private static <Element, T> List<Element> distinctBy(List<Element> elements, Function<Element, T> func) {
		Set<T> seen = new HashSet<>();
		return elements.stream()
			.filter(element -> seen.add(func.apply(element)))
			.collect(Collectors.toList());
	}
	
}
