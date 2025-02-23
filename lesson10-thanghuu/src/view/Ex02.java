package view;

public class Ex02 {

	public static void main(String[] args) {
		int[][] matrix = mockData();
		
		System.out.println("Ma tran ban dau: ");
		print(matrix);
		System.out.println();
		
		
		
	}
	
	 private static void print(int[][] matrix) {
		 for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
	    }
	
	
	

	private static int[][] mockData() {
		return new int[][] {
			new int[] { 1, 2, 3, 4 }, 
			new int[] { 5, 0, 7, 8 }, 
			new int[] { 1, 9, 0, 9 },
			new int[] { 1, 0, 6, 5 }, 
			new int[] { 1, 2, 6, 5 } 
		};
	}

}
