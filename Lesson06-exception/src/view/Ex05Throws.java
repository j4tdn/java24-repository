package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
		// viết chương trình tạo file trong java
		public static void main(String[] args) {
			try {
				createFile("etest.txt");
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
