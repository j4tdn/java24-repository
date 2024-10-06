package view;

import utils.NumberUtils;

public class Ex03Factorial {

	public static void main(String[] args) {
		
		int[] elements = {5, 8, 12, 3};
		
		for(int element: elements) {
			System.out.println(element + " ! = " + NumberUtils.factorial(element));
		}
			
	}
	
}
