package demomain;

import java.util.Random;

public class Ex01TestMainMethod {
	
	/*
	 
	 Progtam:
	 + Data Structure : Attribute/Property
	 + Algorthihm	  : Method/Function	
	 
	 --> Tap cac cau lenh de thuc thi 1 bai toan, chuc nang
	 --> Nhan du lieu truyen vao
	 
	 --> Cu phap cua 1 ham trogn java
	 
	 --> [access_modifier] [static] return_data_type method_name ([...arguments])
	 
	 1.[access_modifier] : Pham vi truy cap
	 Neu 1 ham co co access_modifier la:
	 + private
	 	--> Chi duoc phep su dung trong class chua no
	 + public
	 	--> Su dung trong class hien tai va bat ky noi dau trong du an
	 + protected
	 + ___
	 
	 2.[static]: Học lại trong OOP - Lesson 03
	 Trong class chứa các hàm, nếu hàm có từ khóa
	 + static: Hàm đó sẽ thuộc phạm vi của class
	 	--> có thể lấy tên class để gọi hàm đó
	 
	 + non	 : Hàm đó se thuộc pham bi của object được tạo ra từ class
	 	--> tạo ra đối tượng từ class rồi mới gọi được hàm non-static
	 
	 3. returned_data_type : KDL trả về
	 + void
	 Khi code 1 hàm, kết quả hàm đó chỉ dùng để in ra
	 Không dùng kết quả hàm đó để làm việc khác
	 --> void
	 VD: Hàm in ra chuỗi, hàm in ra tam giác
	 + !void: không phải void: int, string, double
	 Khi code 1 hàm, kết quả hàm đó là input của
	 1 bài toán, hàm khác phải trả về kết quả
	 VD: Logic tính toán gồm nhiều bước
	 B1 -> B2 -> B3 -> B4
	 B1: Random a --> [0, 10)
	 B2: Random b --> [0, 10)
	 B3: Sum of a and b
	 B4: Square result --> print
	 
	 4. method_name: Tên hàm
	 + đặt tên theo chức năng của hàm
	 + thường là 1 cụm động từ
	 + đặt theo quy tắc: camel case và kí tự đầu tiên của từ đầu tiên viết thường
	   kí từ đầu tiên của các từ tiếp theo viết hoa
	   VD: getStudentID
	 
	 * Trong 1 class chi co duy nhat 1 ham main 
	 * la noi bat dau la noi ket thuc khi thuc thi 1 chuong trinh (Java class)
	 
	 .java -> class -> main
	 
	 5.[...argiments]: tham số truyền vào
	 + Khi chương trình thực thi mỗi hàm sẽ được tạo ra
	   vào quản lý trên từng vùng nhớ khác nhau
	 + Đôi lúc dữ liệu của hàm này cần xử lí ở hàm kia --> truyền thông qua tham số
	 
	 VD: hàm main có 2 biến a, b
	 muốn tính tổng a, b thì có thể tự code logic ở hàm main
	 hoặc tạo ra 1 hàm sum khác để xử lí, gọi hàm sum và truyền vào a, b
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();
		closure();
		
		expose();
		
		// new Ex01TestMainMethod(): Tạo ra 1 đối tượng cho class Ex01TestMainMethod
		new Ex01TestMainMethod().nsTest();
		// đang chung class không cần như này Ex01TestMainMethod.closure();
		// chỉ lấy tên class gọi hàm khi hàm này được gọi từ bên ngoài class
		System.out.println("\n===================================\n");
		
		// B1
		int a = random(10);
		// B2
		int b = random(10);
		// B3
		int sum = sum(a, b);
		System.out.println("Sum -->" + sum);
	}
	
	private static int sum(int a,int b) {
		return a + b;
	}
	
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	
	//Khai bao 1 ham main khac'
	public static void main() {
		System.out.println("Ex01TestMainMethod#anothermain");
	}
	
	private static void closure() {
		System.out.println("--> closure");
	}
	
	public static void expose() {
		System.out.println("--> expose");
	}
	
	// Không có từ khóa static
	// Vẫn gọi được, từ thông qua đối tượng của class
	public void nsTest() {
		System.out.println("NS-Test");
	}
	
	
}
