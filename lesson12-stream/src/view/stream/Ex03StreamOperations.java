package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperations {
	
	public static void main(String[] args) {
		// intermediate operations: thao tác trung gian --> hoàn toàn ko xử lý trước khi một terminal operation được gọi
		// terminal operations: thao tác đầu cuối --> thực thi stream pipeline(intermediate operations)
		
		List<Dish> menu = DataModel.getDishes();
		
		CollectionUtils.generate("1. Dữ liệu ban đầu", menu);
		
		// Tìm tên của 3 đĩa thức ăn có lượng calo > 100
		
		// Cách 1: Hoàn thành toàn bộ cho B1 -> B2 -> B3
		// B1: Tìm các đĩa có lượng calo > 100
		// B2: Lấy ra 3 đĩa đầu tiên
		// B3: Lấy ra tên của nó
		
		// Cách 2: Gộp 3 thao tác lại xử lý chung 1 lần --> pipeline
		
		menu.stream()                           // Stream<Dish>
			.filter(d -> {
				System.out.println("fillter --> " + d);
				return d.getCalories() > 100;
			}) // Stream<Dish>
			.map(d -> {
				System.out.println("map --> " + d);
				return d.getName();
			}) // Stream<String>
			.limit(4)
			.collect(Collectors.toList()); // List<String>
		
		
		
		System.out.println("\nKết thúc");
		
	}
	
}
