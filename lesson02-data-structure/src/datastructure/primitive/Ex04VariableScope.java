package datastructure.primitive;

public class Ex04VariableScope {
	public static void main(String[] args) {
		char a1 = 'A';
		{
			char a11 = 'W';
		}

	}

	public static void test01() {
		char a2 = 'B';
	}

	public static void test02() {
		char a3 = 'C';
	}
}
