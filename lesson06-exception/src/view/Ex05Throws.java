package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	/*
	 Runtime exception: Là class RuntimeException hoặc các class con của nó
	 + Khi trong hàm  có ném ra runtime exception thì chỗ gọi nó không bắt buộc phải xử lí(phải xử lí)
	 
	 Comiple exception: là class Exception, IO Exception và các class con của nó
	 + Khi trong hàm có ném ra compile exception thì chỗ gọi nó bắt buộc phải xử lí(ném tiếp hoặc bắt)
	 */
	
	public static void main(String[] args) {
		
		// Viết chương trình tạo mới một file trong java
		try {
			createFile("e321321$#@$test.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
