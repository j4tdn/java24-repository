package view;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập n số ngẫu nhiên: ");
		int n = ip.nextInt();
		
		int[] randomNumbers = new int[n];
		
		int count = 0;
		while (count < n) {
			int  random = (int) Math.floor(Math.random() * 96) + 5;
			boolean exists = false;
			for (int i = 0; i < count; i++) {
				if (randomNumbers[i] == random) {
                    exists = true;
					break;
				}
			}
			
			if (!exists) {
                randomNumbers[count] = random;
                count++;
            }
		}
		
		System.out.println("Mảng khi chưa sắp xếp: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

		int d7 = 0;
		int d5 = 0;
		for (int i = 0; i < n; i++) {
			if (randomNumbers[i] % 7 == 0 & randomNumbers[i] % 5 != 0) {
				d7++;
			}
			if (randomNumbers[i] % 7 != 0 & randomNumbers[i] % 5 == 0) {
				d5++;
			}
		}
		int mid = n - d7 - d5;
		int[] array7 = new int[d7];
		int[] array5 = new int[d5];
		int[] arrayMid = new int[mid];
		
		int j = 0;
		int k = 0;
		int m = 0;
		for (int i = 0; i < n; i++) {
			if (randomNumbers[i] % 7 == 0 & randomNumbers[i] % 5 != 0) {
				array7[j] = randomNumbers[i];
				j++;
			}
			else if (randomNumbers[i] % 7 != 0 & randomNumbers[i] % 5 == 0) {
				array5[k] = randomNumbers[i];
				k++;
			} else {
				arrayMid[m] = randomNumbers[i];
				m++;
			}
		}

		System.out.println("\nMảng sau khi sắp xếp: ");

		for (int num : array7) {
			System.out.print(num + " ");
		}
		
		if ((d7 > 0 & mid > 0) | (d7 > 0 & d5 > 0)) {
			System.out.print("| ");
		}

		for (int num : arrayMid) {
			System.out.print(num + " ");
		}
		
		if ((mid > 0 & d5 > 0) | (d7 > 0 & d5 > 0)) {
			System.out.print("| ");
		}
		
		for (int num : array5) {
			System.out.print(num + " ");
		}
		
//		int[] mergeArray = new int[n];
//        for (int i = 0; i < array7.length; i++) {
//            mergeArray[i] = array7[i];
//        }
//        
//        for (int i = 0; i < arrayMid.length; i++) {
//            mergeArray[d7 + i] = arrayMid[i];
//        }
//        
//        
//        for (int i = 0; i < array5.length; i++) {
//            mergeArray[d7 + mid + i] = array5[i];
//        }
//
//		System.out.println("\nMảng sau khi sắp xếp: ");
//        for (int num : mergeArray) {
//            System.out.print(num + " ");
//        }
		
		ip.close();
	}

}
