package exercises;



public class baitap2 {
	public static boolean kiemTraSoNguyen(Integer n) {
		if (n <= 0) {
			return false;
		}
		while (n % 2 == 0) {
			n = n / 2;
		}
		return n == 1;
	}


	public static void main(String[] args) {
		/*
		 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay
		 * không Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại
		 * nếu N không hợp lệ (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
		 */
		int n = baitap1.nhapSoNguyen('N');
		boolean kt = kiemTraSoNguyen(n);
		if (kt)
			System.out.println(kt);
		else
			System.out.println(kt);

	}

}
