package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import utils.IoUtils;

public class Ex07Finally {

	private static Random rd = new Random();

	public static void main(String[] args) {
		// Giải lập bài toán

		// 1. Thực hiện logic tính toán, trả về kết quả là 100 đối tượng
		// Lưu trong mảng chuỗi String[]
		// Mỗi đối tượng là 1 String, giá trị các thuộc tính cách nhau bởi dấu ,
		String[] calculatedData = mockData(100);
		calculatedData[97] = "98, Name 97, cb";

		generate("B1. Dữ liệu sau khi tính toán", calculatedData);

		// 2. Thực hiện ghi dữ liệu này vào file(yêu cầu đã tồn tại)
		File file = new File("etest.txt");
		if (!file.exists()) {
			System.out.println(">>> File etest is not existed !!! ");
			return;
		}

		System.out.println("..... Thực hiện ghi file ..... ");

		// Class cơ bản dùng để ghi dữ liệu vào file
		FileWriter fw = null;
		try {
			// liên kết, mở file
			fw = new FileWriter(file);

			// thực hiện ghi(mới) file
			// object = id, name, age
			// line = id, name, age, factor(age-18)*2
			for (String object : calculatedData) {
				String line = convert(object);
				fw.write(line + "\n");
			}

			// save/close file
			// không save/close file được khi ghi file bị exception
			// fw.close();

		} catch (IOException e) {
			e.printStackTrace();

			// không save/close file được khi ghi file ko bị exception
			// fw.close();
		} finally {
			IoUtils.saveAndCloseConnection(fw);
			IoUtils.openFile(file);
		}

		// không save/close nếu gặp exception hoặc lỗi khác mà catch bắt không được
		// thì code flow sẽ không xuống đây
		// fw.close();

		// 3. Đặt vấn đề
		// Khi muốn ghi N(100) dòng dữ liệu vào file
		// Vừa tính toán vừa ghi file, có khả năng tại 1 đối tượng, dòng dữ liệu
		// nào đó(k) tính toán bị lỗi, bị exception
		// Xử lý thế nào ?
		// 1. Xóa hết xem như chưa ghi file
		// 2. Ghi k-1 dòng vào file, còn lại bỏ qua
		// 3. Ghi tất cả vào file ngoại trừ k(ghi error message vào file cho dòng k)

		System.out.println("..... Kết thúc việc ghi file .....");
	}

	// 1, Name 1, 22 --> factor = 8
	// 2, Name 2, xy --> parseInt --> exception
	private static String convert(String object) {
		String[] parts = object.split(", ");
		try {
			int age = Integer.parseInt(parts[2]);
			int factor = (age - 18) * 2;
			return object + ", " + factor;
		} catch (NumberFormatException e) {
			return parts[0] + " >>> Error while converting data";
		}
	}

	// Employee: id, name, age
	private static String[] mockData(int n) {
		String[] employees = new String[n]; // n = 100
		for (int i = 0; i < n; i++) {
			employees[i] = (i + 1) + ", " + "Name " + (i + 1) + ", " + rd.nextInt(18, 25);
		}
		return employees;
	}

	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " --> {");
		for (String element : elements) {
			System.out.println("    + " + element);
		}
		System.out.println("}\n");
	}

}