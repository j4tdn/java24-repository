package datastructure.primitive;

public class Ex01PrimitiveType {

	public static void main(String[] args) {
		
		// KDL nguyen thuy : int, char, float, double, boolean
		
		int digit; //Khai bao 1 bien ten la 'digit' kieu du lieu la int
		digit = 5; // gan' gia tri 5 cho bien 'digit'	
		
		//println : in xong xuong hang
		//print   : in xong khong xuong hang
		//ptinf   : in theo format	
		
		System.out.println(digit);
		System.out.println("Value----->" + digit);
		System.out.printf("Value %d",digit);
		
		
		//Day la bien cuc bo: local variable
		char letter = 'A';
		float point = 5.7f;
		double score = 8.2d;
		boolean isValid = true;
		
		// format -> ctrl shift f
		// ctrl alt up/down -> copy xuong hoac len
		
		System.out.println("Letter----->" + letter);
		System.out.println("Point----->" + point);
		System.out.println("Score----->" + score);
		System.out.println("isValid----->" + isValid);
		
	}
	
}
