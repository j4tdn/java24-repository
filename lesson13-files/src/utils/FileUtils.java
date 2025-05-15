package utils;

import java.awt.Desktop;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtils {

	private FileUtils() {
	}

	public static String getExtension(String filename) {
		return filename.substring(filename.lastIndexOf(".") + 1);
	}

	public static boolean upload(String sourcePath, String targetDir) {
		Path source = Path.of(sourcePath);
		Path target = Path.of(targetDir);

		try {
			Files.copy(source, target.resolve(renameTo(source.getFileName())), StandardCopyOption.REPLACE_EXISTING);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static Path renameTo(Path path) {
		String sPath = path.toString();
		String filename = sPath.substring(0, sPath.lastIndexOf("."));
		String extension = sPath.substring(sPath.lastIndexOf("."));
		String newName = "RN-" + filename + "-" + System.currentTimeMillis() + extension;
		return Paths.get(newName);
	}

	public static boolean delete(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File '" + file.getPath() + "i is not existing for delete");
			return false;
		}
		file.delete();
		System.out.println("File '" + file.getPath() + "' is deleted");
		return true;
	}

	public static boolean createFile(String path) {
		File file = new File(path);

		createDir(file.getParent());

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Folder parent ' " + file.getPath() + "' is created succesful");
				return true;
			} catch (IOException e) {
				System.out.println("Exception while creating file ...");
				e.printStackTrace();
				return false;
			}
		} else {
			System.out.println("Folder parent ' " + file.getPath() + "' is existed");
			return true;
		}
	}

	public static boolean createDir(String path) {
		File dir = new File(path);

		if (!dir.isDirectory()) {
			dir.mkdirs();
			System.out.println("Folder parent ' " + dir.getPath() + "' is created succesful");
			return true;
		}
		return false;
	}

	// try/catch cho object.close bên trong for, cho từng vòng lặp --> nếu như mỗi
	// ptu tại một vòng lặp bị lỗi thì nó vẫn xử lý tiếp cho ptu tt
	// try/catch bao bên ngoài for --> nếu 1 ptu tại 1 vòng lặp bị exception thì nó
	// sẽ dừng lại
	public static void close(Closeable... objects) {
		for (Closeable object : objects) {
			try {
				object.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
