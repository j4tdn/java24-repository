package string.exercices;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Ex02MusicApp {
    private static final String PATH = "music";
    public static void main(String[] args) {

        File musicDir = new File(PATH);
        File[] files = musicDir.listFiles(new FileFilter() {
           @Override
           public boolean accept(File file) {
               return file.isFile() && file.getName().endsWith(".mp3");
           }
       });
        for (File file : files) {
            String filename = file.getName().substring(0, file.getName().lastIndexOf("."));
            System.out.println(filename);
        }
    }
}
