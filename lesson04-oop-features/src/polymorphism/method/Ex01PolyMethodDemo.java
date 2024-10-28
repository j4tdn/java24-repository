package polymorphism.method;

public class Ex01PolyMethodDemo {
	public static void main(String[] args) {
		//tim tổng 2 số nguyên 
		//tìm tổng 2 số nguyên
		//tìm tổng n số nguyên
		
		//Tìm tổng 2 số thực
		
		int sum = sum(2,5,6,7,8);
		System.out.println(sum);
		
	}
	private static float sum(float n1 , float n2) {
		return n1 + n2;
	}
	
	
	private static int sum(int n1 , int n2) {
		return n1 + n2;
	}
	
	private static int sum(int n1 , int n2,int n3) {
		return n1 + n2 + n3;
	}
	
	
	//Vars : numbers nhận
	// 1 mảng int 
	//hoặc danh sách [] các phần tử in cách nhau bởi dấu ,
	private static int sum (int... numbers) {
		int sum  = 0;
		for(int number:numbers) {
			sum = sum + number;
		}
		return sum;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ex01PolyMethodDemo#toString";
	}
	
}
