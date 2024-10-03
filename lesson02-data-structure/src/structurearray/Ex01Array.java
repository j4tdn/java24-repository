package structurearray;

import java.util.Scanner;

public class Ex01Array {

	public static void main(String[] args) {
		/*
		 * thường đặt [] trước KDL vì: + Mảng là KDL đối tượng (Object) + Nếu đặt sau
		 * tên mảng "int numbers[]" thì sẽ giống như mảng numbers chỉ mang KDL int
		 * (nguyên thủy)
		 */

		// 0 1 2 3 4 5
		// value: 0 0 0 25 0 0
		Scanner ip = new Scanner(System.in);

		int[] numbers = new int[6];
		numbers[3] = 25;
		System.out.println("Index 3: " + numbers[3]);
		// forindex
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Value at Index[%s]: %s \n", i, numbers[i]);

		}
		;
		System.out.println("====================");
		// foreach
		for (int number : numbers) {
			System.out.println("number: " + number);
		}
		System.out.println("==================");
		String[] sequences = { "hello", "hi", "when" };
		System.out.println("length: " + sequences.length);
		// foreach
		for (String sq : sequences) {
			System.out.println(sq);
		}

	}

}
