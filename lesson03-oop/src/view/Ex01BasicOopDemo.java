package view;
import been.Car;
public class Ex01BasicOopDemo {
     
	public static void main(String[] args) {
		Car c1 = new Car(1, "vinfast", "vf5", 2000d);
		Car c2 = new Car(2, "vinfast", "vf8", 4200d);
		Car c3 = c1;
		
		//cập nhật giá bán của vf5
//		c1.salesPrice = 2600d;
		c1.setSalesPrice(2600d);
		
		
		//in giá vf8
		System.out.println("vf8 price -->" + c2.getSalesPrice());
		
		System.out.println("c1-->" + c1);
		System.out.println("c2-->" + c2);
		System.out.println("c3-->" + c3);
		
		
		
	}
}
