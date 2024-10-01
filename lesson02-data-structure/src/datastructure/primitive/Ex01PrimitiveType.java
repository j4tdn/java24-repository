package datastructure.primitive;

public class Ex01PrimitiveType {
		
	// KDL nguyên thủy: int, char, float, double, boolean
	
	public static void main(String[] args) {
		int digit; //khai báo 1 biến tên là 'digit' có KDL là int
		digit = 5; // gán giá trị 5 cho biến digit
		
		System.out.println(digit);
		System.out.println("value -->" + digit );
		System.out.printf("value -->%d\n ", digit);
		
		//println: in xong xuống hàng
		//print: in xong không xuống hàng
		//printf: in theo format 
		
		// biến cục bộ: local variable
		char letter = 'A';
		float point = 5.7f;
		double score = 8.2d;
		boolean isValid = true;
		
		//format: ctrl shift f
		//copy: ctrl alt up/down
		
		System.out.println("letter --->" + letter);
		System.out.println("float --->" + point );
		System.out.println("double --->" + score);
		System.out.println("boolean --->" + isValid);
		
	}

}
