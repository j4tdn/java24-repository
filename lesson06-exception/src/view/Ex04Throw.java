package view;

public class Ex04Throw {

	/*
	 * Thường sd throw trong các hàm
	 * 
	 * Khi trong hàm có đoạn code bị lỗi --- --> có thể dùng throw để ném lỗi đó đi
	 * --> chỗ gọi hàm phải xử lý (ném tiếp hoặc bắt lỗi)
	 * 
	 */
	public static void main(String[] args) {
		// Bài toán 2: Hàm xử lý phpes chia số nguyên cơ bản

		// th1: vaidated
		System.out.println("th1 --> " + div(6, 2));

		// th2: non - vaidated
		try {
			System.out.println("th2 --> " + div(6, 0));
		} catch (ArithmeticException e) {
			System.out.println(">> exp --> " + e.getMessage());
		}
	}

	// Nguyên nhân dẫn đến hàm div bị exception
	// vì den = 0
	// do bên ngoài khi gọi hàm truyền vào bị sai

	// th1: nếu bên ngoài(chỗ gọi hàm) đảm bảo(validate) đảm bảo den!=0 kbh bị
	// exception
	// trong hàm ko bị exception --> try/catch bị thừa

	// th2: bên ngoài(chỗ gọi hàm) chưa có validate gì cả --> gọi hàm vẫn có thể bị
	// exception
	// try/catch hợp lý

	private static int div(int num, int den) {
		if (den == 0) {
			throw new ArithmeticException("Please enter denominator != 0");
		}

		return num / den;
	}

}
