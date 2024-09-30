package homework;

public class Ex09 {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}
	
	public static void main(String[] args) {
		
		int cnt = 1;
		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)){
				++cnt;
			}
			if (cnt > 200) {
				cnt = i;
			break;
			}
		}
		System.out.print("Số nguyên tố thứ 200 là: " + cnt);
		
	}
	
}
