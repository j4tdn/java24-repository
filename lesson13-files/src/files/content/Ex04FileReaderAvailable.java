package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import bean.Item;

public class Ex04FileReaderAvailable {

	public static void main(String[] args) {
		System.out.println("... Started ...\n");

		File file = new File("storage/d3.txt");

		if (file.exists()) {
			Path path = file.toPath();

			try {
				List<String> lines = Files.readAllLines(path);
				
				lines.stream()
					.skip(1)
					.map(Item::new)
					.forEach(System.out::println);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("File '" + file.getPath() + "' is not existed .");
		}

		System.out.println("\n... Finished ...");

	}

}
