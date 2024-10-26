package view;
import bean.Car;
public class Ex02Destructor {
	public static void main(String[] args) {
		Car c1 = new Car(1, "A1", "A1 Name",200d); //H1
		Car c2 = new Car(1, "A2", "A2 Name",260d); //H2
		Car c3 = c1;
		c2 = new Car(22, "A22", "A22 Name", 440d); //H4
		// Ô nhớ, đối tượng ở vị trí H2 không còn được liên kết bởi bất kỳ biến nào 
		// Ở stack --> unused, với java sẽ tự clear những unused object
		// Thông qua cơ chế garbage collection
		
		//++Nguyên nhân++
		//Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay ô nhớ khác => ô nhớ cũ không còn được sử dụng 
		
		//++Khắc phục++
		// Gán final cho biến KDL đối tượng 
		// Ví dụ : final Car c1 = new Car(1, "A1", "A1 Name",200d);
	}
}
