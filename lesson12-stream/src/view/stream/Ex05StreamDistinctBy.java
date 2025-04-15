package view.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex05StreamDistinctBy {

	public static void main(String[] args) {

		// Collectors.toList
		// Collectors.toSet
		// Collectors.toMap
		// Collectors.joining

		// Liệt kê các số với kết quả trả về không trùng nhau
		List<Integer> elements = List.of(0, 0, 1, 21, 0, 2, 2, 3, 5, 8, 13, 5, 21, 34, 21);

		generate("1. Tìm các phần tử là số chẵn trong danh sách",
				elements.stream().collect(Collectors.toCollection(() -> new TreeSet<>())));

		// Liệt kê những quả táo không trùng xuất sứ -> distinct by origin/country
		List<Apple> inventory = DataModel.getApples();

		Set<String> storage = new HashSet<String>();

		List<Apple> appleDistinctByCountry = inventory.stream()
				.filter(apple -> storage.add(apple.getCountry()))
				.toList();

		generate("Liệt kê những quả táo không trùng xuất sứ ", appleDistinctByCountry);
		
		Set<Double> storageW = new HashSet<>();
		
		List<Apple> appleDistinctByWeigth = inventory.stream()
				.filter(apple -> storageW.add(apple.getWeight()))
				.toList();
		generate("Liệt kê những quả táo không trùng cân nặng", appleDistinctByWeigth);
		
		
	}
	
	
	private static <Element, T> List<Element> distinctBy(List<Element> elements, Function<Element, T> func) {
	    Set<T> seen = new HashSet<>();
	    return elements.stream()
	    		.filter(element -> seen.add(func.apply(element)))
	    		.collect(Collectors.toList());
	}
	
	
	
	
}