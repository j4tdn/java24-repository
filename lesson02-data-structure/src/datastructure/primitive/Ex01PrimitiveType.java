package datastructure.primitive;

import java.util.Arrays;

public class Ex01PrimitiveType {
	
	// KDL nguyên thủy: int, char, float, double, boolean
	
	public static void main(String[] args) {
		int digit; // khai báo 1 biến tên là 'digit' có KDL là int
		digit = 5; // gán giá trị 5 cho biến 'digit'
	
		// println: in xong xuống hàng
		// print  : in xong ko xuống hàng
		// printf : in theo format
		
		System.out.println(digit);
		System.out.println("value --> " + digit);
		System.out.printf("value --> %d\n", digit);
		
		// biến cục bộ: local variable
		char letter = 'A';
		float point = 5.7f;
		double score = 8.2d;
		boolean isValid = true;
		
		// format: ctrl shift f
		// copy: ctrl alt up/down
		
		System.out.println("letter --> " + letter);
		System.out.println("point --> " + point);
		System.out.println("score --> " + score);
		System.out.println("isValid --> " + isValid);
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> f5ddcb2 (khoi tao)
