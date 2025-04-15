package view.stream;

import java.util.List;

public class Ex08StreamReduce {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 1, 42, 5, 18, 10, 14, 122);

		// 1. Tìm tổng giá trị trong danh sách
		// 2. TÌm phần tử có giá trị lớn nhất trong danh sách
		// 3. Tìm phần tử có giá trị nhỏ nhất trong danh sách

		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Tìm tổng giá trị trong danh sách: " + sum);
		
		Integer max = numbers.stream()
				.reduce(Integer.MIN_VALUE,  Integer::max);
		System.out.println("Giá trị lớn nhất: " + max);
		
		Integer min = numbers.stream()
				.reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("Giá trị lớn nhất: " + min);
	}

}
