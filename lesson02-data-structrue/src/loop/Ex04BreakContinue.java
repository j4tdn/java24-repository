package loop;

public class Ex04BreakContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0)
				// out all loop
				break;
			System.out.print(i + " ");
		}

		System.out.println("\n=================\n");

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// end current loop -> switch loop next
				// ignore doan code o duoi
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
