package view.stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {
    public static void main(String[] args) {
        // Câu hỏi 1: Tại sao ko tạo data model trả về Stream<T>
        // Câu hỏi 2: Tạo sao sau khi xử lý xong không lưu trữ dữ liệu ở Stream<T> mà phải convert sang kiểu khác

        List<Dish> menu = DataModel.getDishes();

        // 1. Get dishes which have calories > 250
        List<Dish> dishesWithHigherCalories = menu.stream() // Stream<Dish>
            .filter(d -> d.getCalories() > 250) // Stream<Dish>
            .collect(Collectors.toList()); // List<Dish>

        CollectionUtils.generate("1. Get dishes which have calories > 250", dishesWithHigherCalories);

        // 2. Get name of dishes
        String nameOfDishes = menu.stream() // Stream<Dish>
            .map(Dish::getName) // Stream<String>
            .collect(Collectors.joining(", ")); // String

        System.out.println("2. Get name of dishes --> " + nameOfDishes);

        // 3. Get name of vegetarian dishes
        String nameOfVeggieDishes = menu.stream() // Stream<Dish>
            .filter(Dish::isVeggie) // Stream<Dish>
            .map(Dish::getName) // Stream<Dish>
            .collect(Collectors.joining(", ")); // String

        System.out.println("\n3. Get name of vegetarian dishes --> " + nameOfVeggieDishes);

        // 4. Sort a budget map
        Map<String, Integer> models = DataModel.getModels();
       
        models.entrySet() // Set<Entry<String,Integer>>
        
        
        
        
        
        
    }
}