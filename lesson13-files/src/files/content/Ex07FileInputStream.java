package files.content;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

import java.io.*;
import java.util.List;

public class Ex07FileInputStream {
    public static void main(String[] args) {
        File file = new File("storage/d5.txt");

        if (file.exists()) {
            FileInputStream fis = null;
            ObjectInputStream ois = null;

            List<Item> files = DataModel.mockItems();

            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);

                @SuppressWarnings("unchecked")
                List<Item> items = (List<Item>) ois.readObject();
                for (Item item : items) {
                    System.out.println(item);
                }
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                FileUtils.close(ois, fis);
            }

        } else {
            System.out.println("File '" + file.getPath() + "' is not existed .");
        }
    }
}
