package homework;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
        int[] numbers = new int[5]; // Mảng lưu 5 số ngẫu nhiên
        int count = 0;
        Random random = new Random();

        while (count < 5) {
            int randNum = 20 + random.nextInt(11);
            
            
            
            if (!isDuplicate(numbers, randNum, count)) {
                numbers[count] = randNum;
                count++;
            }
        }

        // In ra 5 số ngẫu nhiên không trùng nhau
        System.out.print("5 số ngẫu nhiên không trùng nhau từ 20 đến 30 là: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Hàm kiểm tra xem số đã tồn tại trong mảng hay chưa
    private static boolean isDuplicate(int[] arr, int num, int count) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == num) {
                return true; // Nếu số đã tồn tại thì trả về true
            }
        }
        return false; // Nếu không trùng thì trả về false
    }
}
