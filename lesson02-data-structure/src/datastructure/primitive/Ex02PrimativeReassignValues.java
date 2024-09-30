package datastructure.primitive;

public class Ex02PrimativeReassignValues {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88f;
		float f2 = 99f;
		long l3 = Integer.MAX_VALUE + 1;
				
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)", a, b, c, f1, f2);
		
		f1 = a;			//gán KDL có phạm vi nhỏ hơn 
		b = (int)f2;	//ngược lại: có vấn đề
		c = (int)l3;	//Trường hợp VP có giá trị lớn hơn KDL của VT => 
	}
}
