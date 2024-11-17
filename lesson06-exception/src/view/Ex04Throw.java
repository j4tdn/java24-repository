package view;

public class Ex04Throw {

	public static void main(String[] args) {

		// Bài toán 2: Hàm xử lý phép chia số nguyên cơ bản

		// th1: validated 
		System.out.println("th1 --> "+div(6, 2));
		
		//th2 : non-validated
		try {
			System.out.println("th1 --> "+div(6, 0));
		} catch (ArithmeticException ae) {
			System.out.println(">>exp --> " + ae.getMessage() );
		}
	}

	// Nguyên nhân dẫn đên hàm div bị exception
	// vì den = 0
	// do bên ngoài gọi hàm truyền vào bị sai

	// th1: nếu bên ngoài (chỗ gọi hàm) đảm bảo (validate) den truyền vào kbh bị
	// exception
	// trong hàm ko bị exception --> try/catch bị thừa

	// th2 : bên ngoài (chỗ gọi hàm) chưa có validate gì cả --> gọi hàm vẫn có thể
	// try/catch hợp lý

	private static int div(int num, int den)  {
		// dòng code num/den sẽ bị exception khi den = 0;
		if (den ==0) {
			throw new ArithmeticException("Please enter denominator != 0");
		}
		return num/den;
	}

}
