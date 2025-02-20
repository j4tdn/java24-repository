package view;

import java.util.Arrays;

import bean.Item;

public class Ex01Initial {
	public static void main(String[] args) {
		//Khai báo sử dụng mảng 
		//Trước khi tạo mảng --> Biết được mảng đó sẽ lưu tối đa bao nhiêu phần tử
		
		int[] digits = new int[8];
		String[] sequences = {"hello", "welcome","language"};
		double[] avgPointss = generatePoints();
		Item[] items = new Item[4];
		
		System.out.printf("digits %s\n", Arrays.toString(digits));
		System.out.printf("sequences %s\n", Arrays.toString(sequences));
		System.out.printf("avgPointss %s\n", Arrays.toString(avgPointss));
		items[0] = new Item();
		items[0].setSalesPrice(99d);
		
		System.out.printf("items %s\n", Arrays.toString(items));
		
		
	}
	
	private static double[] generatePoints() {
		return new double[] {2,8d, 8.2d, 8.8d};
	}
}
