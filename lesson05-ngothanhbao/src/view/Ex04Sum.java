package view;

public class Ex04Sum {

	public static void main(String[] args) {
		int[] a = {1,5,8,9,2,5,9};
		int total = sum(a);
		System.out.println("Tong cac phan tu: "+ total);
	}
	
	public static int sum(int[] elements) {
		int sum = 0;
		for(int i = 0; i < elements.length - 1 ;i++) {
			for(int j = i + 1;j < elements.length;j++) {
				if(elements[i] != elements[j] && elements[i] != maxValue(elements) && elements[i] != minValue(elements) ) {
					sum = sum + elements[i];
				}
			}
		}
		return sum;
	}
	
	public static int maxValue(int[] elements) {
		int maxVal = 0;
		for(int i = 0;i < elements.length;i++) {
			if(elements[i] > elements[i + 1]) {
				maxVal = elements[i];
			}
		}
		return maxVal;
	}
	
	public static int minValue(int[] elements) {
		int minVal = 0;
		for(int i = 0;i < elements.length;i++) {
			if(elements[i] < elements[i + 1]) {
				minVal = elements[i];
			}
		}
		return minVal;
	}
	
}
