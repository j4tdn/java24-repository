package ex01;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowOf(2, 8));
		System.out.println(isPowOf(8, 2));
		System.out.println(isPowOf(6, 2));
	}
	
	public static boolean isPowOf(int a, int b) {
		int s = 1;
		int c = 1;
		
		if(b>a) {
			while(s < b) {
				s =(int) Math.pow(a,c);
				c++;
			}
			return s == b;
		}else {
			while(s < a) {
				s =(int) Math.pow(b,c);
				c++;
			}
			return s == a;
		}

	}
}
