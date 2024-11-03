package Ex04;

public class Ex04 {
	public static void main(String[] args) {
		int[] a1 = {1,5,8,9,2,5,9};
		int[] a2 = {4,2,6,6,4,15,1};
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
