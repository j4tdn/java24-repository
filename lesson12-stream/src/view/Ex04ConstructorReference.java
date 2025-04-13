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

		List<String> lines = DataModel.readFiles();

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
		Apple a2 =pf2.apply(1, "a", 11d, "ab");
		System.out.println(a2);
	}

	private static <T, R> List<R> mapping(List<T> elements, Function<T, R> func) {
		List<R> output = new ArrayList<>();

		for (T element : elements) {
			output.add(func.apply(element));
		}

		return output;
	}

}
