package view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.annotation.processing.Generated;

public class Ex01 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(9) + 1;
		
		int[] array = arrayRandom(n, 10, 50);
		System.out.println("Mảng ban đầu: " + Arrays.toString(array));
		
		int[] arrayAfter = removeDuplicateElements(array);
		System.out.println("Mảng sau khi xóa trùng: " + Arrays.toString(arrayAfter));
		
	}
	
	private static int[] arrayRandom(int size, int min, int max) {
		Random rd = new Random();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = rd.nextInt(max - min + 1) + min;
		}
		return array;
	}
	
	private static  int[] removeDuplicateElements(int[] array) {
		int[] a1 = new int[51];
		for (int number : array) {
			a1[number]++;
		}
		
		int count = 0;
		for (int number : array) {
			if (a1[number] == 1) {
				count++;
			}
		}
		
		int[] a2 = new int[count];
		int index = 0;
		
		for (int number : array) {
            if (a1[number] == 1) {
                a2[index++] = number;
            }
        }
		
		return a2;
	}
}
