package loop;

public class Ex04BreakContinue {
	// switch case break
	// loop break continue m
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// kết thúc toàn bộ vòng lặp hiện tại
				break;
			}
			for (int j = 1; j <= 10; j++) {
				if (j % 5 == 0) {
					// kết thúc sớm vòng lặp hiện tại rồi
					// nhảy sang vòng lặp tiếp theo
					continue;
				}
				System.out.println(j + " ");
			}
		}
	}
}
