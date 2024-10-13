package view;

import bean.Car;

public class Ex02Destructor {
	public static void main(String[] args) {

		final Car c1 = new Car(1, "A1", "A1 Name", 220d); // H1 ( HEAP )

		Car c2 = new Car(2, "A2", "A22 Name", 280d); // H2

		Car c3 = c1;

		c2 = new Car(22, "A22", "A22 Name", 440d); // H4

		// Ô nhớ, đối tượng ở H2 ko dc liên kết với bất kỳ biến nào
		// ở stack --> unused, với java sẽ tự cleả những unused object này
		// thông qua cơ chế garbage collection

		// Nguyên nhân(Tại sao có những đối tượng ko dc dùng đến):
		// Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay ô nhớ khác
		// Ô nhớ cũ ko còn được sử dụng

		// Có cách nào để hạn chế tạo ra các unused object không ?
		// Gán final (STACK) cho KDL đổi tượng => ko cho biến trỏ đến đối tượng khác,
		// khóa cứng ở STACK tức là toán tử '='
		// => tránh tạo ra unused object
	}
}
