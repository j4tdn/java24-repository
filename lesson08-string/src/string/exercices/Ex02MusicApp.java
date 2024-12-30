package string.exercices;

import java.io.File;
import java.io.FileFilter;

public class Ex02MusicApp {
	
	private static final String PATH = "music";
	
	public static void main(String[] args) {
		
		File musicDir = new File(PATH);
		
		//Liệt kê các file trong thư mục
		File[] files = musicDir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.isFile() && file.getName().endsWith(".mp3");
			}
		});
		
		//in danh sách file
		for(File file : files) {
			String fullFileName = file.getName();
			String filename = fullFileName.substring(0, fullFileName.lastIndexOf("."));
			System.out.println("file : "+filename);
		}
	}
}
