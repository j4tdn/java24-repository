package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex05 {
//	Xâu s1 có dộ dài m và s2 có độ dài n ( m,n là hai số tự nhiên; n,m<250)
//	Biết rằng s1,s2 chỉ chứa các kí tự ‘A’...’Z’.
//	Yêu cầu: Hãy viết phương trình tìm xâu con chung dài nhất của xâu s1 và s2.
//
//	Dữ liệu vào: Nhập từ bàn phím 2 xâu s1 và s2.
//	Kết quả: Xuất ra màn hình xâu con chung của 2 xâ s1 và s2.
//	Example:
//	Input: S1:ABCEDEABC
//	S2:ABCEDCBBCK
//	Output: ABCED

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a;
		String b;

		do {
			System.out.print("Nhập chuỗi 1: ");
			a = ip.nextLine();
			System.out.print("Nhập chuỗi 2: ");
			b = ip.nextLine();
		} while (!checkString(a) && !checkString(b));
		System.out.println(commonSubstring(a, b));

		ip.close();
	}

	private static boolean checkString(String str) {
		return Pattern.matches("^[A-Z]+", str);
	}

	private static String commonSubstring(String a, String b) {
		String result = "";

		char[] str1 = a.toCharArray();
		char[] temp = new char[str1.length];
		int count = 0;
		for (char c1 : str1) {
			if (b.indexOf(c1) != -1) {
				if (count == 0) {
					result += c1;
					temp[count] += c1;
					count++;
				}
				int dem = 0;
				for (int i = 0; i < count; i++) {
					if (c1 != temp[i]) {
						dem++;
					}
				}
				if (dem == count) {
					temp[count] = c1;
					result += c1;
					count++;
				}
			}
		}

		return result;
	}
}
