package view;

import java.util.Scanner;

import utils.Ex01Utils;

public class Ex01CheckMultipleOf2 {

	/*
	 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
	 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
	 * không hợp lệ (tối đa 5 lần)
	 */

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int n = Ex01Utils.testInput(5, 0, "Nhập vào số nguyên N ");
		if(n % 2 == 0) {
			System.out.println(n + " là bội của 2 ");
		} else {
			System.out.println(n + " không phải là bội của 2 ");
		}
		System.out.println("Kết thúc chương trình");
		ip.close();
	}

}
