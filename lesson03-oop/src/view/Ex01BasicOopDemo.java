package view;

import bean.Car;

public class Ex01BasicOopDemo {

	public static void main(String[] args) {

		Car c1 = new Car(1, "Vinfast", "VF5", 2000d);
		Car c2 = new Car(2, "Vinfast", "VF8", 4000d);
		Car c3 = c1;

		// cap nhap gia ban vf5 thanh 2600
		c3.setSalesPrice(2600d);

		// in gia cua vf8
		System.out.println("VF8 price--> " + c2.getSalesPrice());
		System.out.println("Car1--> " + c1);
		System.out.println("Car2--> " + c2);
		System.out.println("Car3--> " + c3);

		// Car c4 = null; chưa trỏ đến ô nhớ HEAP => khởi tạo ô nhớ
		Car c4 = new Car();
		c4.setId(44);
		System.out.println("Car4--> " + c4);
	}
}
