package view;

import java.util.Scanner;



public class Ex01 {
	/*
	 *  Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số a,b nhập vào từ bàn phím.
		Sử dụng try - catch để bẫy lỗi khi nhập sai dữ liệu, ví dụ nhập số nhưng nhập chữ.
		Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b
		hợp lệ thì in ra kết qua x = -b/a
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(true) {
			try {
				System.out.println("Nhập a : ");
				String aa = sc.nextLine();
				a = Integer.parseInt(aa);
				if(a==0) {
					throw new ArithmeticException("a không thể bằng 0");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Lỗi --> a không phải số, nhập lại");
			} catch(ArithmeticException e) {
				System.out.println("Lỗi --> "+e.getMessage());
			}
		}
		
		while(true) {
			try {
				System.out.println("Nhập b : ");
				String bb = sc.nextLine();
				b = Integer.parseInt(bb);
				break;
			} catch (NumberFormatException e) {
				System.out.println("a không phải số, nhập lại");
			}
		}
		
		int kq = -b/a;
		System.out.println("Kết quả : "+kq);
	}
}
