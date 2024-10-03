package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	
	public static void main(String[] args) {
		/*
		 Sử dụng switch case để làm gọn code khi biểu thức if else 
		 so sánh =
		 
		 Câu 1: Random số ngẫu nhiều từ 1 đến 5
		 --> In ra từ tiếng anh tương ứng với số đó
		 
		 */
		
		Random rd = new Random();
		int number = rd.nextInt(1, 10);
		System.out.println("number = " + number + "\n");
		
		/*
		 Nếu như switch case đúng mà ko có break
		 Bỏ qua kiểm tra các case còn lại mà nhảy vào luôn code bên trong case thực thi
		 Dừng lại khi
		 + gặp break
		 + xong hết default
		 */
		
		switch (number) {
		case 1: // if(number == 1)
			System.out.println("--> ONE");
			// break; // thoát khỏi switch case block
		case 2: // else if (number == 2)
			System.out.println("--> TWO");
			// break;
		case 3:
			System.out.println("--> THREE");
			// break;
		case 4:
			System.out.println("--> FOUR");
			// break;
		case 5:
			System.out.println("--> FIVE");
			// break;
		default: // else
			System.out.println("--> Unsupported ...");
		}
		
		System.out.println("\n=====================\n");
		
		switch(number) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Week Day");
			break;
		case 7:
		case 8:
			System.out.println("Weekend Day");
			break;
		default:
			System.out.println("Invalid Day");
		}
		
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
	
<<<<<<< HEAD
}
=======
}
>>>>>>> f5ddcb2 (khoi tao)
