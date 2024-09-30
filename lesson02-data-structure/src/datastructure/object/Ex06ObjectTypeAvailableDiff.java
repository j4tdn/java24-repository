package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
// Giống nhau:
/*
 *
 * +KDL đối tượng lưu ở HEAP, chuỗi
 * + Đối tượng được tạo ra ở HEAP, Đối tượng sẽ bất biến(immutable)
 * 
 * 
 * Khi tạo 1 đối tượng mới -> Kiểm tra xem giá trị của đối tượng cần tạo
 * đã tồn tại ở constant pool chưa
 *  + Nếu chưa có --> tạo ra ô nhớ, gán địa chỉ cho biến
 *  + Nếu có rồi --> không tạo ra, dùng ô nhớ đã có gán địa chỉ cho biến
 *  
 * 
 */
	String s11 = "bye"; //H1
	String s22 = "tam biet"; //H2
	String s33 = "bye"; //H1
	String s44 = "bye"; //H1
	s33 = "Teo"; // H3
}
