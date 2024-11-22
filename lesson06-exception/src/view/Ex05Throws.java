package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	
	/*
	 Runtime exception: la class Runtimeexception hoac cac class con cua no
	 + Khi trong ham co nem ra runtime exception thi cho goi no khong bat buoc phai xu ly(phai xu ly)
	 
	 Compile exception: la Exception, IOException va cac class con cua no
	 + Khi  trong ham co nem ra compile exception thi cho goi no bat buoc phai xu ly (nem tiep/bat)
	 */
	
	public static void main(String[] args) {
		//viet chuong trinh tao moi 1 file trong java
		try {
			createFile("etest.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void createFile(String path) throws IOException {
		File file = new File(path);
		if(!file.exists()) {
				file.createNewFile();
		}
	}
}
