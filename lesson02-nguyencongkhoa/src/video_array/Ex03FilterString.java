package video_array;

import java.util.Arrays;

public class Ex03FilterString {

	public static void main(String[] args) {
		int[] numbers = {15, 16, 17, 18, 19};
		// range [2, 3]   == [2, 4) *exclusive: ngoai   => just arr[2] & arr[3]
		int[] copied = Arrays.copyOfRange(numbers, 2, 4);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copied));
		
		System.out.println("\n===============\n");
		
		String[] students = {"Peter Croud", "Kaka", "Valdes", "Patrick Veira"};
		
		System.out.println(Arrays.toString(getStudents(students)));
	}
	
	private static String[] getStudents(String[] elements) {
		// Peter croud, patrick veira, null, null
		String[] res = new String[elements.length];
		int cnt = 0;
		for (String element : elements) {
			if (element.startsWith("P")) {
				res[cnt++] = element;
			}
		}
		
		//copy phan tu 0 va 1 from res[] to  [] new
		// copy res[] => Arrays
		return Arrays.copyOfRange(res, 0, 2);
	}
}
