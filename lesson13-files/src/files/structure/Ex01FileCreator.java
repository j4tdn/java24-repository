package files.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	
	public static void main(String[] args) {
		
		String path = "storage/d1.txt";
		
		File file = new File(path);
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Done ...");
	}
	
}
