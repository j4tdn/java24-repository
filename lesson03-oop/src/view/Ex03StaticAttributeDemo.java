package view;

import been.CarAdv;

public class Ex03StaticAttributeDemo {
	public static void main(String[] args) {
		CarAdv.model = "Audi";
		// static không nên được gán lúc khởi tạo đối tượng
		CarAdv c1 = new CarAdv("red");
		CarAdv c2 = new CarAdv("gren");
		CarAdv c3 = new CarAdv("blue");
		CarAdv c4 = new CarAdv("while");
		CarAdv c5 = new CarAdv("black");
		
		// Sang tên hảng xe từ Audi sang MG
//		c3.setModel("MG");
//		CarAdv.setModel("MG");
		CarAdv.model = "MG";
		
		// thuộc tính model nên là được quản lý sử dụng chung
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c5 --> " + c5);
	}

}
