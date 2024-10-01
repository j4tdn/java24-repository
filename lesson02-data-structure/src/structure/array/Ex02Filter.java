package structure.array;

import java.util.Arrays;

/*
  1. Tìm những phần tử lẻ trong mảng số nguyên
  		Input: Mảng
  		Output: Mảng số lẻ
 
 */
public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = {23,25,16,28,66};
		
		
		System.out.println(Arrays.toString(findOddNumbers(numbers)));
		
		
	}
	
	private static int[] findOddNumbers(int[] elements) {
		// index: 0  1 2 3 4
		// value: 23 25 0 0 0
//		int[] oddElements = new int[elements.length];
//		int count = 0;
//		for(int element: elements) {
//			if(element % 2 != 0) {
//				oddElements[count] = element;
//				count++;
//			}
//		}
//		int[] result = new int[count];
//		for(int i = 0; i < count; i++) {
//			result[i] = oddElements[i];
//		}
//		
//		return result;
		
		int [] result = new int[elements.length];
		int count = 0;
		for(int element: elements) {
			if(element % 2 !=0) {
				result[count] = element;
				count ++;
			}
		}
		return Arrays.copyOfRange(result,0,count);
	}
	
}
