package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {
	public static void main(String[] args) {
		
		CarAdv.model="Audi";
		// Static không nên được truyền lúc khởi tạo đối tượng
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Red");
		CarAdv c4 = new CarAdv("Red");
		CarAdv c5 = new CarAdv("Red");
		// sang tên 
		//c3.setModel("MG");
		CarAdv.model="MG";
		
		// Thuộc tính model
		
		System.out.println("C1 --> "+c1);
		System.out.println("\nC2 --> "+c2);
		System.out.println("\nC3 --> "+c3);
		System.out.println("\nC4 --> "+c4);
		System.out.println("\nC5 --> "+c5);
		
	}
}
