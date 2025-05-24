package files.content;

import bean.Item;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class Ex05LiveDemo {
    public static void main(String[] args) {
        File file = new File("storage/input.txt");
        File outputFile = new File("storage/output.txt");

        if (file.exists() && outputFile.exists()) {
            Path path = file.toPath();
            Path outputPath = outputFile.toPath();
            try {
                List<String> lines = Files.readAllLines(path).stream()
                        .skip(1)
                        .flatMap(line -> Stream.of(line.strip().split("[^\\d]+")))
                        .filter(line -> !line.isEmpty())
                        .map(Integer::parseInt)
                        .distinct()
                        .sorted()
                        .map(String::valueOf)
                        .toList();

                Files.write(outputPath, lines);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File '" + file.getPath() + "' is not existed .");
        }
    }
}
