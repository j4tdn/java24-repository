package view;

import bean.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
		Car c1 = new Car(1,"VinFast","VF5",2000d);
		Car c2 = new Car(1,"VinFast","VF4",3200d);
		Car c3 = c1;	
		
		
		// cap nhat gia ban cua vf5 thanh 2600
		c1.setSalesPrice(2600d);
		
		System.out.println("c1 --->" + c1);
		System.out.println("c2 --->" + c2);
		System.out.println("c2 --->" + c3);
		
		
	}

}
