package view;

import bean.Car;

public class Ex01BasicOoDemo {
	public static void main(String[] args) {
		
		Car c1 = new Car(1,"vinfast", "vf5", 2000d);
		Car c2 = new Car(1,"vinfast", "vf8", 42000d);
		Car c3 = c1;
		
		//cập nhật giá trị của vf5 thành 2600d(gán giá trị thuộc tính)
		
		
		//System.out.println(" vf8 price --> " + c2.salesPrice);
		
		System.out.println("c1-> " + c1);
		System.out.println("c2-> " + c2);
		System.out.println("c3-> " + c3);
	}

}
