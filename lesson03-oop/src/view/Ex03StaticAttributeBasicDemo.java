package view;

import bean.CarAdv;

public class Ex03StaticAttributeBasicDemo {
	public static void main(String[] args) {
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White");

		CarAdv.model = "Audi";
		CarAdv.model = "MG";

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
