package view;

import bean.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
		Car c1 = new Car(1, "vinfast", "vf5", 2000d);
		Car c2 = new Car(2, "vinfast", "vf8", 4200d);
		Car c3 = c1;
		
		//Cap nhat gia ban cua vf5 thanh 2600(gan gia tri cho thuoc tinh)
		//c2.salesPrice = 2600d;
		c1.setSalesPrice(2600d);
		
		//c1.colors = Array.asList("yellow", "red"); //fixed size list
		
//		c1.addColor("yellow")
		
		
		//in ra gia cua vf8
		System.out.println("vf8 --> "+ c2.getSalesPrice());
		
		Car c4 = null;
		c4.setId(44); //NullPointerException
	}
	
}
