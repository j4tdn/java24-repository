package datastructure.object;

public class Ex07ImmutableAndFinal {
	
	public static void main(String[] args) {
		// immutable: bất biến tại HEAP(khi class các thuộc tính đề là private final)
		// final    : bất biến ở STACK
		
		final int a1 = 5;
		
		Integer a2 = 5; // H1(value=5[private final])
		a2 = 7;
		
		// final Integer a3 = 5;
		// a3 = 7;
	}
	
}
	
	
