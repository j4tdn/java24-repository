package demomain;

import java.util.Random;

public class Ex01TestMainMethod {

	/*
	 Program
	 + Data strut
	 +
	 -->tập các câu lệnh để thực thi 1 bài toán, chức năng
	 -->Nhận dữ liệu truyền vào
	 
	
	 
	 --> Cú pháp của 1 hàm trong Java
	 --> [access_modifier] [static] returned_data_type method_name([.....arguments]
	
	
	
	   1.[access_modifier]: phạm vi truy cập
	   Nếu một hàm có access modifier là
	   +private:
	   --> chỉ được phép sử dụng trong class chứa nó
	   +public
	   -->sử dụng trong class hiện tại và bất kì nơi đâu trong dự án 
	   +protected
	   +____(không khai báo)
	   
	   2. [static]: học lại trong OOP - L3
	   Trong class chứa các hàm, nếu các hàm có từ khóa
	   +static: hàm đó sẽ thuộc phạm vi của class
	  --> có thể lấy tên class để gọi hàm đó
	   +non   : hàm đó sẽ thuộc phạm vi của objest được tạo ra từ class
	  --> tạo ra đối tược từ class rồi mới gọi được hàm non-static
	  
	  3. returned_data_type: KDL trả về
	  +void
	  Khi code 1 hàm, kết quả của hàm đó chỉ dùng để in ra
	  Không dùng kết quả của hàm đó làm việc khác
	  --> void
	  VD: hàm in ra chuỗi, hàm in ra tam giác
	  +!void; khogno phải void: int, String, double
	  Khi code một hàm, kết quả của hàm đó input của 1 bài toán
	  , hàm khác phải trả về kết quả
	  VD: logic tính toán gồm nheieuf bước
	  B1->B2->B3-B4
	  B1: Random a -->[0, 10]
	  B2: Random b -->[0, 10]
	  B3: Sum of a and b
	  B4: Square result-->print
	  
	  4. method_name: tên hàm
	  +đặt tên theo chức năng của hàm
	  + thường là 1[cụm] động từ
	  + quy tắc đặt tên: camel case và kí tự đầu tiên của từ đầu tiên viết thường
	   kí tự đầu tiên của các từ tiếp theo viết hoa
	     Vd: getStudentId
	     
	  5. [...arguments]: tham số truyền vào
	  +khi chương trình thực thi thì mỗi hàm sẽ được tạo ra 
	  và được quản lý trên từng vùng nhwos khác nhau
	  +Đôi lúc dư liệu của hàm này cần xử lý ở hàm kia--> truyền thông qua tham số
	  VD; hàm main có 2 biến a, b
	  muốn tính tổng a, b thì có thể tự code logic ở hàm main hoặc tạo ra hàm sum khác để xử lý, 
	  gọi hàm sum và truyền a, b vào
	     
	     
	  Trong 1 class chỉ có duy nhất 1 hàm main
	 là nơi bắt đầu và kết thúc khi thực thi một chương trình(Java class)
	 .java -->class->main 
	 */
	public static void main(String[] args) { 
	System.out.println("Ex01TestMainMethod#main"); 
	//Khai báo 1 hàm main khác
	main();
	closure();
	Ex01TestMainMethod.closure();
	expose();
	Ex01TestMainMethod.expose();
	//đang chung class không cần như này
	// chỉ lấy tên class gọi hàm hàm này được gọi từ bên ngoài class
	new Ex01TestMainMethod().nsTest();
	System.out.println("\n=============");
	//B1
	int a = random(10);
	//B2
	int b = random(10);
	//B3 
	int sum = sum(a, b);
	System.out.println("sum   " + sum);
} 
	private  static int sum(int a, int b) {
		return a + b;
	}
	
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	
	public static void main() {
		System.out.println("Ex01TestMainMethod#anotherMain");
	}
	
	private static void closure() {
		System.out.println("-->closure");
	}
	public static void expose() {
		System.out.println("-->expose");
	}
	// không có từ khóa static
	//vẫn gọi được, gọi thông qua đối tượng của class
	public void nsTest(){
		System.out.println("NS-Test");
		
	}
	
}