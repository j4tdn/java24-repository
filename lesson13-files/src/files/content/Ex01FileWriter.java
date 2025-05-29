package files.content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWriter {
	
	public static void main(String[] args) {
		
		List<String> data = List.of(
				"1, A1, 2023-12-21, 3462",
				"2, A2, 2024-11-22, 3464",
				"3, A3, 2025-08-23, 3466",
				"4, A4, 2026-10-24, 3468"
		);
		
		String path = "storage/d2.txt";
		
		File file = new File(path);
		
		if (file.exists()) {
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				 fw = new FileWriter(file); // append default false
				 bw = new BufferedWriter(fw);
				 
				 // text file -> mỗi dòng là 1 chuỗi string với template/format
				 
				 bw.write("--- D2 TITLE ---"); bw.newLine();
				 
				 for (String line: data) {
					 bw.write(line);
					 bw.newLine();
				 }
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(bw, fw);
			}
			
			FileUtils.open(file);
			
		} else {
			System.out.println("File '" + file.getPath() + "' is not existed .");
		}
		
	}
	
}