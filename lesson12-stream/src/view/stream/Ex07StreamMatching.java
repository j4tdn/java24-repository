package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07StreamMatching {
	
	public static void main(String[] args) {
		// Example: Give a list of numbers: 1, 2, 1, 42, 5, 8, 80, 14, 12
		// 1st: is there any element that is divisible by 10
		// 2nd: find the first element that is divisible by 4
		// 3rd: find the elements that is divisible by 5 in the list
		// 4th: does all elements less than 100 allMatch
		// 5th: does no elements greater than 0 noneMatch
		
		List<Integer> numbers = List.of(1, 2, 1, 42, 5, 18, 10, 14, 122);
		
		System.out.printf("1st: is there any element that is divisible by 10 --> %s\n\n", 
				numbers.stream().anyMatch(number -> number % 10 == 0));
		
		Optional<Integer> optInt = numbers.stream()
			.filter(number -> number % 4 == 0)
			.findFirst();
		
		optInt.ifPresentOrElse(
			val -> System.out.println("2nd: the first element that is divisible by 4 --> " + val),
			() -> System.out.println("2nd: no element divisible by 4")
		);
		
	}
	
}