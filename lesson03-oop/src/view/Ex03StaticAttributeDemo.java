package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {
	
	public static void main(String[] args) {
		
		CarAdv.model = "Audi";
		
		// Static không nên được gán lúc khởi tạo đối tượng
		CarAdv c1 = new CarAdv("red");
		CarAdv c2 = new CarAdv("green");
		CarAdv c3 = new CarAdv("blue");
		CarAdv c4 = new CarAdv("white");
		CarAdv c5 = new CarAdv("black");
		
		// Sang tên hãng xe từ Audi sang MG
		//c3.setModel("MG");
		//CarAdv.setModel("Honda")
		CarAdv.model = "MG";
		
		// Thuộc tính model nên là được quản lí sử dụng 
		// chung cho tất cả các đối tượng của class Car
		
		System.out.println("c1 --> " + c1);
		System.out.println("\nc2 --> " + c2);
		System.out.println("\nc3 --> " + c3);
		System.out.println("\nc4 --> " + c4);
		System.out.println("\nc5 --> " + c5);
	}

}
