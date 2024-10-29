package view;

public class Ex03RectanglePascal {

	public static void main(String[] args) {

		int[] i = {5};
		int[] j = {5};

		for (int n = 0; n <= 5; n++) {
			for (int m = 0; m <= n - 1; m++) {
				if (m == 0 || m == n - 1) {
					j[0] = 1;
					j[n] = 1;
					System.out.println(j[m]);
					System.out.println(j[n+1]);
				}
			}
		}
	}

}
