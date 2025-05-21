package files.content;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex02FilesReader {
	
	public static void main(String[] args) {
		
		String path = "storage/d2.txt";
		
		File file = new File(path);
		
		List<String> lines = new ArrayList<>();
		
		if (file.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String line;
				
				while((line = br.readLine()) != null) {
					lines.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			lines = lines.subList(1, lines.size());
			lines.forEach(System.out::println);
			
		}
		else {
			System.out.println("File  '" + file.getPath() + "' is not existed");
		}
		
	}
	
}
