package datastructure.primitive;

public class Ex01PrimitiveType {
	
	//KDL nguyên thủy: int, char, float, double, boolean
	
	public static void main(String[] args) {
		int digit; //khai báo 1 biến tên là 'digit' có KDL là 'int'
		digit =5 ; //gán giá trị 5 cho biến 'digit'
		
		// println: in xong xuống hangf
		// print: in xong ko xuống hàng
		// printf: in theo format
		System.out.println(digit);
		System.out.println("value -->" + digit);
		System.out.printf("value -->%d",digit );
		
		char letter = 'A';
		float point = 5.7f;
		double score = 8.2d;
		boolean isValid = true;
		
		// format code: ctrl shift f
		// ctrl +alt + up/down
		
		System.out.println("letter -->" + letter);
		System.out.println("point -->" + point);
		System.out.println("score -->" + score);
		System.out.println("isValid -->" + isValid);
		
		
	}


}
