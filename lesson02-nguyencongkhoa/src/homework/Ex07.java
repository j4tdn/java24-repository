package homework;

import view.Utilities;

public class Ex07 {
	
	public static void main(String[] args) {
		
		int num = Utilities.inputInt();
		
		if (num == -1) {
			System.out.println("Đã hết lượt nhập lại (tối đa 5 lần)!!");
			return;
		}
		
		if (num == 0) {
			System.out.println(num);
		}
		
		String res = "";
		while (num > 0) {
			if (num % 2 == 0) {
				res = '0' + res;
			} else {
				res = '1' + res;
			}
			num /= 2;
		}
		
		System.out.println(res);
		
		
	}
	
}
