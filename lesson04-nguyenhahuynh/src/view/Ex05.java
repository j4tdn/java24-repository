package view;

import java.util.Scanner;

import utils.sortArray;

public class Ex05 {

    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập n số ngẫu nhiên: ");
		int n = ip.nextInt();
		
		int[] randomNumbers = new int[n];
		
		int count = 0;
		while (count < n) {
			int  random = (int) Math.floor(Math.random() * 18) + 3;
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
		

        sortArray.sortArrayByLevel(randomNumbers);

        System.out.println("\nMảng sau khi đã sắp xếp: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        
		ip.close();
    }
}
