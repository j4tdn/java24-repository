package exercise05;

import java.util.Random;

public class SortNumber {

	public static void main(String[] args) {
		Random rd = new Random();
	int number = rd.nextInt(3,21);
	int[] array = new int[number];
	
	System.out.println("The series of number input: ");
	
	for (int i = 0; i < array.length; i++) {
		array[i] = rd.nextInt(1, 50);
		System.out.print(array[i] + ", ");
	}
	System.out.println();
	
	int tempSort;
	int tempSort2;
	for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (findLevelOfNumber(array[i]) > findLevelOfNumber(array[j])) {
                tempSort = array[i];
                array[i] = array[j];
                array[j] = tempSort;
            }
        }
    }
	
	System.out.println("The series of number output: ");
	
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + ", ");
	}
}

	public static int findLevelOfNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
