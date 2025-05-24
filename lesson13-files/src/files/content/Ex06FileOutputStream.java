package files.content;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

import java.io.*;
import java.util.List;

public class Ex06FileOutputStream {
    public static void main(String[] args) {
        File file = new File("storage/d5.txt");

        if (file.exists()) {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            List<Item> files = DataModel.mockItems();

            try {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);

                oos.writeObject(files);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                FileUtils.close(oos, fos);
            }
        } else {
            System.out.println("File '" + file.getPath() + "' is not existed .");
        }
    }
}
