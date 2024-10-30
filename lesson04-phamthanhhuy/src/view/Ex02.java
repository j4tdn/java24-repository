package view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = rd.nextInt(1, 100);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("=========================================================");
		System.out.println("Các số chia hết cho 7: "+Arrays.toString(div7(arr)));
		System.out.println("Các số chia hết cho 5: "+Arrays.toString(div5(arr)));
		System.out.println("Các số không chia hết cho 7 và 5:"+Arrays.toString(noDiv75(arr)));
		System.out.println("==========================================================");
		System.out.printf("%s | %s | %s",Arrays.toString(div7(arr)),Arrays.toString(noDiv75(arr)),Arrays.toString(div5(arr)));
	}

	private static int[] div7(int[] elements) {
		int count = 0;
		int[] result = new int[elements.length];
		for (int element : elements) {
			if (element % 7 == 0) {
				result[count] = element;
				count++;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] div5(int[] elements) {
		int[] result = new int[elements.length];
		int count =0;
		for(int element:elements) {
			if(element % 5 ==0) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] noDiv75(int[] elements) {
		int[] result = new int[elements.length];
		int count =0;
		for(int element:elements) {
			if(element % 5 !=0 && element % 7 != 0) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
