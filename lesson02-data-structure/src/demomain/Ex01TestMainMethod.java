package demomain;

import java.util.Random;

public class Ex01TestMainMethod {
/*
 * Program gồm 2 phần: 
 * + Data Structure: Atribute(hướng đối tượng)/Property
 * 
 * + Algorithihm: Method(hướng đối tượng)/Function
 * ----> Tập các câu lệnh để thực thi 1 bài toán, chức năng5
 * ----> Nhận dữ liệu  truyền vào
 * 
 * ----> Cú pháp của 1 hàm trong Java
 * ----> [access_modifier] [static] returned_data_type method_name (... argument )
 * ==========================================
 * 1. [acces_modifier] phạm vi truy cập
 * nếu một hàm có access modifier là:
 * + private
 * --> chỉ đc phép sử dụng trong class chứa nó
 * + public
 * --> sử dụng trong class hiện tại và bất kì nơi đâu trong dự án 
 * + protected
 * + ko khai báo = ____
 * ========================================
 * 2. [static]: Học lại trong OOP - L3
 * 	Trong class chứa các hàm, nếu hàm có từ khóa: 
 * 		+static: hàm đó sẽ thuộc phạm vi của class
 * --> có thể lấy tên class gọi nó
 * 
 * 		+non   : hàm đó sẽ thuộc pham vi của object dc tạo ra từ class
 * --> tạo ra đối tượng từ class rồi mới gọi được hàm non-static
 * ======================================== 
 * 3. returned_data_type: kiểu dữ liệu trả về
 * + void
 * 	Khi code 1 hàm, kết quả của hàm đó chỉ dùng để in ra mà ko dùng kq
 * của hàm dó làm việc khác
 * --> void
 * VD: Hàm in chuỗi, in tam giác
 * + !void
 *  Không phải void: int, stỉng, double 
 *  khi code 1 hàm, kết quả của hàm đó là input của 1 bài toán, khác khác phải trả về kết quả 
 *  VD: logic tính toán gồm nhiều bước
 *  B1: random a ---> [0, 10)
 *  B2: random b ---> [0, 10)
 *  B3: tính sum a + b
 *  B4
 *  ========================================
 *  4. method_name: tên hàm
 *  + đặt tên theo chức năng của hàm
 *  + thường là 1 (cụm) động từ
 *  + quy tắc đặt tên: camel case là kí từ đầu điên của từ đầu tiên viết thường 
 *  kí tự đầu tiên của từ tiếp theo viết hoa
 *  vd: getStudenID
 *  =======================================
 *  5. [...arguments..]: tham số truyền vào
 *  + Khi chương trình thực thi mỗi hàm sẽ được tạo ra vào quản lý trên từng vùng nhớ khác nhau 
 *  + Đôi lúc dữ liệu của hàm cần xử lý ở hàm kia ---> truyền thông qua 
 *  
 *  vd: hàm main có 2 biến a, b 
 *  muốn tính tổng a, b thì có thể tự code logic ở hàm main 
 *  hoặc tạo ra hàm sum khác để xử lý, gọi hàm sum và truyền a, b vào
 * 	-------------------------------------------------------------
 * trong 1 class chỉ có duy nhất 1 hàm main 
 * main: là nơi bắt đầu và kết thúc của một chương trình 
 *  1 file .java có thể có nhiều class nhưng chỉ có duy nhất 1 hàm main
 */
	// để format code dùng ctrl + shift + F và bôi đen phần code cần format
public static void main(String[] args) {
	System.out.println("Ex01TestMainMethod#main");
	main();
	closure();
	Ex01TestMainMethod.closure(); // chỉ lấy tên class gọi hàm này từ bên ngoài class
	expose();
	Ex01TestMainMethod.expose();
	// tạo ra 1 đối tượng cho class Ex01 ( trường hợp ko cso static ) 
	new Ex01TestMainMethod().nSTest();
	System.out.println("\n==================\n");
	//B1
	int a = random(10);
	//B2
	int b = random(10);
	//B3
	int sum = sum(a,b);
	System.out.println("sum --> " + sum);
}
	private static int sum(int a, int b) {
		return a+b; 
	}
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	//khai báo 1 hàm main khác
	public static void main() {
		System.out.println("Ex01TestMainMethod#anotherMain");
	}
	private static void closure() {
		System.out.println("--> closure");
	}
	public static void expose () {
		System.out.println("--> expose");
	}
	// ko có từ khóa static
	//vẫn gọi đc nhưng phải thông qua đối tượng
	public void nSTest() {
		System.out.println("NS-Test");
	}
	
}
