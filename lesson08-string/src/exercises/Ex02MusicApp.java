package exercises;

import java.io.File;
import java.io.FileFilter;

public class Ex02MusicApp {

	private static final String PATH = "music";

	public static void main(String[] args) {

		File musicDir = new File(PATH);

	File[] files =	musicDir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(".mp3"); 
				//Trả về file và lấy tên đồng thời kiểm tra có kết thúc bằng .mp3 không
			}
		});
	//in danh sach file
	for (File file : files) {
		String fullFilename = file.getName();
		String filename = fullFilename.substring(0, fullFilename.lastIndexOf("."));
		System.out.println("file: "+ filename);
		
	}

	}
}
