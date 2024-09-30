package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		/*
		 sử dung switch cáe để làm gọn code khi biểu thức if else
		 so sánh =
		 
		 câu 1 random số ngẫu nhiên từ 1 đến 5
		 --> In ra từ tiếng anh tương ứng với số đó
		 
		 */
		
		Random rd = new Random();
		int number = rd.nextInt(1, 6);
		System.out.println("number = " + number);
		
		
		
		switch (number) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Unsupported ..");

		}
		
		switch (number) {
		case 2, 3, 4, 5, 6:
			System.out.println("Week Day");
			break;
		case 7, 8:
			System.out.println("Weekend Day");
			break;
		default:
			System.out.println("Invalid day");
		}
		
		
	}
}
