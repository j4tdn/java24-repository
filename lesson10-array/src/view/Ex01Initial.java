package view;

import java.util.Arrays;

import bean.Item;

public class Ex01Initial {
	
	public static void main(String[] args) {
		int[] digits = new int[8];
		String[] sequences = {"hello", "welcom", "language"};
//		double[] avgPoint = {2.8d, 8.2d, 8.8d, 12.6d };
		double[] avgPoint = generatePoints();
		Item[] items = new Item[4];
		
		System.out.println("digits "+ Arrays.toString(digits));
		System.out.println("sequences "+ Arrays.toString(sequences));
		System.out.println("avgPoint " + Arrays.toString(avgPoint));
		System.out.println("items " + Arrays.toString(items));
		items[0] = new Item();
		items[0].setName("huuthang");
		System.out.println("name " + Arrays.toString(items));
		
	}
	
	private static double[] generatePoints() {
		return new double[] {2.8d, 8.2d, 8.8d, 12.6d };
	}
	
}
