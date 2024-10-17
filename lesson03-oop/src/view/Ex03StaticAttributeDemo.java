package view;

import bin.CarAdv;

public class Ex03StaticAttributeDemo {

	public static void main(String[] args) {
		
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White");
		CarAdv c5 = new CarAdv("Black");
		
		// Sang tên hãng xe từ Audi sang MG
		// c3.setModel("MG");
		// CarAdv.setModel("Honda");
		
		CarAdv.model = "MG";
		
		// Thuộc tính model nên là được quản lý sử dụng
		// chung cho tất cả đối tượng của class Car
		
		System.out.println("c1 --> " + c1);
		System.out.println("c1 --> " + c2);
		System.out.println("c1 --> " + c3);
		System.out.println("c1 --> " + c4);
		System.out.println("c1 --> " + c5);
		
	}
}
