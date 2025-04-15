package view.stream;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static utils.CollectionUtils.*;

public class Ex03StreamFiltering {
	
	public static void main(String[] args) {
		
		List<Integer> elements = List.of(0, 0, 1, 21, 0, 2, 2, 3, 5, 8, 13, 5, 21, 34, 21);
		
		// 5. Lấy k phần tử đầu tiên
		generate("5. Lấy 2 phần tử đầu tiên", elements.stream().limit(2).toList());
		
		// 6. Lấy k phần tử cuối cùng
		generate("6. Lấy 5 phần tử cuối cùng", elements.stream()
				.skip(elements.size() - 5)
				.toList());
		// 7. Lấy các phần tử từ a-b
		generate("7. Lấy phần tử 3-7", elements.stream()
				.skip(2)
				.limit(4)
				.toList());
	}
	
	
	private static List<Integer> getElements(List<Integer> elements, Predicate<Long> predicate) {
	    return elements.stream() // Stream<Integer>
	        .collect(Collectors.groupingBy(e -> e, Collectors.counting())) // Map<E, Long> Long: số lần xuất hiện
	        .entrySet() // Set<Entry<E, Long>>
	        .stream()
	        .filter(e -> predicate.test(e.getValue()))
	        .map(Entry::getKey)
	        .toList();
	}
}
