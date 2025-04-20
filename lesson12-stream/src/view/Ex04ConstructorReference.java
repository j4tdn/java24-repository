package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;
import model.PentaFunction;

public class Ex04ConstructorReference {
	public static void main(String[] args) {
//	Sau khi đọc dữ liệu từ file Líst<String> convert nos sang 1 list<apple>
		final List<String> lines = DataModel.readFiles();
		
//		line = "1, green, 200, Vietnam"
//		List<Apple> objects = mapping(lines, line -> {
//			String[] tokens = line.split(", ");
//			
//		});
//		
		
		List<Apple> objects = mapping(lines, Apple::new);
		
		
		PentaFunction<Integer, String, Double, String, Apple> pf1 = (id, color, weight, country) -> {
			return new Apple(id, color, weight, country);
		};
		
		PentaFunction<Integer, String, Double, String, Apple> pf2 = Apple::new;
	}
	
	private static <T, R> List<R> mapping(List<T> elements, Function<T, R> function) {
		List<R> output = new ArrayList<>();
		
		for (T element: elements) {
			output.add(function.apply(element));
		}
		return output;
	}
}
