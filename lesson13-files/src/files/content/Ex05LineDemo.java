package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import utils.FileUtils;

public class Ex05LineDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		
		File fileI = new File("storage/input.txt");
		File fileO = new File("storage/output.txt");
		
		if (fileI.exists() && fileO.exists()) {
			Path pathI = fileI.toPath();
			Path pathO = fileO.toPath();
			try {
				List<String> numbersAsText = Files.readAllLines(pathI).stream()
						.skip(1)
						.flatMap(line -> List.of(line.strip().split("[^\\d]+")).stream())
						.map(Integer::parseInt)
						.distinct()
						.sorted()
						.map(String::valueOf)
						.toList();
				
			Files.write(pathO, numbersAsText);
			
			FileUtils.open(fileO);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.print("File '" + fileI.getPath() + "' is not existed .  or ");
			System.out.println("File '" + fileO.getPath() + "' is not existed .");
		}
		
		System.out.println("Finish");
		
	}
	
}
