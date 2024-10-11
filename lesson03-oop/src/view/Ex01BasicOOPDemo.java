package view;

import bean.Car;

public class Ex01BasicOOPDemo {

	public static void main(String[] args) {
		Car c1 = new Car(1, "Vinfast", "VF5", 2000d);
		Car c2 = new Car(2, "Vinfast", "VF8", 4000d);
		Car c3 = c1;

		// update price of vf5 -> 2600 (gan val cho attribute)
		//c1.salesPrice = 2600;
		c1.setSalesPrice(2600d);
		
		// ex về change CTDL khi để public 
		// c1.colors.asList("yellow", "red");// -> fixed size
		
		//in ra price of vf8
		System.out.println("Vf8 price --> " + c2.getSalesPrice());

		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		
		//NullPointerException
		//Car c4 = null;
		Car c4 = new Car();
		c4.setId(44); 
		
	}

}
