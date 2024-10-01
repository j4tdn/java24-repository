package loop;

public class Ex02While {

	public static void main(String[] args) {
		int i = 0;
		//cách 1
		while(i < 10) {
			System.out.println(i+"");
			i++;
		}
		//cách 2
		while(true) {
			if(i == 10) {
				break;
			}
			System.out.println(i+"");
			i++;
		}
		//cách 3
		
	}
}