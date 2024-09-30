package datastructure.primitive;

public class Ex01PrimitiveType {

	
//	KDL nguyên thủy: int char double float boolean
	
	public static void main(String[] args) {
		int digit;
		digit = 5;
		
		System.out.println(digit);
		System.out.println("Value --> "+ digit);
		System.out.printf("Value --> %d", digit);
		
//		local variable
		char letter = 'A';
		float point = 5.7f;
		double score = 8.2d;
		boolean isValid = true;
		
		System.out.println("letter : " + letter);
		System.out.println("point : " + point);
		System.out.println("score : " + score);
		System.out.println("isValid : " + isValid);
		
	}
}
