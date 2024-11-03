package view;

public class Ex01 {
	public static void main(String[] args) {

		System.out.println(isPowerOf(6, 2));
	}

	public static boolean isPowerOf(int a, int b) {
		int bigNumber = a;
		int smallNumber = b;
		if(a<b) {
			bigNumber = b;
			smallNumber = a;
		}
		while (bigNumber > smallNumber) {
			bigNumber = bigNumber / smallNumber;
			if (bigNumber == smallNumber)
				return true;
		}
		return false;
	}
}
