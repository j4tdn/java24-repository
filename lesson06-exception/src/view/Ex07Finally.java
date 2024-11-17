package view;

import java.io.File;
import java.util.Random;

public class Ex07Finally {

	private static Random rd = new Random();

	public static void main(String[] args) {
		// Giải lập bài toán

		// 1. Thực hiện logic tính toán, trả về kết quả là 100 đối tượng
		// Lưu trong mảng chuỗi String[]
		// Mỗi đối tượng là 1 String, giá trị các thuộc tính cách nhau bởi dấu ,
		String[] calculateData = mockData(100);
		generate("B1. Dữ liệu sau khi tính toán", calculateData);
		
		//2. Thực hiện ghi dữ liệu này vào file(yêu cầu đã tồn tại)
		File file = new File("etest.txt");
		
	}

	// Employee: id, name, age
	private static String[] mockData(int n) {
		String[] employees = new String[n]; // n =100
		for (int i = 0; i < n; i++) {
			employees[i] = (i+1) + "," + "Name" + (i+1) + "," + rd.nextInt(18, 25);
		}
		return employees;
	}

	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " --> {");
		for (String element : elements) {
			System.out.println("  +" + element);
		}
		System.out.println("}\n");
	}
}
