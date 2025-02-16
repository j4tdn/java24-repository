package view;

import java.util.Arrays;

public class Ex03OperationAddRemove {
	public static void main(String[] args) {

		String[] words = { "a", "b", "c", "d", "e" };

		// Viet ham them 1 phan tu
		System.out.println("Them moi: " + Arrays.toString(add(words, 2, "w")));

	}

	private static String[] add(String[] source, int pos, String newvalue) {
		String[] target = new String[source.length + 1];

		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
		target[pos] = newvalue;

		return target;
	}

	private static String[] remove(String[] source, int pos) {
		String[] target = Arrays.copyOfRange(source, 0, source.length);


		for (int i = pos; i < source.length; i++) {
			target[i] = target[i + 1];
		}
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
}
