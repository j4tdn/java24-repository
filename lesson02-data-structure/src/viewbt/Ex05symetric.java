package viewbt;

import utils.IoUtils;

//bài toán về số đối xứng
public class Ex05symetric {
	public static void main(String[] args) {
		int n = IoUtils.inputNumber(10, 1, "Nhập n");
		
		System.out.println(n + "Là số đối xứng ?  ->" + issSymetricNumber(n));
	
	}
	private static boolean issSymetricNumber(int number) {
		return number == getSymetricNumber(number);
		
	}
	private static int getSymetricNumber(int number) {
		int reversed = 0;
		while (number != 0) {
			int modePart = number % 10;
			reversed = reversed * 10 + modePart;
			int divPart = number /10;
		}
		return reversed;
	}

}
