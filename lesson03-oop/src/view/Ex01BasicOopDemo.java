package view;

import bean.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(1,"vinfast", "vf5", 2000d);
		Car c2 = new Car(2,"vinfast", "vf8", 4000d);
		Car c3 = c1;
		
		//cập nhật giá bán của vf5 thành 2600
		c3.setSalesPrice(2600d);
		
		//giá của vf8 
		System.out.println("sales price vf8 --> " + c2.getSalesPrice());
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		
		Car c4 = null;
		c4.setId(44);//
		
		System.out.println(c4);
	}

}
