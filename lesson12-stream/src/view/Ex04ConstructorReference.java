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
		List<String> lines = DataModel.readFiles();
		
		// lambda x -> object(được tạo ra qua constructor) 
		// x,y,z -> new ClassT(x,y,z)
		
		// line = "1, green, 200, Vietnam"
		List<Apple> objects = mapping(lines, Apple::new);
		
		CollectionUtils.generate("objects", objects);
		
		Supplier<Apple> s1 = () -> new Apple();
		Supplier<Apple> s2 = Apple::new;
		Apple a1 = s2.get();
		System.out.println(a1);
		
		PentaFunction<Integer, String, Double, String, Apple> pf1 = (id, color, weight, country) -> {
			return new Apple(id, color, weight, country);
		};
		
		PentaFunction<Integer, String, Double, String, Apple> pf2 = Apple::new;
		Apple a2 = pf2.apply(1, "a", 111d, "ab");
		System.out.println(a2);
	}
	
	private static <T, R> List<R> mapping(List<T> elements, Function<T, R> func) {
		List<R> output = new ArrayList<>();
		
		for (T element: elements) {
			output.add(func.apply(element));
		}
		
		return output;
	}
	
}