package loop;

public class Ex04BreakContinue {
	
	public static void main(String[] args) {
		//switch case break
		//loop break continue
		for (int i=1;i<=10;i++) {
			if ( i % 5 == 0 ) {
				//Thoát khỏi toàn bộ vòng lặp
				break;
			}
			System.out.print(i+ " ");
		}
		System.out.println("\n==============\n");
		for (int i=1;i<=10;i++) {
			if ( i % 5 == 0 ) {
				// Kết thúc sớm vòng lặp hiện tại rồi
				// nhảy sang vòng lặp tiếp theo
				// Bỏ qua đoạn code thực thi phía dưới
				continue;
			}
			System.out.print(i+ " ");
		}
	}

}