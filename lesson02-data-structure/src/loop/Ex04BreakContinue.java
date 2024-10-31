package loop;

public class Ex04BreakContinue {

	public static void main(String[] args) {
		// switch case break
		// loop break continue
		
		for(int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// thoát khỏi toàn bộ vòng lặp
				break;
			}
			System.out.println(i + " ");
		}
		
		System.out.println("\n ================ \n");
		
		for(int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// kết thúc sớm vòng lặp hiện tại
				// nhảy sang vòng lặp tiếp theo
				// bỏ qua đoạn code thực thi phía dưới
				continue;
			}
			System.out.println(i + " ");
		}
	}
}