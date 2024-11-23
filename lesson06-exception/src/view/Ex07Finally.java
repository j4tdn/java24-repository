package view;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		//Gia lap bai toan
		//1. thuc hien logic tinh toan, tra ve kq 100 doi tuong
		//	Luu trong mang chuoi String[] 
		// Moi đối tượng là 1 String, giá trị các thuộc tính cách nhau bởi dấu phẩy ,
		
		String[] calculatedData = mockData(100);
		generate("Du lieu sau khi su ly", calculatedData);
		
		/*
		 2. Thuc hien ghi dữ liệu này vào file(yêu cầu đã tồn tại)
		 */
		File file = new File("etest.txt");
		if(!file.exists()) {
			System.out.println(">>> file etest is not existed");
			return  ;
		}
		
		System.out.println("Thuc hien ghi file");
		
		//class cơ bản dùng để ghi vào file
		FileWriter fw = null;
		try {
			//liên kết, mở file
			fw = new FileWriter(file);
			
			//thực hiện ghi(mới) file 
			// object = 1, name, 24
			// line = id, name, age, factor(age-18)*2
			for(String object: calculatedData) {
				String line = convert(object);
				fw.write(line + "\n");
			}
			//save/ close file
			//khong save/close file khi ghi file bị exception
			//fw.close();
			
			//open file
			Desktop.getDesktop().open(file);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			
			//không save/close file được khi ghi file không bị exception
			//fw.close();
		} finally {
			if (fw != null)
				try {
					System.out.println("save/close in finally block ...");
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		//không save/close nếu gặp exception hoăc lỗi khác mà catch bắt
		//không được thì code flow sẽ xống đây
		//fw.close();
		
		System.out.println("______kết thúc việc ghi file______");
		
	}
	
	private static String convert(String object) {
		String[] parts = object.split(", ");
		try {
			int age = Integer.parseInt(parts[2]);
			int factor = (age - 18) * 2;
			return object + ", " + factor;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return parts[0] + " >>> Error while converting data";
		}
	}
	
	//Employee: id, name, age
	private static String[] mockData(int n) {
		String[] employees = new String[n]; //n = 100
		for (int i = 0; i < n; i++) {
			String object = (i + 1) + ", " + "Name " + (i+1) + ", " + rd.nextInt(18, 25);
			employees[i] = object;
		}
		return employees;
	}
	
	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " --> {");
		for(String element : elements) {
			System.out.println("    + "+ element);
		}
		System.out.println("}\n");
	}
	
}
