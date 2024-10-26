package loop;

public class Ex04BreakContinue {

	public static void main(String[] args) {
		// switch case break
		// loop break continue
		
		for(int i = 1;i < 10;i++) {
			if (i % 5 == 0) {
				// Thoat khoi toan bo vong lap
				break;
			}
			System.out.println(i);
		}
		System.out.println("\n======================\n");
		for(int i = 1;i <= 10;i++) {
			if (i % 5 == 0) {
				// Ket thuc som vong lap hien tai roi
				// Nhay sang vong lap tiep theo
				// Bo qua doan code thuc thi phia duoi continue
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
}
