package view;

public class Ex04Throw {
	
	/*
	 
	 Thường sẽ sử dụng throw trong các hàm
	 
	 Khi trong hàm có đoạn code bị lỗi ... --> có thể dùng throw để ném lỗi đó đi
	 --> chỗ gọi hàm phải xử lý (ném tiếp hoặc bắt lỗi)
	 
	 */

	public static void main(String[] args) {
		
		// TH1: validated
		System.out.println("TH1: " + div(6,2));
		
		// TH2: non-validation
		try {
			System.out.println("TH2: " + div(6,0));
		} catch (ArithmeticException e) {
			System.out.println("exp --> " + e.getMessage());
		}
	}
	
	// Nguyên nhân dẫn đến hàm div bị exception vì den = 0
	// do bên ngoài khi gọi hàm truyền vào bị sai
	
	// TH1: nếu bên ngoài (chỗ gọi hàm) đảm bảo (validate) đảm bảo den != 0 kbh bị exception
	// trong hàm không bị exception --> try/catch bị thừa
	
	// TH2: bên ngoài (chỗ gọi hàm) chưa có validate gì cả --> gọi hàm vẫn có thể bị exception
	// try/catch hợp lý
	
	
	private static int div(int num, int den) {
		if (den == 0) {
			throw new ArithmeticException("Plz enter den != 0");
		}
		return num/den;
	}
}
