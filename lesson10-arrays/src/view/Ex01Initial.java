package view;

import java.util.Arrays;

import bean.Item;

public class Ex01Initial {
	public static void main(String[] args) {
		
		//khai báo, khởi tạo m
		//trước khi tạo mảng --> cần biết mảng lưu đc tối đa bnhiu phần tử
		int[] digits = new int[8];
		String[] sequences = {"hello", "welcome", "language"};
	
		// dùng để return về 1 mảng trong hàm để ngắn gọn code
		double[] avgPoints = new double [] {2.8d, 9.2d, 8.8d, 12.6d};
		
		Item[] items = new Item[4];
		
		System.out.printf("digits %s\n",Arrays.toString(digits));
		System.out.printf("sequences %s\n",Arrays.toString(sequences));
		System.out.printf("avgPoints %s\n",Arrays.toString(avgPoints));
	
		items[0] = new Item();
		items[0].setSalesPrice(999d);
		System.out.printf("item %s\n", Arrays.toString(items));
	
	}
		private static double[] generatePoints() {
			
			return new double[] {2.8d, 9.2d, 8.8d, 12.6d};
		}
	

}
