package live.demo;

public class Test {

	public static void main(String[] args) {

		Human ceo1 = new CEO();

		Human manager1 = new HeadOfDepartment();
		Human manager2 = new HeadOfDepartment();

		Human staff1 = new Staff();
		Human staff2 = new Staff();
		Human staff3 = new Staff();
		Human staff4 = new Staff();
		Human staff5 = new Staff();
		Human staff6 = new Staff();

	}

	public static void showInfor(Human[] humans) {
		for (Human human : humans) {
			System.out.println("Thông tin nhân sự: " + human);
		}
	}

}
