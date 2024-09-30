package demomain;

import java.util.Random;

public class Ex01TestMainMethod {
	
	/*
	 * Program
	 * + Data Structure: Attribute / Property
	 * 
	 * 
	 * + Algorithm: Method / Function
	 * -> Tập các câu lệnh để thực thi 1 bài toán, chức năng
	 * -> Nhận dữ liệu truyền vào
	 *   
	 *    Cú pháp của 1 hàm trong Java
	 *   [access_modifier] [static] returned_data_type method_name([...argument])
	 *   
	 *   1. [access_modifier] phạm vi truy cập
	 *   Nếu 1 hàm có access modifier là
	 *   + private
	 *   	-> Chỉ đươc phép sử dụng trong class chứa nó
	 *   + public
	 *   	-> Sử dụng trong class hiện tại và bất kỳ nơi đâu trong dự án
	 *   + protected
	 * 
	 *	 2. [static] 
	 *	Trong class chứa các hàm, nếu hàm có từ khóa
	 *	+ static: hàm đó sẽ thuộc phạm vi của class
	 *		-> Có thể lấy tên class để gọi nó
	 *	+ non 	: hàm đó sẽ thuộc phạm vi của object được tạo ra từ class
	 *		-> Tạo ra đối tượng từ class rồi mới gọi được hàm non-static
	 * 
	 * 	 3. returned_data_type: KDL trả về
	 *  + void 
	 *  khi code 1 hàm, kết quả của hàm đó chỉ dùng để in ra 
	 *  không dung kq của hàm đó làm việc khác
	 *     --> void 
	 * 
	 * 	 + !void 
	 * 	không phải void: int, string, double
	 * 	khi code 1 hàm, kết quả của hàm đó lại là input của 1 bài toán,
	 * hàm khác phải trả về kết quả
	 * 
	 * 	4. method_name: Tên hàm
	 * 	+ Đặt tên theo chức năgn của hàm
	 * 	+ thường là 1 [cụm] động từ
	 * 	+ quy tắc đặt tên: camel case và ký tự đầu tiên của từ đầu tiên viết thường, ký tự đầu tiên của các từ sau thì viết hoa
	 * 
	 *  Ex: getStudents
	 *  
	 *  5. [..arguments]: tham số truyền vào
	 * 
	 * 
	 * trong 1 class chỉ có duy nhất 1 hàm mmain
	 * là nơi bắt đầu và kết thúc khi thực thi chương trình (Java Class)
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();
		closure();
		expose();
		
		
		new Ex01TestMainMethod().nsTest();
		
		
		
		System.out.println("============");
		
//		b1
		int a = random(10);
		int b = random(10);
		
		int sum = sum(a,b);
		System.out.println("sum: "+ sum);
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	
	public static void main() {
		System.out.println("test");	
	}
	
	private static void closure() {
		System.out.println("--> closure");
	}
	
	public static void expose() {
		System.out.println("--> expose");
	}
	
//	khoong có từ khóa static 
//	vẫn gọi được, gọi thông qua đối tượng cua class
	
	public void nsTest() {
		System.out.println("NS_Test");
	}
	
}
