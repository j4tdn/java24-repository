package files.content;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Item;
import utils.FileUtils;

public class Ex07FileInputStream {
	public static void main(String[] args) {
		System.out.println("Start");

		File file = new File("storage/d5.txt");

		if (file.exists() && file.exists()) {

			FileInputStream fis = null;
			ObjectInputStream ois = null;

			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);

				@SuppressWarnings("unchecked")
				List<Item> items = (List<Item>) ois.readObject();

				items.forEach(System.out::println);

			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(ois, fis);
			}

		} else {
			System.out.print("File '" + file.getPath() + "' is not existed .  or ");
		}

		System.out.println("Finish");
	}

}
