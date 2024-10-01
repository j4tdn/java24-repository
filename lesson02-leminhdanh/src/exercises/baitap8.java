package exercises;

public class baitap8 {

	public static boolean PrimeNumber(Integer n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
		 * Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
		 * không hợp lệ (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
		 */
		Integer n = baitap1.nhapSoNguyen('N');
		boolean check = PrimeNumber(n);
		if(check) {
			System.out.println(check);
		}else {
			System.out.println(check);
		}
				
	}
}
