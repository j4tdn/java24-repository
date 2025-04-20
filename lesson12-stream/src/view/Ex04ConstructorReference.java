package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.PentaFunction;
import model.DataModel;
import utils.CollectionUtils;

public class Ex04ConstructorReference {

	public static void main(String[] args) {
		// Sau khi đọc dữ liệu từ file List<String> convert nó sang 1 List<Apple>
		// -> List<A> convert sang List<B>
		List<String> lines = DataModel.readFiles();
		
		// Hàm khởi tạo xài method reference
		
		// Sử dụng khi ta có x,y,z bất kì và ta cần truyền nó vào 1 class new Apple(x,y,z)
		
		//line = "1, green, 200, vietnam"
		List<Apple> objects = mapping(lines, Apple::new);
		
		CollectionUtils.generate("objects", objects);
	
		Supplier<Apple> s1 = () -> new Apple();
		Supplier<Apple> s2 = Apple::new;
		Apple a1 = s2.get();
		System.out.println(a1);
		
		PentaFunction<Integer, String, Double, String, Apple> p1 = (id, color, weight, country) -> {
			return new Apple(id, color, weight, country);
		};
		PentaFunction<Integer, String, Double, String, Apple> p2 = Apple::new;
		Apple a2 = p2.apply(1, "a", 111d, "Lao");
		System.out.println(a2);
	
	}
		
	private static <T,R> List<R> mapping(List<T> elements, Function<T, R> func){
		List<R> output = new ArrayList<>();
		
		for (T element: elements) {
			output.add(func.apply(element));
		}
		return output;
	}
	
	
}
