package polymorphism.object;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {
		//Câu hỏi 1: Biến KDL con trỏ trỏ đến đối tượng KDL cha được ko? Vì sao?
		+ Khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm runtime ko thể tìm thấy hàm riêng đó trong KDL cha
		--> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho biến KDL con
		
		//Câu hỏi 2: Tại sao không code trực tiếp biến KDL nào trỏ đến đối tượng KDL đó mà phải dùng biến cha trỏ đến con?
		+ Dễ dàng ép KDL trong phạm vi cha con, anh em lúc compile
		+Linh hoạt hơn trong 
		--> Tạo mảng: nhận danh sách các phần tử là chính nó hoặc KDL con
		--> Truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con
	}
}
