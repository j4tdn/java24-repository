package view;

import java.util.Arrays;

public class Ex02 {

	// Logic tốt
	// Nhưng em còn dùng mấy hàm hơi cơ bản, a ko phải chê hay gì nhưng có thể
	// dùng các hàm có sẵn mình từng học để code ngẵn gọn hơn
	// Còn kết quả a test 1 vài case ok
	
	// Các code logic nhỏ nhỏ như e làm chỉ dùng khi các bài toán chuyên dùng thuật toán
	// nào đó mới code kiểu vậy, còn dạng xử lý vấn đề như này e nên dùng các hàm ngôn ngữ hỗ trợ sẽ tiện hơn
    private static String[] getLargestNumbers(String s) {

        int[] arr = new int[s.length()];
        String[] str = new String[s.length()];

        if (s.length() == 0 || s.matches("[a-zA-Z]+")) {
            str[0] = "0";
            return Arrays.copyOfRange(str, 0, 1);
        }

        int k = 0;
        int count = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            k = 0;
            while (ch[i] >= '0' && ch[i] <= '9') {
                k = k * 10 + Integer.parseInt(String.valueOf(ch[i]));
                i++;
                if (i > s.length() - 1) {
                    arr[count++] = k;
                    break;
                }
                if (ch[i] < '0' || ch[i] > '9') {
                    arr[count++] = k;
                }
            }
        }

        int[] arr2 = Arrays.copyOf(arr, count);
        Arrays.sort(arr2);

        for (int i = 0; i < count; i++) {
            str[i] = String.valueOf(arr2[i]);
        }
        return Arrays.copyOfRange(str, 0, count);
    }

    public static void main(String[] args) {
        String s = "sdsdssdsd322fdvb5775678";
        String[] arr = getLargestNumbers(s);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
