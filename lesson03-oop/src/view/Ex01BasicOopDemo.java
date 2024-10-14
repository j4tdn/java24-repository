package view;

import bean.Car;

public class Ex01BasicOopDemo {

	public static void main(String[] args) {
		
		Car c1 = new Car(1, "Vinfast", "VF5", 2000d);
		Car c2 = new Car(2, "Vinfast", "VF8", 4200d);
		Car c3 = c1;
		
		// cập nhật giá bán của vf5 thành 2600 (gán giá trị cho thuốc tính)
		
		c1.setSalesPrice(2600d);
		
		System.out.println("vf8 pricae --> " + c2.getSalesPrice());
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		
		Car c4 =  new Car();
		c4.setId(44);
	
		
	}
}
