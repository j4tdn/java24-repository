package exam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		isSpecialNumber(ip.nextInt());
	}
	public static boolean isSpecialNumber(int x) {
		int sum = 0;
		int cout = 0;
		while(true) {
			cout++;
			if(sum == x) {
				return true;
			}else if (sum > x) {
				return false;
			}
			sum += cout;
		}
	}
}
