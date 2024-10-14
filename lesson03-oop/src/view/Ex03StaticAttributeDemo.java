package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {
	public static void main(String[] args) {
		// Static ko nên được gán lúc khởi tạo đối tượng
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Black");
		CarAdv c4 = new CarAdv("White");
		CarAdv c5 = new CarAdv("Blue");

		CarAdv.model = "MG";

		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
	}
}
