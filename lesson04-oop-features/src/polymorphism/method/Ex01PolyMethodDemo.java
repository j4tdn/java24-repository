package polymorphism.method;

public class Ex01PolyMethodDemo {
	
	public static void main(String[] args) {
		
		//Tim tong 2 so nguyen
		//Tim tong 3 so nguyen
		//Tim tong n so nguyen
		
		int total = sum(2,3,4,5,6,7);
		System.out.println("total --> " + total);
		
	}
	
	private static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	private static float sum(float n1, float n2) {
		return n1 + n2;
	}
	
	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	private static int sum(int ... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ex01PolyMethodDemo#toString";
	}
}
