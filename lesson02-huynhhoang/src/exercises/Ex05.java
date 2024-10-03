package exercises;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N từ bàn phím
        System.out.print("Nhập số nguyên dương N (có tối thiểu 2 chữ số): ");
        int number = scanner.nextInt();

        // Kiểm tra N có tối thiểu 2 chữ số
        if (number < 10) {
            System.out.println("N phải có tối thiểu 2 chữ số.");
        } else {
            // Gọi hàm kiểm tra số đối xứng
            if (reversed(number)) {
                System.out.println(number + " là số đối xứng.");
            } else {
                System.out.println(number + " không phải là số đối xứng.");
            }
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
   

    // Hàm kiểm tra số đối xứng
    private static boolean reversed(int n) {
		int original = n;
		int reversed = 0;
		while (original > 0) {
	        int digit = original % 10;
	        reversed = reversed * 10 + digit;
	        original /= 10;
	    }
		return n == reversed;
	}
	
}