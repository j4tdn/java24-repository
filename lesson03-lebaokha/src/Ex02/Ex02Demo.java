package Ex02;

public class Ex02Demo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Le Bao Kha", "Vario", 150, 35000000);
		Vehicle v2 = new Vehicle("Le Bao Ke", "Suzuki", 3000, 250000000);
		System.out.println(v1);
		System.out.printf("Giá trị thuế: %.2f\n", v1.taxPaypel());
		System.out.println(v2);
		System.out.printf("Giá trị thuế: %.2f", v2.taxPaypel());
	}
}
