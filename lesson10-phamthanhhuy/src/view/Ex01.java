package view;

import java.util.Arrays;

import java.util.Random;

import utils.*;

public class Ex01 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 3, 1, 18 };

		// Xóa các phần tử trùng

		System.out.println(Arrays.toString(numbers));

		System.out.println("Xóa trùng --> " + Arrays.toString(UtilsEx01.removeDuplicate(numbers)));

		System.out.println("\n====================================\n");
		// So sánh tổng 2 nửa chuỗi

		int midVal = (int) (Math.round(numbers.length) / 2);

		int[] firstHalf = Arrays.copyOfRange(numbers, 0, midVal);
		System.out.println("Nửa đầu --> " + Arrays.toString(firstHalf));
		System.out.println("Tb Nửa đầu --> " + UtilsEx01.averageOf(firstHalf));

		int[] secondHalf = Arrays.copyOfRange(numbers, midVal, numbers.length);
		System.out.println("Nửa sau --> " + Arrays.toString(secondHalf));
		System.out.println("Tb Nửa sau --> " + UtilsEx01.averageOf(secondHalf));

		System.out.println("\n====================================\n");

		// Tìm số lớn thứ 3
		UtilsEx01.bubbleSort(numbers);
		System.out.println("Mảng sau khi được sắp xếp: " + Arrays.toString(numbers));

		System.out.println("Phần tử lớn thứ 3 là: " + numbers[numbers.length - 3]);

	}

}
