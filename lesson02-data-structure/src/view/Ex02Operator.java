package view;

public class Ex02Operator {
	public Ex02Operator() {
		// TODO Auto-generated constructor stub
		String s = "123";
		s = s + 'z';
		s = 'z' + s;
		System.out.println(s);

		int a1 = 5;
		a1++; // suffix hau to
		++a1; // prefix tien to

		System.out.println(++a1);

		int x = 2;
		int y = 4;
		int z = x++ + ++x - --y + y++ + ++x;

		System.out.printf("x(%s) y(%s) z(%s)", x, y, z);

	}
}
