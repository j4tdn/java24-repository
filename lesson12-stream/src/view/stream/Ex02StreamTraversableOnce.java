package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import common.Kind;
import model.DataModel;

public class Ex02StreamTraversableOnce {

	public static void main(String[] args) {
		// 1: wwhy ko gen data model trả về Stream<T>
		// 2: why sau khi xử lý xong lưu save data trong Stream<T>

		// Vif Stream is traversable once: Data trog stream chỉ có thể use dc duy nhất 1 lần
		// nếu lưu trong stream vẫn dc nhưng khá bất tiện cho nên ko khởi tạo cũng như
		// lưu trữ data trog stream sau khi xử lý xog
		
		
		List<Dish> menu = DataModel.getDishes();
		
		Stream<Dish> highCaloriesDishes = menu.stream()
			.filter(d -> d.getCalories() > 200);
		
		highCaloriesDishes.forEach(System.out::println);
		
		System.out.println("\n");
		
		highCaloriesDishes.filter(d -> d.getKind() == Kind.FISH)
			.forEach(System.out::println);
	}

}
