package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03FilesWriterAvailable {
	
	public static void main(String[] args) {
		
		File file = new File("storage/d3.txt");
		
		if (file.exists()) {
			Path path = file.toPath();
			
			List<String> lines = DataModel.mockItems()
					.stream()
					.map(Item::toLine)
					.toList();

			lines.add(0, "-------- D3 title ---------");
			
			try {
				Files.write(path, lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
