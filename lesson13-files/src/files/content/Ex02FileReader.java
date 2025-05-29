package files.content;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReader {

	public static void main(String[] args) {
		String path = "storage/d2.txt";
		
		File file = new File(path);
		
		if(file.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			
			List<String> lines = new ArrayList<String>();
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String line;
				while((line = br.readLine()) != null) {
					lines.add(line);
				}
				
			} catch (IOException e) {
				FileUtils.close(fr ,br);
				e.printStackTrace();
			}
			
			lines = lines.subList(1, lines.size());
			
			lines.forEach(System.out::println);
			
		}
		
	}
	
}
