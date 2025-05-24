package files.structure;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

public class Ex04FileFilter {

    public static void main(String[] args) {

        File download = new File("C:\\Users\\qphan\\Downloads");

        File[] files = download.listFiles(file -> {
            String extension = FileUtils.getExtension(file.getName());
            return file.isFile() && "csv".equals(extension);
        });

        Arrays.stream(files).forEach(file -> System.out.println(file.getPath()));

    }

}