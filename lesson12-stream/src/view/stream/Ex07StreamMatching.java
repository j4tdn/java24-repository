package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07StreamMatching {

	public static void main(String[] args) {
		
		/*
		 
		 */
		List<Integer> numbers = List.of(1, 2, 1, 42, 5, 8, 10, 14, 122);
		
		numbers.stream()
			.anyMatch(n -> n % 10 == 0);
		
		System.out.printf("1st: is there any element that is divisible by 10 --> "
				+ "%s", numbers.stream()
				.anyMatch(n -> n % 10 == 0));
			
		Optional<Integer> optInt = numbers.stream()
			.filter(n -> n % 4 == 0)
			.findFirst();
		
		optInt.ifPresentOrElse(
			val -> System.out.println("2nd: the first elements that is divisible by 4 --> " + val), 
			() -> System.out.println("2nd: no element divisible by 4")
		);
		
	}
	
}
