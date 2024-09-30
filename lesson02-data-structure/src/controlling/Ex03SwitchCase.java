package controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {

		/*
		 * Sử dụng switch case để làm gọn code khi biểu thức if else so sánh =
		 * 
		 * Câu 1: Random số ngẫu nhiên từ 1 -> 5 --> In ra từ tiếng anh tương ứng với số đó
		 */

		Random rd = new Random();
		int number = rd.nextInt(1, 10);
		System.out.println("number = " + number + "\n");
		
		/*
		 * Nếu như switch case đúng mà ko có break
		 * Bỏ qua kiểm tra các case còn lại mà nhảy vào code bên trong case thực thi
		 * Dừng lại khi
		 * + gặp break
		 * + xong hết default
		 */

		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Unsupported ...");
		}
		
		System.out.println("\n===========\n");
		
		switch(number) {
		case 2,3,4,5,6:
			System.out.println("Week Day");
			break;
		case 7,8:
			System.out.println("Weekend Day");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}
}
