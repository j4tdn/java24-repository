package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] numbers = new int[9];
		for (int i =0; i < numbers.length; i++) {
			numbers[i] =  rd.nextInt(10,51);
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("mang khong trung: "+Arrays.toString(removeDup(numbers)));
		compareAvg(numbers);
		System.out.println("phan tu lon thu 3: "+ findThirdLargest(numbers));
	
	}
	private static boolean isDup(int element, int[] numbers) {
		int count =0;
		for (int i = 0; i < numbers.length; i++) {
			if (element == numbers[i]) {
				count++;
			}
			if (count > 1) {
				return true;
			}
		}
		return false;
	}
	private static int[] removeDup (int[] numbers) {
		int[] res = new int[numbers.length];
		int count =0;
		for (int i =0; i < numbers.length; i++) {
			if (!isDup(numbers[i], numbers)) {
				res[count++] =  numbers[i];
			}
		}
		return Arrays.copyOfRange(res, 0, count);
	}
	private static void compareAvg(int[] numbers) {
		double avg1 = 0;
		double avg2 = 0;
		for (int i = 0 ; i< numbers.length; i++) {
			if (i < (numbers.length)/2) {
				avg1 += numbers[i];
			} else if (i < numbers.length) {
				avg2 += numbers[i];
			} else avg2 += numbers[i];
			
		}
		System.out.println("avg1 : "+ avg1);
		System.out.println("avg2 : "+ avg2);
		System.out.println("gtri trung binh cua "+ (numbers.length)/2 +" ptu dau: "+avg1/((numbers.length)/2)
				+ "\ngtri trung binh cua "+((numbers.length)-(numbers.length)/2) +" ptu sau: "+ avg2/((numbers.length)-(numbers.length)/2));
		
	}
	private static int findThirdLargest (int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		for (int i= 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest && numbers[i] != largest) {
				thirdLargest = secondLargest;
				secondLargest = numbers[i];
			} else if (numbers[i] > thirdLargest  && numbers[i] != secondLargest) {
				thirdLargest = numbers[i];
			}
		}
		
		return thirdLargest;
		}
	}
	


