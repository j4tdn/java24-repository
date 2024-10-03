package bean;

public class Store {
	//attribute
 public char name;
 public int openingTime;
 public int closingTime;
 //hàm khởi tạo rỗng không có tham số
 public Store () {
	 
}

public Store(char name, int openingTime, int closingTime) {
	
	this.name = name;
	this.openingTime = openingTime;
	this.closingTime = closingTime;
}

@Override
public String toString() {
	return "Store [name=" + name + ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
}

 
}
