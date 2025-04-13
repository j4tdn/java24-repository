package view.stream;

import static utils.CollectionUtils.generate;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex04StreamFiltering {

	public static void main(String[] args) {
		// filter w a predicate
		// filter only unique elements
		// ignoring the first few elements of stream
		// truncating a stream to a given size

		List<Integer> elements = List.of(0, 0, 1, 21, 0, 2, 2, 3, 5, 8, 13, 5, 21, 34, 21);
		// 1. find even
		generate("1. Tìm các phần tử là số chẵn trong danh sách",
				elements.stream().filter(e -> e % 2 == 0).collect(Collectors.toSet()));
		
		// todo: distinctBy(property)
		// duy nhat: unique 3
		// list elements ma ko duplicated: distinct 1 2 3
		
		// 2. find unique
		generate("2. Tìm các phần tử duy nhất trong danh sách",
				getElements(elements, amount -> amount == 1));

		// 3. find appear > 2
		generate("3. Tìm các phần tử duy nhất trong danh sách",
				getElements(elements, amount -> amount == 2));
		// 4. find appear > n times
		generate("4. Tìm các phần tử duy nhất trong danh sách",
				getElements(elements, amount -> amount > 1));
		
		
		//elements.stream().sorted(Comparator.reverseOrder()).limit(5);
		generate("5. Lấy 2 phần tử đầu tiên",
				elements.stream()
					.limit(2)
					.toList()
		);
		
		generate("6. Lấy 5 phần tử cuối cùng",
				elements.stream()
					.skip(elements.size() - 5)
					.toList()
		);
		
		generate("7. Lấy các phần tử từ 3-7",
				elements.stream()
					.skip(2)
					.limit(5)
					.toList()
		);
		
	}

	private static List<Integer> getElements(List<Integer> elements, Predicate<Long> predicate) {
		return elements.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())) // Map<E, Long>;
				.entrySet() // Set<Entry<E, Long>>
				.stream().filter(e -> predicate.test(e.getValue())).map(Entry::getKey).toList();
	}

}
