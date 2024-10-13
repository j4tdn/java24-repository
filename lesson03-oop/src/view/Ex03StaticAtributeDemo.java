package view;

import bean.CarAdv;

public class Ex03StaticAtributeDemo {
	public static void main(String[] args) {
		CarAdv.model = "Audi";
		//static ko nên được truyền lúc khởi tạo đối tượng
		CarAdv c1 = new CarAdv("red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White");
		CarAdv c5 = new CarAdv("Black");
		
		//sang tên hãng Audi Sang MG
		//c3.setModel("Honda");
		//CarAdv.setModel("Honda");
		CarAdv.model= "MG";
		
		
		//thuộc tinh model nên được quan ly sử dụng
		//chung cho tất cả đối tượng của class Car
		System.out.println("c1 --> " + c1);
		System.out.println("\nc2 --> " + c2);
		System.out.println("\nc3 --> " + c3);
		System.out.println("\nc4 --> " + c4);
		System.out.println("\nc5 --> " + c5);
	}
}
