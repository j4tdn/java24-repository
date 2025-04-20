package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import common.Kind;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {
//	cauhoi 1: tai sao khong khoi tao data model tra ve stream<T> 
	
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		
//		 1. Get dishes which have calories > 250
		List<Dish> dishesWithHigherCalories =  menu.stream()
			.filter(d -> d.getCalories() > 250)
			.collect(Collectors.toList());
		
		CollectionUtils.generate("Get dishes which have calories > 250", dishesWithHigherCalories);
		
//		 2. Get name of dishes
		String nameOfDishes =  menu.stream()
			.map(Dish::getName)  //Stream<String>
			.collect(Collectors.joining(", "));
		
		System.out.println("Get name of dishes" + nameOfDishes);
		 
//		3. Get name of vegetarian dishes
		String nameOfVeggiesDishes = menu.stream()
				.filter(d -> d.getKind() == Kind.VEGGIE)
				.map(Dish::getName)
				.collect(Collectors.joining(", "));
		
		System.out.println("Get name of vegetarian dishes" + nameOfVeggiesDishes);
	}

}
