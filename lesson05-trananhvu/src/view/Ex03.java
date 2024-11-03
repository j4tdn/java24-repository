package view;

import java.util.Scanner;

public class Ex03 {
	private static int getMaxValidNumber(String s) {
		int k = 0;
		int res = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			k = 0;
			while (ch[i] >= '0' && ch[i] <= '9') {
				k = k * 10 + Integer.parseInt(String.valueOf(ch[i]));
				i++;
				if (i > s.length() - 1)
					break;
			}
			res = k > res ? k : res;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap chuoi S:");
		String s = ip.next();
		int res = getMaxValidNumber(s);
		System.out.println(res);
		ip.close();
	}
}
