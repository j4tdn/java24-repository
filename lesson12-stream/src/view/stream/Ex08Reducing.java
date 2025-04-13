package view.stream;

import java.util.List;

public class Ex08Reducing {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 1, 42, 5, 18, 10, 14, 122);

		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum: " + sum);

		Integer max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max: " + max);
		
		Integer min = numbers.stream().reduce(Integer.MAX_VALUE, (res, ele) -> Math.min(res, ele));
		System.out.println("min: " + min);
	}

}
