package view;


import utils.Utilities;


public class Ex03MaxValidNumber {
	
	public static void main(String[] args) {
		String str = Utilities.getValue("Nhập chuỗi gồm các kí tự và chữ cái không dấu: ");
		
		if (getMaxValidNumber(str) == Integer.MIN_VALUE) {
			System.out.println("Chuỗi nhập vào không tồn tại ký tự số");
		} else {
			System.out.println("Số lớn nhất trong chuỗi nhập vào là: " + getMaxValidNumber(str));
		}
	}
	
	private static int getMaxValidNumber(String str) {
		int max = Integer.MIN_VALUE;
		String tmpInt = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				tmpInt += c;
			} else {
				int tmp = Integer.parseInt(tmpInt);
				if (tmp > max) {
					max = tmp;
				}
				tmpInt = "";
			}
		}
		
		return max;

	}
	
}
