package view;

import bean.Car;

public class Ex02Destructor {
	public static void main(String[] args) {
		final Car c1 = new Car(1, "A", "A1", 2000d);
		final Car c2 = new Car(2, "A", "A2", 2200d);
		final Car c3 = c1;

		c2 = new Car(22, "A22", "A22 name", 440d);

		// H2 khong con duoc lien ket boi bat ki bien nao
		// o stack --> unused, voi JAVA se tu clear nhung unused object
		// thong qua co che garbage collection
	}
}
