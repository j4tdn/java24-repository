package ex02;

public class App {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("v01", "thanghuunguyen", "Maybach", 150, 10000);
		Vehicle v2 = new Vehicle("v02", "nguyenvanA", "Audi", 100, 10000);
		Vehicle v3 = new Vehicle("v03", "truongthiL", "mazda", 70, 10000);
		Vehicle v4 = new Vehicle("v04", "hoangvanC", "MG", 100, 10000);
		
		System.out.println("Tên chủ xe\tLoại xe\tDung tích\tTrị giá\tThuế phải nộp");
		System.out.println("=========================================================");
		System.out.println(v1.getOwner()+"\t "+v1.getType()+"\t "+v1.getCapacity()+"\t "+v1.getPrice());
		System.out.println(v2.getOwner()+"\t "+v2.getType()+"\t "+v2.getCapacity()+"\t "+v2.getPrice());
		System.out.println(v3.getOwner()+"\t "+v3.getType()+"\t "+v3.getCapacity()+"\t "+v3.getPrice());
		System.out.println(v4.getOwner()+"\t "+v4.getType()+"\t "+v4.getCapacity()+"\t "+v4.getPrice());
//		v1.export();
	}
}
