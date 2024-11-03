package view;

public class Ex03 {
	public static void main(String[] args) {
		int[] numbers = {2, 3, 5};
		System.out.println(getLeastCommonMultiple(numbers));
	}
	public static int getLeastCommonMultiple(int[] numbers) {
		int n = 1;
		
		do {
			int dem = 0;
			for(int i = 0;i < numbers.length;i++) {
				if(n % numbers[i] == 0)
					dem++;
			}
			if(dem == numbers.length)
				return n;
			n++;
		} while (true);
	}
}
