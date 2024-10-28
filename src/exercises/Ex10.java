package exercises;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
	    Random rd = new Random();
	    int[] arr = new int[5];
	    int count = 0;
	    
	    while (count < 5) {
	        int num = rd.nextInt(20, 31);
	        if (isDifferent(arr, num, count)) {
	            arr[count] = num;
	            count++;
	        }
	    }
	    
	    String result = "";
	    for (int num : arr) {
	        result += num + " ";
	    }
	    System.out.println(result.trim());
	}

	private static boolean isDifferent(int[] arr, int number, int count) {
	    for (int i = 0; i < count; i++) {
	        if (number == arr[i]) {
	            return false;
	        }
	    }
	    return true;
	}
}	
	
