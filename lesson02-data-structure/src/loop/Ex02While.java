package loop;

public class Ex02While {
	
	public static void main(String[] args) {
		
		int i = 0;
//		while (i<10) {
//		System.out.print(i+" ");	
//		i++;
//	}
		while(true) {
			if(i==10) {
				break;
			}
			System.out.print(i+" ");
			i++;
		}

}
}