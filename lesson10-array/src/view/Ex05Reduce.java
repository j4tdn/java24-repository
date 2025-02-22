package view;

public class Ex05Reduce {
	
	public static void main(String[] args) {
		int[] arr = { 20,51,42,34,45};
		
	}
	
	public static int calSum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int calMul(int[] arr) {
		int mul=1;
		for(int i=0; i<arr.length;i++) {
			mul *= arr[i];
		}
		return mul;
	}
	
	public static int findMax(int[] arr) {
		int max=1;
		for(int i=0; i<arr.length;i++) {
			max *= arr[i];
		}
		return mul;
	}
}
