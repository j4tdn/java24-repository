package ex02;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(8));
	}
	public static boolean isSpecialNumber(int S) {
		int sum =0;
		int n = 1;
		while(sum<S) {
			sum +=n;
			n++;
		}
		return S==sum;
	}
	
}
