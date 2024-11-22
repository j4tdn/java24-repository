package view;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		// Gia lap bai toan
		
		//1. thuc hien loggic tinh toan, tra ve ket qua la 100 doi tuong
		//   Luu trong mang chuoi String[]
		//   Moi doi tuong la 1 String, gia tri cac thuoc tinh cach nhau boi dau,
		
		String[] calculatedData = mockData(100);
		calculatedData[88] = "89, Name 89, hs";
		generate("B1. Du lieu sau khi tinh toan", calculatedData);
		
		//2. Thuc hien ghi du lieu nay vao file(yeu cau da ton tai)
		File file = new File("etest.txt");
		if(!file.exists()) {
			System.out.println(">>>> File etest is not existed !!");
			return;
		}
		System.out.println("....Bat dau viec ghi file....");
		// Class co ban dung de ghi du lieu vao file
		FileWriter fw = null;
		try {
			// liên kết, mở file
			fw = new FileWriter(file);
			// thực hiện ghi(mới) file
			// object = id, name, age
			// line   = id, name, age, factor(age-18)*2
			for (String object:calculatedData) {
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
		}finally {
			if (fw != null) {
				try {
					fw.close();
					Desktop.getDesktop().open(file);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		System.out.println("....Ket thuc viec ghi file....");
	}
	
	private static String convert(String object) {
		String[] parts = object.split(", ");
		try {
			int age = Integer.parseInt(parts[2]);
			int factor = (age - 18) * 2;
			return object + ", " + factor;
		} catch (NumberFormatException e) {
			return parts[0] + ", >>> Error while converting data";
		}
	}
	
	private static String[] mockData(int n) {
		String[] employees = new String[n];
		for (int i = 1; i <= n; i++) {
			employees[i-1] = i + ", " + "Name " + i + ", " + rd.nextInt(18, 25);
		}
		return employees;
	}
	
	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " -->{");
		for (String element:elements) {
			System.out.println("     + " + element);
		}
		System.out.println("}\n");
	}
}
