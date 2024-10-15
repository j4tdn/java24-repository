package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		Car c1 = new Car(1, "vinfast", "vf5", 2000d);
		Car c2 = new Car(2, "merc", "c200", 9000d);
		Car c3 = c1;
		c1.setSalesPrice(3000d);
		System.out.println("c1 ->>> " + c1);
		System.out.println("c2 ->>> " + c2);
		System.out.println("c3 ->>> " + c3);
	}
}
