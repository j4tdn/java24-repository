package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex03FileWriterAvailable {

	public static void main(String[] args) {
		File file = new File("storage/d3.txt");
		
		if (file.exists()) {
			Path path = file.toPath();
			List<String> lines = DataModel.mockItems()
									.stream()
									.map(Item::toLine)
									.collect(Collectors.toList());
			
			
			lines.add(0, "---------- D3 title ----------");
			
			try {
				Files.write(path, lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileUtils.open(file);
		} else {
			System.out.println("File '" + file.getPath() + "' is not existed .");
		}
		
		System.out.println("... Finished ...");
		
		
	}
	
}
