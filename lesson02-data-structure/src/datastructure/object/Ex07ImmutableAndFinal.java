package datastructure.object;

public class Ex07ImmutableAndFinal {
	public static void main(String[] args) {
		// immutable: bất biến tại HEAP ( khi các thuộc tính là private and final
		// final: bất biến tại STACK

		final int a = 5;

		Integer a2 = 5; // H1(value=5)([private final])
		a2 = 7; // tạo ô nhớ mới rồi trọ địa chỉ mới chứ k cập nhập 5 -> 7

	}

}
