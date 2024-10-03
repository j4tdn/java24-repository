package untils;

import java.util.Scanner;

public class InputFilter2 {
	public static Integer inputData() {
		Integer n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so nguyen: ");
		for (int i = 0; i < 6; i++) {
			try {
				n = Integer.parseInt(ip.nextLine());
				if (n < 0) {
					throw new Exception();
				}
				if (n >= 20) {
					throw new Exception();
				}
				return n;
			} catch (Exception e) {
				if (i == 5) {
					System.out.println("Da het so lan nhap");
					break;
				}
				System.out.printf("Khong hop le, vui long nhap lai: ");

			}

		}
		ip.close();
		return n;
	};
}
