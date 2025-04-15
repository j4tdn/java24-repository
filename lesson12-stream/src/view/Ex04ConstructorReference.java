package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.PentaFunction;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex04ConstructorReference {

	public static void main(String[] args) {
		// Sau khi đọc dữ liệu từ file List<String> convert nó sang một List<Apple>

		var lines = DataModel.readFiles();

		// lỉne = "1, green, 200, Vietnam"
		Set<Apple> objects = mapping(lines, Apple::new);
		generate("objects", objects);
		
		
		Supplier<Apple> s1 = () -> new Apple();
		Supplier<Apple> s2 = Apple::new;
		Apple a1 = s2.get();
		
		System.out.println(a1);
		
		PentaFunction<Integer, String, Double, String, Apple> pf1 = (id, color, weight, country) -> {
		    return new Apple(id, color, weight, country);
		};

		PentaFunction<Integer, String, Double, String, Apple> pf2 = Apple::new;
		
		Apple a2 = pf2.apply(101, "Purple", 200.0, "LAo");
		
		System.out.println(a2);

	}

	private static <T, R> Set<R> mapping(List<T> elements, Function<T, R> func) {
		Set<R> output = new HashSet<>();

		for (T element : elements) {
			output.add(func.apply(element));
		}
		return output;
	}
}
