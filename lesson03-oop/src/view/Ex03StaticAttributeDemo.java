package view;

import bean.CarAdv;

public class Ex03StaticAttributeDemo {
	
	public static void main(String[] args) {
		
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White" );
		CarAdv c5 = new CarAdv("Black");
		 
		//c3.setModel("MG");
		CarAdv.setModel("MG");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c5 --> " + c5);
	}

}
