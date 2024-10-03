package exercises;

public class Ex05 {
	public static void main(String[] args) {
		int n;
		while (true) {
			n = checkN.input();
            if (n >= 10) {
                break;
            } else {
                System.out.println("Số nhập vào phải có ít nhất 2 chữ số. Vui lòng nhập lại.");
            }
		}
		
		if (isPalindrome(n)) {
			System.out.println(n + " là số đối xứng");
		} else {
			System.out.println(n + " không phải là số đối xứng");
		}
	}
	
	public static boolean isPalindrome (int n) {
		int oldN = n;
		int newN = 0;
		
		while (n > 0) {
			int lastDigit = n % 10;
			newN = newN * 10 + lastDigit;
			n /= 10;
		}
		
		return newN == oldN;
	}
}
