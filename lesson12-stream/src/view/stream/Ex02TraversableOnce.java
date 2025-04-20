package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import common.Kind;
import model.DataModel;

public class Ex02TraversableOnce {

	public static void main(String[] args) {
		
		//Cau hoi 1. vì sao khởi tạo datamodel không trả về Stream<T> luôn mà phải trả về collection
		//Cau hoi 2. tại sao khi xử lí xong không lưu dữ liệu ở Stream mà phải convert lại về kiểu khác 
		// vd: collect(Collectors.toList())
		
		//Vì stream là travesabnle once (duyệt 1 lần duy nhất) : độ dữ liệu trong stream chỉ có thể sử dụng được 1 /
		//nếu lưu trong stream vẫn được nhưng bất tiện
		// cho nên ko khởi tạo cũng như lưu trữ dữ liệu trong stream sau khi sử dụng stream xong
				
		List<Dish> menu = DataModel.getDishes();
		
		Stream<Dish> highCalories = menu.stream()
				.filter(d -> d.getCalories() > 200);

		// In ra dữ liệu
		highCalories.forEach(System.out::println);
		
		//Tìm các đĩa là Fish
		highCalories.filter(d -> d.getKind() == Kind.FISH)
		.forEach(System.out::println);
	
	}
}
