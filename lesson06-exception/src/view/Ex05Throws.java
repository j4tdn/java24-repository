package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	
	/*
	 Runtime exception: Là class RuntimeException hoặc các class con của nó
	 + Khi trong hàm có ném ra runtime exception thì chỗ gọi nó không bắt bược phải xử lí
	 
	 Conpile exception: Là class Exception, IOException và các class con của nó
	 + Khi trong hàm có ném ra compile exception thì chô
	 
	 */
	
	public static void main(String[] args) {
		
		// Viết chuognư trình tạo mới một file trong java
		try {
			createFile("etest.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Kết thúc chương trình");
		
	}
	
	private static void createFile(String path) throws IOException {
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile();
		}
	}
}
