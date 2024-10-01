package exercises;

public class baitap7 {

	public static String Binary(Integer n) {
		String soNhiPhan = "";

		while (n > 0) {
			String Digit = Integer.toString(n % 2);
			soNhiPhan = Digit + soNhiPhan;
			n = n/2;
		}
		return soNhiPhan;
	}

	public static void main(String[] args) {
		/*
		 * Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân)
		 * thành số ở hệ cơ số 2(nhị phân)
		 */
		Integer n = 6;
		String snp = Binary(n);
		System.out.println(snp);

	}
}
