package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	
	/*
	 
	 Runtime Exception: là class RuntimeException hoặc các class con của nó 
	 + Khi trong hàm có ném ra runtime exception thì chỗ gọi nó không bắt buộc
	 phải xử lý (dev phải xử lý)
	 
	 Compile Exception: Là class Exception, IOException và các class con của nó
	 + Khi trong hàm có ném ra compile exception thì chỗ gọi nó bắt buộc phải xử lý (ném/bắt)
	 
	 */

	public static void main(String[] args) {
		// Viết chương trình tạo mới một file trong java
		
		try {
			createFile("etest.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Kết thúc chương tình");
	}

	private static void createFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile();
		}
	}

}
