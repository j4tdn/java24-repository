package homework;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
        int number = 0;
        int temp = 0;
        int a = 0;

        // Cho phép người dùng nhập lại tối đa 5 lần
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập số nguyên dương N: ");
            String input = ip.nextLine();

            try {
            	number = Integer.parseInt(input);

                // Kiểm tra nếu N là số nguyên dương
                if (number > 9) {
                    temp = 1;
                    break;
                } else {
                    System.out.println("Lỗi! Vui lòng nhập lại");
                }
            } catch (Exception e) {
                System.out.println("Lỗi! Vui lòng nhập lại");
            }
        }

        // Nếu nhập đúng sau 5 lần hoặc ít hơn
        if (temp == 1) {
        	int n = number;
        	while(a == 0) {
        		int b = number;
        		a = a * 10 + b;
        	}
        	
        	if(a == n) {
        		System.out.println("True");
        	}
        	else {
        		System.out.println("False");
        	}
        }
        ip.close();
	}

}
