package files.content;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex06FileOutputStream {
	
	public static void main(String[] args) {
		
		System.out.println("... Started ...\n");

		File file = new File("storage/d5.txt");
		
		if (file.exists()) {
			
			List<Item> objects = DataModel.mockItems();
			
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(objects);
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(oos, fos);
			}
			
		} else {
			System.out.println("File '" + file.getPath() + "' is not existed .");
		}

		System.out.println("\n... Finished ...");
		
	}
	
}
