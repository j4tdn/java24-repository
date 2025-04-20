package view.stream;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex04StreamFiltering {

	public static void main(String[] args) {
		
		// filtering with a predicate
		// filtering only unique elements
		// ignoring the first few elements of a stream
		// truncating a stream to a given size
		
		List<Integer> elements = List.of(0, 0, 1, 2, 2, 3, 5, 8, 13, 21, 5, 21, 0, 34);
		//1. Tìm các phần tử là số chẵn
		CollectionUtils.generate("1. Tìm các phần tử là số chẵn", elements.stream()
				.filter(d -> d % 2 == 0)
				.collect(Collectors.toSet()));
		
		
		// input: 1 1 2 2 3
		// Tìm các phần tử duy nhất: unique 3 
		// Liệt kê các phần tử khong trùng nhau: distinct 1 2 3
		
		
		//2. Tìm các phần tử duy nhất
		CollectionUtils.generate("2. Tìm các phần tử duy nhất", elements.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting())) // Map<Integer, Long>
				//groupingBy: nhóm các phần tử giống nhau và trả về list số lần xuất hiện phần tử đó
				.entrySet() // Set<Entry<E, Long>>
				.stream()
				.filter(d -> d.getValue() == 1)
				.map(Entry::getKey)
				.toList());
		
		//3. Tìm các phần tử xuất hiện 2 lần trong danh sách
		CollectionUtils.generate("3. Tìm các phần tử xuất hiện 2 lần", getElement(elements, ammount -> ammount == 2));
		
		//4. Tìm các phần tử xuất hiện nhiều hơn n lần trong danh sách
		CollectionUtils.generate("3. Tìm các phần tử xuất hiện 3 lần", getElement(elements, ammount -> ammount == 3));
		
		//5. Lấy k phần tử đầu tiên
		CollectionUtils.generate("5. Lấy 2 phần tử đầu tiên", 
				elements.stream()
				.limit(2)
				.toList());
		
		//6. Lấy 5 phần tử cuối
		CollectionUtils.generate("Lấy 5 phần tử cuối", 
				elements.stream()
				.skip(elements.size() - 5)
				.toList());
		//7. Lấy các phần tử từ a - b
		CollectionUtils.generate("Lấy các phần tử từ 3 - 7", 
				elements.stream()
				.skip(2)
				.limit(4)
				.toList());
		
		
	}
	
	private static List<Integer> getElement(List<Integer> list, Predicate<Long> predicate){
	return list.stream()
			.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> predicate.test(e.getValue()))
			.map(Entry::getKey)
			.toList();
	}

	
}
