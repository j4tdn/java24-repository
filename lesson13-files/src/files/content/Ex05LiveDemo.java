package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import utils.FileUtils;

public class Ex05LiveDemo {
	
	public static void main(String[] args) {
		
		System.out.println("... Started ...\n");

		File fileIn = new File("storage/d4in.txt");
		File fileOut = new File("storage/d4out.txt");

		/*
		 5
		 43silos0
		 zita002
		 le2sim
		 231233
		 kytsi56usu7
		 */
		
		if (fileIn.exists() && fileOut.exists()) {
			Path pathIn = fileIn.toPath();
			Path pathOut = fileOut.toPath();

			try {
				List<String> numbersAsText = Files.readAllLines(pathIn).stream()
					.skip(1)
					.flatMap(line -> List.of(line.strip().split("[^\\d]+")).stream())
					.filter(line -> !line.isEmpty())
					.map(Integer::parseInt)
					.distinct()
					.sorted()
					.map(String::valueOf)
					.toList();
				
				Files.write(pathOut, numbersAsText);
				
				FileUtils.open(fileOut);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("File '" + fileIn.getPath() + "' or '" + fileOut.getPath() + "' is not existed .");
		}

		System.out.println("\n... Finished ...");
		
	}
	
}
