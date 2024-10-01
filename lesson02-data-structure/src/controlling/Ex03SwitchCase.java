package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	
	public static void main(String[] args) {
		
		/*
		  Sử dụng switch case để làm gọn code khi các BT if else là so sánh =
		  
		  Câu 1: Random số ngẫu nhiên từ 1 - 5
		  --> In ra từ tiếng anh tương ứng với số đó
		  
		  
		 */
		
		Random rd = new Random();
		int number = rd.nextInt(1,6);
		System.out.println("number--> "+number);
		
		/*
		  Nếu như switch case đúng mà không có break thì nó bỏ qua kiểm tra các case còn lại mà nhảy vào 
		  các code bên trong case đó và thực thi
		  Dừng lại khi
		  + Gặp break
		  + xong hết Default
		 */
		
		
		switch(number) {
		case 1: 
			System.out.println("ONE");
			break;// Thoát khỏi switch case
		case 2: 
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
		    break;
		case 4: 
			System.out.println("FOUR");
			break;	
		case 5: 
			System.out.println("FIVE");
			break;	
			
		default: //else
			System.out.println("Unsupported ...");
	}
		
		System.out.println("\n============================\n");
		
		switch(number) {
		case 2,3,4,5,6:
			System.out.println("Week Day");
			break;
		case 7,8:
			System.out.println("Weekend day");
			break;
		default:
			System.out.println("Invalid Day");
		}

}
}
