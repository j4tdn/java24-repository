package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperation {

	public static void main(String[] args) {
		// intermediate operations: thao tac trung gian
		// terminal operations: thao tac dau cuoi

		List<Dish> menu = DataModel.getDishes();

		CollectionUtils.generate("1. Data Original", menu);

		// search dishes calor > 100
		menu.stream() // Stream<Dish>
				.filter(d -> {
					System.out.println("fillter --> " + d);
					return d.getCalories() > 100;
				}) // Stream<Dish>
				.map(d -> {
					System.out.println("map --> " + d);
					return d.getName();
				}) // Stream<String>
				.limit(4).collect(Collectors.toList()); // List<String>

		System.out.println("\nKết thúc");

	}

}
