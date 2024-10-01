package exercises;

import java.util.Scanner;

public class baitap1 {

	public static void kiemTraSoNguyen(Integer n) {
		if (n == null) 
			System.out.println("vui long thu lai sau");
		 else if(n % 2 == 0) 
			System.out.println("true");
			else
			System.out.println("false");
	}

	public static Integer nhapSoNguyen(char c) {
		int n;
		Scanner ip = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("Nhap so nguyen duong %s: ", c);

			try {
				n = Integer.parseInt(ip.nextLine());
				return n;

			} catch (Exception e) {
				System.out.println();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		/*
		 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
		 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
		 * không hợp lệ (tối đa 5 lần)
		 */
		Integer n = nhapSoNguyen('N');
		kiemTraSoNguyen(n);

	}
}
