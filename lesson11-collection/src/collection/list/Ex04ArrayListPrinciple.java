package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ArrayListPrinciple {

	public static void main(String[] args) {
		
		/*
	1. Giải thích cơ chế của ArrayList
	2. Phân biệt Array và ArrayList
		
	+ ArrayList: là 1 class bth trong Java trong bộ collection
				: Có thuộc tính là mảng 1 chiều
				: Khi thêm phần tử vào ArrayList thực ra là đang thêm vào mảng
				: thao tác trên mảng đó, sử dụng hàm hỗ trợ của arraylist
	+ Khởi tạo với: new ArrayList<>();	
		-> Ban đầu, tạo mảng rỗng elementData
		-> Khi thêm ptu đầu tiên vào, tạo mảng có 10 phần từ (max của default capacity và min capacity)
			-> Gán giá trị thêm vào cho phần tử đầu tiên của mảng, tăng size + 1
		-> Thêm các phần tử tiếp theo, lần lượt đưa vào mảng
		
		-> Đến khi size = capacity (sức chứa) thì nó sẽ gọi hàm grow() để tạo mảng mới với sức chứa lớn hơn (3/2 length hiện tại)
	
		====> Điểm hay hơn Array: 
		+ nhờ vào cách tạo mảng mới (đỡ phải tạo mảng nhiều như Array thông thường)
		+ hỗ trợ nhiều hàm xử lí 
		+ Nhờ vào size, ArrayList cũng tạo 1 mảng mới có fixed length
	 	Vd: trong lần thêm ptu đầu tiên thì size = 1, capacity là 10 có nghĩa là sức chứa = 10, 9 ptu còn lại là null
				nếu ta muốn truy cập vào ArrayList thì thay vì thông thường là nó truy cập đến capacity là 10 thì chỉ cần gọi tới size
				tức là truy cập  ArrayList từ 0 đến size.
	+ Khởi tạo với: new ArrayList<>(initialCapacity) thay thế cho DEFAULT_CAPACITY
	
		--> Dùng khi biết đc số lượng phần tử tối đa sẽ lưu trong ArrayList
		--> Hạn chế việc tạo mảng, copy giá trị qua về nhiều lần
		
				
		*/
	List<String> elements = new ArrayList<String>();
	elements.add("a1");
	elements.add("b1");
	elements.add("c1");
	elements.add("a2");
	elements.add("b2");
	elements.add("c2");
	elements.add("a3");
	elements.add("b3");
	elements.add("c3");
	elements.add("a4");
	
	}
}
