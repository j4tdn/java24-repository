package files.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	
	public static void main(String[] args) {
		// File / Path -> gen files or folder
		
		// File.separator
		
		// path tương đối từ current idx of prj or từ disk 
		// if path mà có folder/file folder đó ycau đã tồn tại, nếu chưa -> error
		
		
		String path = "storage/d3.txt"; // 
		
		FileUtils.createFile(path);
		
		System.out.println("Done!!");
	}
	
}
