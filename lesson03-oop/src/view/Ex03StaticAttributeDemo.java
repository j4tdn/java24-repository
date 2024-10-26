package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {

	public static void main(String[] args) {
		
		// static không nên được truyên khi khởi tạo đối tượng
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White");
		CarAdv c5 = new CarAdv("Black");
		
		
		
		// Sang tên hãng xe từ Audi sang MG
		//c3.setModel("MG");
		//CarAdv.setModel("MG");
		CarAdv.model = "MG";
		// Thuộc tính model nên được quản lý, sử dụng
		// chung cho tất cả các đối tượng của class CarAdv	
		
			
		
		System.out.println("c1 ---> " + c1);
		System.out.println("\nc2 ---> " + c2);
		System.out.println("\nc3 ---> " + c3);
		System.out.println("\nc4 ---> " + c4);
		System.out.println("\nc5 ---> " + c5);
		
		
		
	}
	
}
