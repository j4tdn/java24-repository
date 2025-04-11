package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import common.Kind;
import model.DataModel;

public class Ex02StreamTraversableOnce {
	
	public static void main(String[] args) {
		// Câu hỏi 1: Tại sao ko tạo data model trả về Stream<T>
		// Câu hỏi 2: Tạo sao sau khi xử lý xong không lưu trữ dữ liệu ở Stream<T> mà phải convert sang kiểu khác
		
		// Vì Stream is traversable once: Dữ liệu trong stream chỉ có thể sử dụng được duy nhất 1 lần, nếu
		// lưu trong stream vẫn được nhưng khá bất tiện cho nên ko khởi tạo cũng như lưu trữ dữ liệu trong
		// stream sau khi xử lý xong
		
		List<Dish> menu = DataModel.getDishes();
		
		Stream<Dish> highCaloriesDishes = menu.stream()
			.filter(d -> d.getCalories() > 200);
		
		// In ra dữ liệu
		highCaloriesDishes.forEach(System.out::println);
		
		System.out.println("\n\n");
		
		// Tìm các đĩa là fish
		highCaloriesDishes.filter(d -> d.getKind() == Kind.FISH)
			.forEach(System.out::println);
		
	}
	
}
