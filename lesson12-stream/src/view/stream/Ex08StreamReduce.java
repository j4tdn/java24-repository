package view.stream;

import java.util.List;

public class Ex08StreamReduce {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 1, 42, 5, 18, 10, 14, 122);
		
		// 1. Tìm tổng giá trị trong danh sách
		// 2. Tìm phần tử có giá trị lớn nhất trong danh sách
		// 3. Tìm phần tử có giá trị nhỏ nhất trong danh sách
		
		// (result, element) -> result + element)
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("1. Tìm tổng giá trị trong danh sách --> " + sum);
		
		// (result, element) -> element > result ? element : result)
		Integer max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max) ;
		System.out.println("2. Tìm phần tử có giá trị lớn nhất trong danh sách --> " + max);
		
		Integer min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("3. Tìm phần tử có giá trị nhỏ nhất trong danh sách --> " + min);
	}
	
}