package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoUtils {
	
	private IoUtils() {
	}
	
	public static void saveAndCloseConnection(FileWriter fw) {
		if (fw != null) {
			try {
				System.out.println("save/close in finally block ...");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void openFile(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}