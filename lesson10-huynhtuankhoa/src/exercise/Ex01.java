package exercise;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * int[] numbers = new int[9]; for (int i = 0; i < numbers.length; i++) {
		 * numbers[i] = new Random().nextInt(10, 50); }
		 */
		 
		// Section 1
		int[] numbers = {10, 14, 19, 42, 19, 10, 35, 19, 53, 53, 42, 42, 42};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(removeSameElement(numbers)));
		// Section 2
		try {
			System.out.println(compareAvgOfHalfArr(numbers));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		// Section 3
		System.out.println(findThirdMax(numbers));
		
	}
	
	public static int[] removeSameElement(int[] numbers) {
		int[] target = new int[numbers.length];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			boolean hasSame = false;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					numbers = remove(numbers, j);
					hasSame = true;
				}
			}
			if (!hasSame) {
				target[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	public static int[] remove(int[] src, int index) {
		int[] target = new int[src.length - 1];
		for (int i = 0; i < index; i++) {
			target[i] = src[i];
		}
		for (int i = src.length - 1; i > index; i--) {
			target[i - 1] = src[i];
		}
		return target;
	}
	
	public static String compareAvgOfHalfArr(int[] numbers) {
		if (numbers.length % 2 != 0) {
			throw new IllegalArgumentException("Array must have 2n elements!!!");
		}
		int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length/2);
		System.out.println(Arrays.toString(firstHalf));
		int[] lastHalf = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);
		System.out.println(Arrays.toString(lastHalf));

		
		int firstSum = sumElementInArray(firstHalf);
		System.out.println(firstSum);
		int lastSum = sumElementInArray(lastHalf);
		System.out.println(lastSum);
		
		if (firstSum > lastSum) { 
			return "Sum of first half > Sum of last half"; 
		} else if (firstSum < lastSum) { 
			return "Sum of first half < Sum of last half";
		} else { 
			return "Sum of first half = Sum of last half"; 
		}
		
	}
	
	public static int sumElementInArray(int[] numbers) {
		int sum = 0;
		for (int num: numbers) {
			sum += num;
		}
		return sum;
	}
	
	public static int findThirdMax(int[] numbers) {
		int max = 0;
		int numOfFindingMax = 3;
		while (numOfFindingMax > 0) {
			max = findMax(numbers);
			numbers = removeElement(numbers, max);
			numOfFindingMax--;
		}
		return max;
	}
	
	public static int findMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number: numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	
	public static int[] removeElement(int[] numbers, int element) {
		int[] target = new int[numbers.length];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != element) {
				target[count++] = numbers[i];
			}
		}
		return target;
	}
	
	
	
	
}
