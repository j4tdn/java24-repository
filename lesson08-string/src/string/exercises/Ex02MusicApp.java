package string.exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
public class Ex02MusicApp {
	
	private static final String PATH = "music";
	
	public static void main(String[] args) {
		
		String pattern = "[a-zA-Z0-9\\.-]+@[a-zA-Z]+\\.(edu|com|vn)";
		
		String mail = "helloteo@gmail.vn";
		
		System.out.println(mail + " --> " + mail.matches(pattern));
		
		System.out.println("\n============================\n");
		
		
		File musicDir = new File(PATH); 
		
		// Liệt kê các file trong thư mục music theo yêu cầu
		File[] files = musicDir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(".mp3");
			}
		});
		
		// In danh sách file
		for (File file: files) {
			String fullFilename = file.getName();
			String filename = fullFilename.substring(0, fullFilename.lastIndexOf("."));
			System.out.println("file: " + filename);
		}
	}
	
}