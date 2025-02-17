package view;

import java.util.Arrays;

import bean.Tuple;
import functional.TuppleMapper;

public class Ex07MultipleDimensions {
	
	/*
	 Mảng 1 chiều: một phần tử là 1 single(nguyên thủy, đối tượng) value
	 Mảng 2 chiều: một phần tử là 1 mảng 1 chiều
	 ....
	 Mảng 3 chiều: một phần tử là 1 mảng 2 chiều
	 Mảng n chiều: một phần tử là 1 mảng n-1 chiều
	 -----
	 Thường sử dụng mảng 1 và đôi khi 2 chiều, mảng 3 chiều trở lên
	 --> sử dụng mảng đối tượng mảng 1 chiều
	 
	 * */
	
	
	public static void main(String[] args) {
		
//		String[] a1D = {"a", "b", "c", "d"};
//		
//		System.out.println("Duyet mang 1 chieu");
//		for(String element: a1D) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//		
		
//		String[][] a2D = {
//				{"a", "b", "c", "d"},
//				{"x", "y"},
//				{"k", "z", "w"}
//		};
//		System.out.println("Duyet mang 2 chieu");
//		for(String[] row: a2D) {
//			for (String cell: row) {
//				System.out.print(cell + " ");
//			}
//			System.out.println();
//		}
		
		
//		Mảng N chiều --> Mảng đối tượng 1 chiều có N phần tử
//		Duyệt, xử lý N vòng lặp --> Duyệt 1 vòng lặp
//		int[][] iA2D = {
//				{2, 4},
//				{4, 6}
//		};
		
		Tuple[] tA2D = {
			new Tuple(2, 4, 8, 1),
			new Tuple(4, 4),
			new Tuple(1, 1)
		};
		
		System.out.println("Thay the bang mang doi tuong");
		
		for (Tuple tuple: tA2D) {
			String row = "";
			row += getElement(tuple, t -> t.getX());
			row += getElement(tuple, t -> t.getY());
			row += getElement(tuple, t -> t.getZ());
			row += getElement(tuple, t -> t.getK());
			
			System.out.println(row);
		}
		
//		System.out.println("\n=====================\n");
//		System.out.println("Thay the strategy pattern: ");
		
		
	}
	
	private static String getElement(Tuple tuples, TuppleMapper tuppleMapper) {
		return (tuppleMapper.apply(tuples) != null) ? tuppleMapper.apply(tuples) + " " : " ";
	}
	
}













