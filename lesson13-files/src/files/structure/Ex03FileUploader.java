package files.structure;

import java.io.File;

import utils.FileUtils;

public class Ex03FileUploader {

	public static void main(String[] args) {

		String sourcePath = String.join(File.separator, "storage", "image", "human.png"); // file choses
		String targetDir = String.join(File.separator, "storage", "upload"); // idx folder upload img

		FileUtils.upload(sourcePath, targetDir);

		System.out.println("Done !!!");
	}

}
