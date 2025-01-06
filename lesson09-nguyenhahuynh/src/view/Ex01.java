package view;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] array1 = {2, 8, 9, 1, 6};
		int[] array2 = {2, 1, 1, 8, 9};
		int[] arrays = new int[5];
		int s = 0;
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					arrays[s] = array2[j];
					s++;
				}
			}
		}
		
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
	}
}
