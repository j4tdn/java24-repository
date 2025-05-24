package files.content;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04FileReaderAvailable {
    public static void main(String[] args) {
        File file = new File("storage/d3.txt");

        if (file.exists()) {
            Path path = file.toPath();

            try {
                List<String> lines = Files.readAllLines(path);
                lines.stream()
                        .map(Item::new)
                        .forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File '" + file.getPath() + "' is not existed .");
        }
    }
}
