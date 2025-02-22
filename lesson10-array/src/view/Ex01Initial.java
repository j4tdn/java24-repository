package view;

import java.util.Arrays;

import bean.Item;

public class Ex01Initial {

	public static void main(String[] args) {
		
		// Khai báo, khởi tạo mảng
		// Trước khi tạo mảng --> biết được mảng đó sẽ lưu tối đa bao nhiêu phần tử
		int[] digits = new int[8];
		String[] sequences = {"hello", "welcome", "language"};
		double[] avgPoints = generatePoints();
		Item[] items = new Item[4];
		
		System.out.printf("digits %s\n", Arrays.toString(digits));
		System.out.printf("sequences %s\n", Arrays.toString(sequences));
		System.out.printf("avgPoints %s\n", Arrays.toString(avgPoints));
		items[0] = new Item();
		items[0].setSalesPrice(999d);
		System.out.printf("items %s\n", Arrays.toString(items));
	}
	
	private static double[] generatePoints() {
		return new double[] {2, 8d, 8.2d, 8.8d, 12, 6d};
	}
}
