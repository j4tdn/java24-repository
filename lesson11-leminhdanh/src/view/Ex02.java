package view;

public class Ex02 {
	/*
	 Với n nhập từ bàn phím. Viết chương trình in ra 2 tam giác đối đỉnh bằng số tăng theo cột từ
	1 đến 2n-1.
	VD: Với n = 5. Hai tam giác sẽ đối đỉnh qua giá trị 3
	*/
	public static void main(String[] args) {
		oppositePeakTriangles(5);
	}
	
	private static void oppositePeakTriangles(int n) {
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print((j + 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}
}
