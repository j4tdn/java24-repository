package datastructure.primitive;

public class Ex01PrimitiveType {
	//KDL nguyen thuy: int, char, float, double,
	
	
	public static void main(String[] args) {
		int digit; // khai bao bien ten la 'digit' co KDL la int
		digit = 5; // gan gia tri 5 cho 'digit'
		//println = printline; in xong xuong hang
		//print = in k xuong dong
		//printf = in theo format
		
		System.out.println(digit);
		System.out.println("value---> " + digit);
		System.out.printf("value %d", digit);
		
		// bien cuc bo: local variable
		char letter = 'A';
		float point = 5.7f ;
		double score = 8.2d;
		boolean isValid = true;
		//format: ctrl shift f
		// copy: ctrl alt + mui ten xuong/ len	}
		
		System.out.println("letter---> " + letter);
		System.out.println("point---> " + point);
		System.out.println("score---> " + score);
		System.out.println("isValid---> " + isValid);
		

}
}