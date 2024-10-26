package controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {
	
		/*
		 Sử dụng switch case để làm gọn code khi biểu thức if else
		 so sánh bằng
		 
		 Câu 1: random 1 so ngau nhien tu 1 ->5
		 --> In ra tu tieng anh tuong ung voi so do
		 */
		
		Random rd = new Random();
		int number = rd.nextInt(1, 10);
		System.out.println("Number ---> " + number);
		
		/*
		 Nếu nhu switch case đúng mà không có break
		 Bỏ qua kiểm tra các case còn lại mà nhảy vào code trong bên case thực thi
		 Dừng lại khi
		 + gặp break
		 + xong hết default
		 */

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
			System.out.println("Unsupported");
		}

		System.out.println("\n=====================\n");
		switch(number) {
		case 1,2,3,4,5,6:
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
