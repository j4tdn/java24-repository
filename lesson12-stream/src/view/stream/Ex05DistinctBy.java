package view.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05DistinctBy {

	public static void main(String[] args) {
		
		// Collectors.toList
		// Collectors.toSet
		// Collectors.toMap
		// Collectors.joining
		
		
		// Liệt kê các số với kết quả trả về không trùng nhau
		List<Integer> elements = List.of(0, 0,  1, 2, 2, 3, 5, 8, 13, 21, 5, 21, 0, 34);
		
		CollectionUtils.generate("1. Liệt kê các số với kết quả trả về không trùng nhau"
				, elements.stream()
			//	.distinct()
				.collect(Collectors.toCollection(()-> new TreeSet<>())));
	
		List<Apple> inventory = DataModel.getApples();
		
		// Liệt kê những quả táo không trùng xuất xứ --> distinct by origin/country
		
		
		List<Apple> appleDictinctByCountry = disctinctBy(inventory, Apple::getCountry);
	/*	
		Set<String> storage = new HashSet<>(); // 
		List<Apple> appleDictinctByCountry = inventory.stream()
		.filter(apple -> storage.add(apple.getCountry()))
		.toList();
		
	*/
				
	/*	{
			String country = apple.getCountry();
			if (storage.contains(country)) {
				return false;
			} else {
				storage.add(country);
				return true;
			}
		}) */
		 
		
		CollectionUtils.generate("Liệt kê những quả táo không trùng xuất xứ", appleDictinctByCountry);
	
		// Liệt kê những quả táo không trùng cân nặng
		List<Apple> appleDistinctByWeight = disctinctBy(inventory, Apple::getWeight);
		CollectionUtils.generate("Liệt kê những quả táo không trùng cân nặng", appleDistinctByWeight);
		
	}
	private static <Element, T> List<Element> disctinctBy (List<Element> elements, Function<Element, T> func){
		Set<T> seen = new HashSet<>();
		return elements.stream()
				.filter(element -> seen.add(func.apply(element)))
				.collect(Collectors.toList());
	}
}
