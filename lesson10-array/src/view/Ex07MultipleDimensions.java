package view;

import bean.Tuple;
import functional.TupleMapper;

public class Ex07MultipleDimensions {
	
	/*
	 * Mảng 1 chiều : một phần tử là 1 single(nguyên thuỷ, đối tượng) value
	 * Mảng 2 chiều : Một phần tử là 1 mảng 1 chiều
	 * -----
	 * Mảng 3 chiều : một phần tử là 1 mảng 2 chiều
	 * Mảng n chiều : một phần tử là 1 mảng n-1 chiều
	 * -----
	 * Thường sử dụng mảng 1 và đôi khi 2 chiều, mảng 3 chiều trở lên
	 * --> sử dụng mảng đối tượng mảng 1 chiều
	 */
	public static void main(String[] args) {
		String[] a1D = {"a","b","c","d"};
		
		System.out.println("Duyệt mảng 1 chiều");
		for(String element: a1D) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
		
		String[][] a2D = {
				{"a","b","c","d"},
				{"x","y"},
				{"k","z","w"}
		};
		System.out.println("Duyệt mảng 2 chiều - forEach");
		for(String[] row:a2D) {
			for(String cell:row) {
				System.out.println(cell + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("Duyệt mảng 2 chiều - forIndex");
		for(int rowI = 0;rowI < a2D.length;rowI++) {
			for(int colI = 0; colI < a2D[rowI].length;colI++) {
				System.out.println(a2D[rowI][colI] + " ");
			}
			System.out.println();
		}
		// Mảng N chiều --> Mảng đối tượng 1 chiều có N phần tử
		// Diệt, xử lý N vòng lặp --> Duyệt 1 vòng lặp
		int[][] iA2D = {
				{2,4},
				{4,8}
		};
		
		Tuple[] tA2D = {
			new Tuple(2, 4),	
			new Tuple(4, 6)	
		};
		System.out.println("thay thế bằng mảng đối tượng");
		for (Tuple tuple: tA2D) {
			String row = "";
			row += getElement(tuple,t -> t.getX());
			row += getElement(tuple,t -> t.getY());
			System.out.println(row);
//		 System.out.println(tuple.getX() + " " + tuple.getY());
			
		}
	}
	private static String getElement(Tuple tuple,TupleMapper tupleMapper) {
		return (tupleMapper.apply(tuple) != null ? tupleMapper.apply(tuple)+ " " : "");
	}

}
