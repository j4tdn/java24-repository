package view;

import java.util.Arrays;

import bean.Item;

public class Ex01Initial {
	
	public static void main(String[] args) {
		
		//khai báo, khởi tạo mảng
		// trước khi tạo mảng --> biết được mảng đó sẽ lưu tối đa bao nhiêu phần tử
		int[] digit = new int[8];
		
		String[] sequences = {"hell0", "welcome", "language"};
		
		double[] avgPoints = new double[] {2,8d, 8.2d, 12, 6};
		
		Item[] items = new Item[4];
		
		System.out.printf("digit %s\n", Arrays.toString(digit));
		System.out.printf("sequences %s\n", Arrays.toString(sequences));
		System.out.printf("avgPoints %s\n", Arrays.toString(avgPoints));
		
		System.out.printf("items %s\n", Arrays.toString(items));
		
		items[0] = new Item();
		items[0].setSalesPrice(999d);
		
		System.out.printf("items %s\n", Arrays.toString(items));
	}
	
	private static double[] gểnatePoints() {
		return new double[] {2,8d, 8.2d, 12, 6};
	}

}

