package sorting.bubble;
import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.sorting.StringCompFunc;

public class Ex05BubbleSortingString {
	public static void main(String[] args) {
		
		String[] elements = {"tt",null ,null,null,null,"A12", "Z","k7181", "-","mat81"};
		
		System.out.printf("1. Mảng ban đầu %s\n\n", Arrays.toString(elements));
		
		/*
		Với mảng đối utợng, có thể xảy ra trường hợp giá trị phần tử bị NULL - > NPException
		Xử lí
		-----
		B1: xử lí cho những phần tử null trước
			--> Null first --> null bé hơn những ptu còn lại
			--> Null last --> null lớn hơn những ptu tồn tại
		B2: Với những cặp liền kề ko có null 
		--> thì ss như bình thường
		
		
		 */

		
		bubbleSort(elements, (s1, s2) -> {
			//B1: Xử lí cho những phần tử mang giá trị null
			if ( s1 == null) {
				return -1;
			}
			if ( s2 == null) {
				return 1;
			}
			
			//B2: Sắp xếp cho các cặp phần tử liền kề khác null
			return s1.compareTo(s2);
		});
		System.out.printf("1. Mảng sắp xếp tăng dần ( null first) -> %s\n\n", Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			return s2.compareTo(s1);
		});
		System.out.printf("1. Mảng sắp xếp tăng dần ( null last) -> %s\n\n", Arrays.toString(elements));
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null ) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		System.out.printf("1. Mảng sắp xếp giam dần ( null first) -> %s\n\n", Arrays.toString(elements));
	}
	//swap (s1, s2) nếu compare(s1,s2) > 0
	//Sẽ sắp xếp tăng nếu n1 > n2 -> swap -> compare trả về số > 0 khi s1 > s2
	private static void bubbleSort(String[] elements, StringCompFunc scf) {
		for (int i =0 ; i < elements.length; i++) {
			for (int j = 0; j < elements.length -i -1; j++) {
				if ( scf.compare(elements[j],elements[j+1]) > 0) {
					swap(elements, j, i);
				}
			}
		}
	}

}
