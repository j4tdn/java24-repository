package polymorphism.method;

public class Ex01PolyMethodDemo {
	public static void main(String[] args) {
		
		//Tìm tổng 2 số nguyên
		sum(3,6);
		
		//Tìm tổng 3 số nguyên
		sum(32,34,54);
		
		//Tìm tổng n số nguyên
		sum(new int[] {234,343,23,3,33});
		int total = sum(23,32,23,24,24,34);
		
		System.out.println(" total--> "+ total);
		
		//Tìm tổng 2 số thực
		
	}
	
	//vars: numbers nhận 
	//1 mảng int
	// hoặc danh sách [0,n] các phần tử in cách nhau bởi dấu ','
	
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum= sum +number;
		}
		return sum;
	}
	
	
	// nếu 1 hàm không quan tâm đối tượng đang gọi thì sử dụng "static"
	// ngược lại sử dụng nostatic
	
	private static float sum (float n1, float n2) {
		return n1 + n2 ;
		
	}

	private static int sum (int n1, int n2) {
		return n1 + n2 ;
		
	}
	private static int sum(int n1, int n2, int n3) {
		return n1 + n2+ n3 ;
		
		
	}

	@Override
	public String toString() {
		return "Ex01PolyMethodDemo#toString";
	}

}
