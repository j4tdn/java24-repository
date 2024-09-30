package datastructure.primitive;

public class Ex04PassParamViaMethod {
	public static void main(String[] args) {
			int number = 22;
			int age = 18;
			
			modify(number);
			
			age = number;
			System.out.println("number --> " + number);
			System.out.println("age --> " + age);
			
			int a1 = 11;
			int a2 = 22;
			System.out.printf("\na1(%s) a2(%s)\n", a1, a2);
	}
	private static void modify(int number) {
		 number = 9999;
	}
	
	
}
