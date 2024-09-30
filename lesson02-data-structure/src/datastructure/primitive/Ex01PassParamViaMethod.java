package datastructure.primitive;

public class Ex01PassParamViaMethod {
	public static void main(String[] args) {
		int number = 22;
		int age = 18;
		modify(number);
		age = number;
		
		System.out.println("number --> " + number);
		System.out.println("age --> " + age);
		
		int a1 = 11;
		int a2 = 22;
		System.out.printf("a1(%s) a2(%s)\n", a1, a2);
		
		swap(a1, a2);

		System.out.printf("a1(%s) a2(%s)\n", a1, a2);
	}
	
	public static void swap(int a1, int a2) {
		int temp = a1;
		a1 = a2;
		a2 = temp;
	}
	
	private static void modify(int number) {
		number = 9999;
	}
}
