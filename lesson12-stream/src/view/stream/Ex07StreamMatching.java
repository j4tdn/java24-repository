package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07StreamMatching {

	public static void main(String[] args) {
		
	List<Integer> numbers = List.of(1, 2, 1, 42, 5, 8, 80, 14, 12);
	
	System.out.printf("1. Có số nà là bội 10 không -> %s\n\n", numbers.stream()
			.anyMatch(number -> number % 10 == 0));
	
	Optional<Integer> opInt = numbers.stream()
			.filter(number -> number % 4 == 0)
			.findFirst();
	opInt.ifPresentOrElse(val -> System.out.println("2. Phần tử đầu tiên chia hết cho 4 --> " + val),
			() -> System.out.println("2. Không có phần tử nào chia hết cho 4"));

	}
	
}
