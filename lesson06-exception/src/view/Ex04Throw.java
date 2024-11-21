package view;

public class Ex04Throw {

	public static void main(String[] args) {

		// B2: Viết hàm tìm thương a,b
		/*
		 * Thường sử dụng Throw trong các hàm
		 * 
		 * Khi trong hàm có code bị lỗi ... -> có thể dùng throw để ném lỗi đó đi -->
		 * chỗ gọi hàm phải xử lý (ném tiếp hoặc bắt lỗi)
		 */

		// Nguyên nhân dẫn đến div bị exception
		// den = 0
		// do bên ngoài khi gọi truyền sai
		// th1: nếu bên ngoài đảm bảo den !=0 thì kbh bị exp -> try-catch thừa
		// th2: bên ngoài chưa có validate gì cả --> gọi hàm vẫn có thể bị exp --> có
		// thể sử dụng try - catch

		// th1: validated
		System.out.println(div(6, 3));

		// th2: non-validation
		try {
			System.out.println("th2 --> " + div(6, 0));
		} catch (ArithmeticException e) {
			System.out.println("exp --> " + e.getMessage());
		}
	}

	private static int div(int num, int den) {
		if (den == 0) {
			throw new ArithmeticException("Mau so bang 0");
		}
		return num / den;
	}
}
