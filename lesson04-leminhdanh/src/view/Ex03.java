package view;

public class Ex03 {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		int n = 5;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i+1; j++) {
				if(j == 0 || j == i+1) {
					arr[i][j] = 1;
					continue;
				}
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j <= i+1; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
	}
}
