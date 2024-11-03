package view;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("2 là số đặc biệt không "+isSpecialNumber(2));
		System.out.println("3 là số đặc biệt không "+isSpecialNumber(3));
	}
	private static boolean isSpecialNumber(int number) {
		if(number < 1) return false;
		int sum =0 ;
		for(int i = 0 ;sum <= number ; i ++) {
			sum = sum + i;
			if(sum == number) {
				return true;
			}
		}
		return false;
	}
}
