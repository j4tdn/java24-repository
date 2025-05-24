package files.structure;

import utils.FileUtils;

public class Ex02FileDeletion {

    public static void main(String[] args) {

        String path = "storage/d3.txt";

        FileUtils.delete(path);

        System.out.println("Done !!!");
    }

}