package datastructure.primitive;

public class Ex01PrimitiveType {
	
	public static void main(String[] args) {
		
		// KDL nguyên thủy: int, char, float, double, boolean
		
		int digit; //Khai báo biến digit có KDL là int
		digit = 5; // gán gtri 5 cho biến digit
		
		System.out.println(digit);
		System.out.println("value --> " + digit);
		System.out.printf("value --> %d\n", digit);
	
		// biến cục bộ: local variable
		char letter = 'A';
		float point = 5.7f;
		double score = 8.2d;
		boolean isValid = true;
		
		System.out.println("letter --> " + letter);
		System.out.println("point --> " + point);
		System.out.println("score --> " + score);
		System.out.println("isValid --> " + isValid);
	}
}
