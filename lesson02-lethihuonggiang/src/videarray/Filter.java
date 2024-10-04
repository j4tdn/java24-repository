package videarray;

import java.util.Arrays;

/**
 * 1.tìm những phần tử lẻ trong mảng số nguyên
 * input : mảng
 * output:mảng số lẻ
 */
public class Filter {
	public static void main(String[] args) {
		int[] numbers = {23,25,26,33,66};
	
		int[] oddNumbers = 	findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddNumbers(int[] elements){
		int[] result=new int[elements.length];
		int count = 0;
		for(int element:elements) {
			if(element % 2 != 0) {
				result[count] = element;
				count++;
			}
		}
		return result;
	}
}
