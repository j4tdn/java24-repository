package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {

	public static void main(String[] args) {
		CarAdv.model = "Audi";
		
		//Static ko nên đc gán lúc khởi tạo obj
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White");
		CarAdv c5 = new CarAdv("Black");
		
		//Đổi sang tên hãng từ Audi -> MG
		//c3.setModel("MG");
		CarAdv.model= "MG";
		
		//tt model nên là dc mng use chung cho all Objs of class Car
		
		System.out.println("c1 --> " + c1);
		System.out.println("\nc2 --> " + c2);
		System.out.println("\nc3 --> " + c3);
		System.out.println("\nc4 --> " + c4);
		System.out.println("\nc5 --> " + c5);
	}
	
}
