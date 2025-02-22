package ex01;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int n = rd.nextInt(9) + 1;
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(41) + 10;	
			}
		System.out.println("Mảng ban đầu: ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		//loại bỏ các phàan tử trùng nhau
		System.out.println("Loại bỏ các phần tử trùng nhau :");
		for(int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println();
		
		//so sánh
		int mid = n / 2;
        double sumFirstHalf = 0, sumSecondHalf = 0;
        for (int i = 0; i < mid; i++) {
            sumFirstHalf += arr[i];
        }
        for (int i = n - mid; i < n; i++) {
            sumSecondHalf += arr[i];
        }
        double avgFirstHalf = (mid > 0) ? (sumFirstHalf / mid) : 0;
        double avgSecondHalf = (mid > 0) ? (sumSecondHalf / mid) : 0;
        
        System.out.println("Trung bình nửa đầu: " + avgFirstHalf);
        System.out.println("Trung bình nửa cuối: " + avgSecondHalf);
        if (avgFirstHalf > avgSecondHalf) {
            System.out.println("Nửa đầu lớn hơn.");
        } else if (avgFirstHalf < avgSecondHalf) {
            System.out.println("Nửa cuối lớn hơn.");
        } else {
            System.out.println("Hai nửa bằng nhau.");
        }
        //
        int[] distinct = new int[n]; 
        int distinctCount = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < distinctCount; j++) {
                if (arr[i] == distinct[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct[distinctCount] = arr[i];
                distinctCount++;
            }
        }
        
        if (distinctCount < 3) {
            System.out.println("Số lớn thứ 3: Không tồn tại");
        } else {
            for (int i = 0; i < distinctCount - 1; i++) {
                for (int j = i + 1; j < distinctCount; j++) {
                    if (distinct[i] > distinct[j]) {
                        int temp = distinct[i];
                        distinct[i] = distinct[j];
                        distinct[j] = temp;
                    }
                }
            }
            int thirdLargest = distinct[distinctCount - 3];
            System.out.println("Số lớn thứ 3: " + thirdLargest);
        }
		
		
	}
}
