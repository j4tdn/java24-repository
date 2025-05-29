package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import bean.Item;
import utils.FileUtils;

public class Ex05LiveDemo {
	
	public static void main(String[] args) {
		
		File fileIn = new File("storage/d4in.txt");
		File fileOut = new File("storage/d4out.txt");

		if (fileIn.exists()) {
			Path pathIn = fileIn.toPath();
			Path pathOut = fileOut.toPath();

			try {

				List<String> lines = Files.readAllLines(pathIn)
						.stream()
						.flatMap(line -> List.of(line.strip().split("[^\\d]+")).stream())
						.filter(line -> !line.isEmpty())
						.map(Integer::parseInt)
						.distinct()
						.sorted()
						.map(String::valueOf)
						.toList();
				
				Files.write(pathOut, lines);
				FileUtils.open(fileOut);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("File '" + fileIn.getPath() + "' is not existed .");
		}
		
	}
	
}
