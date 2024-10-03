package controlling;

import java.util.Random;

public class Ex03SwitchCase {
    public static void main(String[] args) {
		
    	/*
    	  Sử dụng switch để làm gọn code khi các biểu thức if else là so sánh bằng
    	  
    	  Câu 1: Random một số ngẫu nhiên từ 1 đến 5, sau đó in ra từ tiếng anh tương ứng với số đó 
    	  
    	 */
    	Random rd=new Random();
    	int number = rd.nextInt(1,10);
    	System.out.println("number="+number + "\n");
    	
    	/*
    	 Nếu như switch case đúng mà sau đó không có break
    	 Bỏ qua kiểm tra các case còn lại mà nhảy vào luôn code bên trong case thực thi
    	 Dừng lại khi
    	 +gặp break
    	 +xong hết defaulf
    	 */
    	
    	switch(number) {
    	case 1: 
    		System.out.println("ONE");
    		break;
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
    		default: 
    			System.out.println("--> Unsupported...");
    	}
    	System.out.println("\n==============\n");
    	switch (number) {
    	case 2, 3, 4, 5, 6:
    		System.out.println("Week Day");
    		break;
    	case 7, 8:
    		System.out.println("Week Kend");
    		break;
    	default: 
    		System.out.println("Invalid Day");
    		
    	}
    	
    	
	}
}
