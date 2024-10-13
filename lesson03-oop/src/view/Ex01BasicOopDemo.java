package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		Car c1 = new Car(1,"vinfast","vf5",2000d);
		Car c2 = new Car(2,"vinfasr","vf8",4200d);
		Car c3 = c1;
		
		
		//cập nhập giá bán vf5 thành 2600 (gán giá trị cho thuộc tính)
		c1.setSalesPrice(2600d);
		
		
		
		//in ra gia của vf8
//		System.out.println("vf8 price --> "+ c2.salesPrice);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
	}
}
