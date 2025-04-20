package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperation {
	public static void main(String[] args) {
		
		// Intemediate operation (thao tác trung gian)
		// -> sẽ ko xử lí trước khi terminal operation được gọi, chỉ hình thành pipeline (luồng xử lí)
		
		// Terminal operation (thao tác đầu cuối)
		// -> Gọi để thực thi cái pipeline đã hình thành trước đó
		
		// => trả lời cho câu hỏi: phải gọi collect sau khi thực hiện các quá lệnh trước đó trong stream
		// vì các thao tác trung gian kia chỉ được gọi thôi chứ chưa thực thi gì hết, chỉ khi collect thì mới tiến hành xử lí 1 lần
		
		List<Dish> menu = DataModel.getDishes();
		CollectionUtils.generate("1. Dữ liệu ban đầu", menu);
		
		//1. Tìm tên của đĩa thức ăn có lượng calo > 100
		
		// Cách 1:
		// B1: Tìm các đĩa có calor > 100
		// B2: Lấy ra 3 đĩa đầu tiên
		// B3: lấy ra tên của nó
		
		//Cách 2: gộp 3 thao tác xử lí 1 lần --> pipeline
		
		
		
		menu.stream() 						// Stream<Dish>
		.filter(d -> {
			System.out.println("filer --> "+d);
			return d.getCalories() > 150;
		}) 									//Stream<Dish>
		.map(d -> {							//Stream<String>
			System.out.println("map --> "+ d);
			return d.getName();
		})
		.limit(4)
		.collect(Collectors.toList());
		
	}

}
