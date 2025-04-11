package view.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static utils.CollectionUtils.*;

public class Ex04StreamFiltering {
	
	public static void main(String[] args) {
		// filtering with a predicate
		// filtering only unique elements
		// ignoring the first few elements of a stream
		// truncating a stream to a given size
		
		List<Integer> elements = List.of(0, 0, 1, 21, 0, 2, 2, 3, 5, 8, 13, 5, 21, 34, 21);
		
		generate(
			"1. Tìm các phần tử là số chẵn trong danh sách", 
			elements.stream()
				.filter(e -> e % 2 == 0)
				.collect(Collectors.toSet())
		);
		
		// TODO: distinctBy(property)
		
		generate(
			"2. Tìm các phần tử duy nhất trong danh sách", 
			getElements(elements, amount -> amount == 1)
		);
		
		generate(
			"3. Tìm các phần tử xuất hiện 2 lần(bị trùng) trong danh sách", 
			getElements(elements, amount -> amount == 2)
		);
		
		generate(
			"4. Tìm các phần tử xuất hiện nhiều hơn n lần trong danh sách", 
			getElements(elements, amount -> amount > 1)
		);
		
		// 5. Tìm 5 phần tử lớn nhất trong danh sách
		
		// 6. Sắp xếp tăng dần, sau đó lấy 2 phần tử cuối cùng trong danh sách
	}
	
	private static List<Integer> getElements(List<Integer> elements, Predicate<Long> predicate) {
		return elements.stream() // Stream<Integer>
			.collect(Collectors.groupingBy(e -> e, Collectors.counting())) // Map<E, Long> Long: số lần xuất hiện
			.entrySet() // Set<Entry<E, Long>
			.stream()
			.filter(e -> predicate.test(e.getValue()))
			.map(Entry::getKey)
			.toList();
	}
	
}
