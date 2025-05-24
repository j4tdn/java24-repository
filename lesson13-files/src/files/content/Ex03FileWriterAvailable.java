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

public class Ex03FileWriterAvailable {
    public static void main(String[] args) {
        File file = new File("storage/d3.txt");

        if (file.exists()) {
            Path path = file.toPath();

            List<String> lines = DataModel.mockItems().stream()
                    .map(Item::toLine)
                    .collect(Collectors.toList());

            try {
                Files.write(path, lines);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            FileUtils.open(file);
        } else {
            System.out.println("File '" + file.getPath() + "' is not existed .");
        }
    }
}
