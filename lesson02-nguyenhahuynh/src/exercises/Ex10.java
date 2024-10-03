package exercises;

public class Ex10 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		int count = 0;
        
		while (count < 5) {
			double n = Math.floor(Math.random() * 11) + 20;
			int n1 = (int) n;
			boolean exists = false;
			for (int i = 0; i <= count; i++) {
				if (arr[i] == n1) {
					exists = true;
					break;
				}
			}
			
			if (!exists) {
                arr[count] = n1;
                count++;
            }
		}
		System.out.print("5 số ngẫu nhiên không trùng nhau là: ");
		for (int n: arr) {
			System.out.print(n + " ");
		}
	}
}
