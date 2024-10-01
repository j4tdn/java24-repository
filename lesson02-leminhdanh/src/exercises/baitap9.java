package exercises;

public class baitap9 {
	public static void main(String[] args) {
		// Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
		int dem = 0;
		for (int i = 2; true; i++) {

			boolean check = baitap8.PrimeNumber(i);

			if (check) {
				dem++;
				System.out.println(dem);
			}    
			if (dem == 200) {
				System.out.println(i);
				break;
			}
		}
	}
}
