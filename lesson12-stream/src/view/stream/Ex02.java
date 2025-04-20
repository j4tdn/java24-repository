package view.stream;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex02 {
	
	/*
		Cho ds cac so nguyen
		+ tim cac phan tu chan trong danh sach
		+ Unique
			. Tao ra danh sach cac phan tu ma khong trung nhau
			tu danh sach da cho
			--> VD: 1 2 2 3 3 4 --> 1 2 3 4
			. Tao ra cac phan tu la duy nhat trong danh sach
			--> VD: 1 2 2 3 3 4 --> 1 4
	 	+ Lay 5 ptu cuoi cung trong ds
	 	+ Lay 3 phan tu dau tien trong ds
	 
	 */
	
	public static void main(String[] args) {
	
		var number = List.of(1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8);
		
//		Phan tu chan
		number.stream()
			.filter(d -> d % 2 == 0)
			.toList();
		
//		phan tu khong trung nhau
		number.stream()
			.collect(Collectors.toSet());
		
		var string = List.of("A", "B", "B", "C", "D", "D", "D", "A");
//		phan tu la duy nhat
//		var test = string.stream()  // stream<String>
//			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Map<String, Long>
//			.entrySet()  // Set<Entry<String, Long>>
//			.stream()  //Stream<Entry<String, Long>>
//			.filter(e -> e.getValue() == 1)  //Stream<Entry<String, Long>>
////			.map(e -> e.getKey())
//			.map(java.util.Map.Entry::getKey)  //Stream<String>
//			.toList();   //List<String>
		
		var list = string.stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.map(java.util.Map.Entry::getKey)
			.toList();
		
		CollectionUtils.generate("phan tu la duy nhat", list);
		
//		lay 5 ptu cuoi
		number.stream()
			.skip(number.size() - 5)
			.toList();
		
//		Lay 3 phan tu dau
		number.stream()
			.limit(3)
			.toList();
	}

}
