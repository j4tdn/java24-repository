package files.structure;

import java.io.File;

import utils.FileUtils;

public class Ex03FileUploader {

    public static void main(String[] args) {

        String sourcePath = String.join(File.separator, "storage", "image", "human.png"); // file chooser
        String targetDir = String.join(File.separator, "storage", "upload"); // vị trí folder upload ảnh lên

        FileUtils.upload(sourcePath, targetDir);

        System.out.println("Done !!!");

    }
}