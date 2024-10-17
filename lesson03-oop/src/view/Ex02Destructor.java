package view;

import bean.Car;

public class Ex02Destructor {
	
	public static void main(String[] args) {
		
        final Car c1 = new Car(1, "A1", "A11 Name", 220d);
		
        Car c2 = new Car(2, "A2", "A22 Name", 280d);
        
        Car c3 = c1;
        
        //c2 = new Car(22, "A22", "A22 Name", 440d);
        
        
	}

}
