package view;

import bin.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
	
		Car c1 = new Car(1, "vinfast", "vf5", 2000d);
		Car c2 = new Car(2, "vinfast", "vf8", 4200d);
		Car c3 = c1;
		
		//cap nhat gia ban thanh 2600 (gan gia tri cho thuoc tinh)
		//c1.salesPrice = 2600d;
		c1.getSalesPrice(2600d);
		
		//in ra gia tri cua vf8
		System.out.println("vf8 price --> " + c2.salesPrice);
		
		System.out.println("c1 --? " + c1);
		System.out.println("c2 --? " + c2);
		System.out.println("c3 --? " + c3);
		
		 Car c4 = null;
		 c4.setId(44); // NullPointerException
	}
}
