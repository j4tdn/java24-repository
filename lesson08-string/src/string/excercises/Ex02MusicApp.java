package string.excercises;

import java.io.File;
import java.io.FileFilter;

public class Ex02MusicApp {

	private static final String PATH = "music";

	public static void main(String[] args) {

		File musicDir = new File(PATH);
		
		// Liệt kê các file trong thư mục mucsic theo yêu cầu
		File[] files = musicDir.listFiles(new FileFilter() {
		
			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(".mp3");
			}
		});

		// In danh sách file
		for (File file : files) {
			String fullfilename = file.getName();
			String filename = fullfilename.substring(0, fullfilename.lastIndexOf("."));

			System.out.println("file: " + filename);
		}
	}

}
