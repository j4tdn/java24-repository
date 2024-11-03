package view;

import java.util.Arrays;

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		String s1 = "1237asdasd";
		System.out.println(Arrays.toString(findNumber(s1)));
		// em trẳ kq của findnumber là mảng char các số tự nhiên nên giờ ỉn ra, nó sẽ in
		// số lớn nhất nhưng mà là mã ASCII của số đó
		// em chưa biết convert lại như thế nào
		System.out.println(getMaxValidNumber(findNumber(s1)));

	}

	private static char[] findNumber(String text) {
		char[] result = new char[text.length()];
		int count = 0;
		;
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter >= '0' && letter <= '9') {
				result[count] = letter;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int getMaxValidNumber(char[] numbers) {
		char max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];

			}
		}
		return max;

	}
}
