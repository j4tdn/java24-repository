package exercises;

public class Ex01 {
	public static void main(String[] args) {
		int n = checkN.input();
		if (n == -1) {
			System.out.println("Bạn đã nhập sai quá 5 lần");
		} else {
			if (n % 2 == 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
