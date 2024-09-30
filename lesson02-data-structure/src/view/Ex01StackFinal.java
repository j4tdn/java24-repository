package view;

public class Ex01StackFinal {
	
//	Toán tử = hoạt động ở STACK
//	Final  ở STACK  -> toán tử 
	//final không thể thay đổi gtri ở stack 
	public static void main(String[] args) {
		int a = 5;
		final int b = 10;
		int c = 15;
		
		a = b;
		//b = c; final stack không thể dùng lại toán tử =
		c = a;
	}
	
}
