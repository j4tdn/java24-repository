package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {

	public static void main(String[] args) {

		// byte va char deu in duoc ki tu va so
		// nhung khi in thi char --> ki tu
		// con byte --> so trong ma ASCII

		int x1 = 5;

		Item i1 = new Item();
		Item i2 = new Item(2, 'B', 22d);

		// obj type: available
		// Integer: value(int)
		// String: value(bye[])

		Integer o1 = new Integer(55);
		Long l1 = new Long(77l);
		String s1 = new String("Hello");
		System.out.println("o1 --> " + o1);
		System.out.println("l1 --> " + l1);
		System.out.println("s1 --> " + s1);

		// all: de khoi tao 1 obj --> dung toan tu new

		// voi kdl obj co san cua java
		// Integer, DOuble, Long ...
		// ko can phai dung toan tu new ma co the gan truc tiep
		// gia tri cho bien obj

		// vi kdl co san co duy nhat 1 thuoc tinh
		// thay vi new obj roi set value thi chi can gan value con viec new thi JAVA tu
		// lam

		// con kdl do minh tu tao ra
		// java se ko bt co bn thuoc tinh de xu ly
		System.out.println("\n===================\n");
		Integer o2 = 123;
		Long l2 = 456l;
		String s2 = "word";
		
		System.out.println("o2 --> " + o2);
		System.out.println("l2 --> " + l2);
		System.out.println("s2 --> " + s2);


	}

}
