package view.stream;

import java.util.List;

public class Ex08StreamReduce {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 1, 42, 5, 18, 10, 14, 12);
		
		//1. Tìm tổng giá trị trong danh sách
		//2. Tìm phần tử có giá trị lớn nhất trong list
		//3. Tìm phần tử có giá trị nhỏ nhất trong list
		
		Integer sum = numbers.stream()
		// reduce 0 là giá trị ban đầu cho là 0, xong truyền 2 biến 1 biến là kết quả và 1 biến là element trong stream
				// --> trả về kết quả = kết quả + element
		.reduce(0, (result, element) -> result + element);
		System.out.println("1. Tìm tổng giá trị trong danh sách -> "+ sum);
	
		Integer max = numbers.stream()
				.reduce(Integer.MIN_VALUE, (result, element) -> element > result ? element: result); // trả về result là element nếu nó lớn hơn result
		System.out.println("2. Tìm phần tử có giá trị lớn nhất trong list -> "+ max);
		
		Integer min = numbers.stream()
				.reduce(Integer.MAX_VALUE, Integer::min); // trả về result là element nếu nó nhỏ hơn result
		System.out.println("3. Tìm phần tử có giá trị nhỏ nhất trong list -> "+ min);
		
	
	}
	
}
