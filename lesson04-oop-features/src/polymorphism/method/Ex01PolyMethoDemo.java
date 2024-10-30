package polymorphism.method;

public class Ex01PolyMethoDemo {

	public static void main(String[] args) {
		// Tìm tổng 2 số nguyên
		sum(3,6);
		// Tìm tổng 3 số nguyên
		sum(2, 5, 6);
		// Tìm tổng n số nguyên
		sum(new int[] {2, 5, 8, 5});
		
		sum(2, 5, 8, 7, 8, 2);
		
		
		// Tìm tổng 2 số thực
	}
	
	// vars: numbers nhận
	// 1 mảng int
	// hoặc danh sách[0,n] các phần tử in cách nhau vởi dấu ,
	private static int sum(int... numbers) {
		int sum=0;
		for (int number: numbers) {
			sum=sum+number;
		}
		return sum;
	}
	
	private static float sum(float n1, float n2) {
		return n1 + n2;
	}
	
	private static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	@Override
	public String toString() {
		return "Ex01PolyMethođemo#toString";
	}
}
