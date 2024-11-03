package exam;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = new int[] {1, 5, 8, 9, 2, 5 ,9};
		System.out.println(sum(a));
	}
	private static int sum(int[] array) {
		int[] food = array;
		int sum = 0;
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if( max < array[i])
				max = array[i];
			if( min > array[i])
				min = array[i];
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] != food[j] && array[i] != max && array[i] != min) {
					sum += array[i];
				}
			}
		}
		return sum;
	}
}
