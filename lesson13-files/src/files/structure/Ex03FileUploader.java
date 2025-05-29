package files.structure;

import java.io.File;

import utils.FileUtils;

public class Ex03FileUploader {

	public static void main(String[] args) {
		
		String sourcePath = String.join(File.separator ,"storage", "image", "human.png");
		String targetDir = String.join(File.separator ,"storage", "upload");
		
		FileUtils.upload(sourcePath, targetDir);
		System.out.println("Done!!!");
	}
}
