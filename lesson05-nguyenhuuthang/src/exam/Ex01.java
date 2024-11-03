package exam;

public class Ex01 {
	public static void main(String[] args) {
		if(isPowerOf(8, 2)) {
			System.out.println("--> true");
		}else {
			System.out.println("--> true");
		}
	}
	public static boolean isPowerOf(int x, int y) {
		if(x >= 1) {
			if (x == 1)
				return true;
			int test = x;
			while (test < y) {
				test *= x;
			}
				return test == y;
		}
		return false;
	}
}
