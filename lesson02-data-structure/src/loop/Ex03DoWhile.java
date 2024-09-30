package loop;

public class Ex03DoWhile {

	public static void main(String[] args) {
		
		// do while ít nhất được thực thi lệnh {} 1 lần
		// while nếu như mới vào ddkien sai --> ko thực thi lần nào
 		
		int i = 0;
		
		do {
			System.out.println(i + "");
			i++;
		} while(i < 10);
	}
}
