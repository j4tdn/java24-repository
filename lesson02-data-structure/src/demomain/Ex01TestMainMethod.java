package demomain;

import java.util.Random;
/*
Trong 1 class chỉ có duy nhất 1 hàm main

.java -> class -> main

--> Cú pháp của 1 hàm trong java
--> [access_modified] [static] returned_data_type method_name([... agurments])
1. [access_modifier] phạm vi truy cập
+ public
--> sử dụng trong class hiện tại hoặc bất kỳ nơi đâu trong dự án
+ private
--> chỉ được phép sử dụng trong class chứa nó
+ protected
+ ___

2. [static]: Học lại trong OOP - L3
	Trong class chưa các hàm, nếu hàm có từ khóa 
	+ static: hàm đó sẽ thuộc phạm vi của class
		--> có thể lấy tên class để gọi hàm đó
	+ non: hàm đó sẽ thuộc phạm vi của object được tạo ra từ class 
		--> tạo ra đối tượng từ class rồi mới gọi được hàm non-static
		
3. returned_data_type: Kiểu dữ liệu trả về
+ void:
Khi code 1 hàm, kết quả của hàm đó chỉ dùng để in ra
Không dùng kết quả của hàm đó làm việc khác
--> void
Vd: Hàm in ra chuỗi, hàm in ra tam giác

+ !void
Khi code 1 hàm, kết quả của hàm đó là kết quả input của 1 bài toán
,hàm khác phải trả về kết quả
Vd: Logic tính toán gồm nhiều bước
b1->b2->b3

4. method_name: tên hàm 
+ Đặt theo tên chức năng của hàm
+ Thường là một cụm động từ
+ Quy tắc đặt tên: camel case và ký tự đầu tiên của từ đầu tiên là viết thường,
còn ký tự đầu tiên của các từ tiếp theo là viết hoa
Vd: getStudentId

5. [agurments]: tham số truyền vào
+ Khi chương trình thực thi mỗi hàm sẽ được tạo ra và quản lý trên từng vùng nhớ 
khác nhau
+Đôi lúc dữ liệu của hàm này cần xử l
*/


public class Ex01TestMainMethod {
	
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();
		closure();
		expose();
		new Ex01TestMainMethod().nsTest();
		// Gọi hàm nsTest nhưng ko nên dùng vì chung class
		//B1
		int a = random(10);
		System.out.println("Gia tri a: "+ a);
		//B2
		int b = random(10);
		System.out.println("Gia tri b: "+ b);
		//B3
		int sum = sum(a,b);
		System.out.println("sum --> "+ sum);
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	//Khai báo 1 hàm main khác
	public static void main( ) {
		System.out.println("Ex01TestMainMethod#anotherMain");
	}
	
	private static void closure() {
		System.out.println("--> closure");
	}
	
	public static void expose() {
		System.out.println("--> expose");
	}
	
	// Ko có từ khóa static
		// Vẫn gọi được, gọi thông qua đối tượng của class
	public void nsTest() {
		System.out.println("NS-test");
	}

}

