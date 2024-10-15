package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {
	public static void main(String[] args) {
		
		CarAdv.model = "Audi";
		 
		//Static không nên được gán lúc khởi tạo đối tượng
		
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("Yellow");
		CarAdv c5 = new CarAdv("White");
		
		//Sang ten hang xe tu Audi sang MG
//		CarAdv.setModel("MG");
		
		CarAdv.model = "MG";
		
		//Thuộc tính model nên được quản lý sử dụng 
		//chung cho tất cả các đổi tượng class Car
		
		System.out.println("C1 --> " + c1);
		System.out.println("C2 --> " + c2);
		System.out.println("C3 --> " + c3);
		System.out.println("C4 --> " + c4);
		System.out.println("C5 --> " + c5);
	}
}
