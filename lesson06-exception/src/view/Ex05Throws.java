package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	
	/*	Runtime Exception: class RuntimeException ! subclasses
	 	+ Khi trnng hàm có ném ra runtime exception thì chỗ gọi nó ko bắt buộc 
	 	phải xử lý (phải xử lý)
	 	
	 	Compile exception: class Exception, IOException & subclasses
	 	+ Khi trong hàm có ném ra compile exception thì chỗ gọi nó bắt buộc
	 	phải xử lý (ném tiếp/bắt)
	 */
	
	public static void main(String[] args) {
		// write program to create a file in java
		
		try {
			createNewFile("etes()))#@%@fsfsf.+=%%%@t.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End program!!");
	}

	private static void createNewFile(String path) throws IOException{
		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile();
		}
	}
}
