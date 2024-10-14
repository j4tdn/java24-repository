package loop;

public class Ex04BreakContinue {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				break;
			}
			System.out.print(i + " ");
		}

		System.out.println("\n======================\n");

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// kết thúc sớm vòng lặp hiện tại rồi nhảy sang vòng lặp tiếp theo
				//bỏ qua đoạn code thực thi phía dưới
				continue;
			}
			System.out.print(i + " ");
		}

	}
}
