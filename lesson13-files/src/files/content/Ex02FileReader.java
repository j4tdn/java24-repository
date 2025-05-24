package files.content;

import utils.FileUtils;

import java.io.*;

public class Ex02FileReader {
    public static void main(String[] args) {
        String path = "storage/d2.txt";
        File file = new File(path);

        if (file.exists()) {
            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);

                br.lines().skip(1).forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                FileUtils.close(br, fr);
            }
        } else {
            System.out.println("File '" + file.getPath() + "' is not existed .");
        }
    }
}
