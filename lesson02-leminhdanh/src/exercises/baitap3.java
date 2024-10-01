package exercises;

public class baitap3 {
	
	public static long tinhGiaiThua(int n) {
		long ketQua = n;

		while (true) {
			if (n == 1)
				break;
			ketQua = ketQua * --n;
		}
		return ketQua;
	}
	
	
	public static void main(String[] args) {
		/*
		 * Viết chương trình tìm giai thừa của một số nguyên dương N Biết rằng: N có thể
		 * được nhập từ bàn phím hoặc khai báo sẵn
		 */

		int n = 12;
		long ketQua = tinhGiaiThua(n);

		System.out.println(ketQua);

	}
}
