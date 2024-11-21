package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	// Runtime Exception: Là class Runtime Exception và class con của nó
	// + Khi trong hàm có ném ra runtime exception thì chỗ gọi hàm k bắt buộc phải
	// xử lí (nhưng phải xử lí)

	// Compile Exception: là class Exception, IOException và class con của nó
	// + Khi trong hàm có ném ra compile exception thì chỗ gọi nó bắt buộc phải xử
	// lý(ném/ bắt)

	public static void main(String[] args) {
		try {
			createFile("etest.txt");
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Kết thúc chương trình");

		// Viết chương trình tạo mới 1 file trong java
	}

	// Trong 1 hàm, khi ném ra compile exception thì chỗ gọi hàm bắt buộc phải xử lý
	// -> Dùng throws để ký hiệu rằng hàm đó bị Exception và chỗ gọi hàm đó cần phải
	// xử lý (try-catch)
	private static void createFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile();
		}
	}
}
