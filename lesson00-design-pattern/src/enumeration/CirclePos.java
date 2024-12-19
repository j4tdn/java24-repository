package enumeration;

// CirclePos: Là 1 enum --> 1 KDL

// 1 class: Tạo N Đối tượng
// 1 Enum: chỉ có thể khai báo và sử dụng đối tượng trong
//enum, bên ngoài không thể tạo ra thêm enum mới
// --> private constructor

public enum CirclePos {
	
	// 3 giá trị của CirclePos
	// CirclePos INSIDE = new CirclePost()
	
	INSIDE("Trong duong tron"),
	ONSIDE("Tren duong tron"),
	OUTSIDE("Ngoai duong tron");
	
	private String localizedMessage;
	
	private CirclePos() {
		// TODO Auto-generated constructor stub
	}
	
	private CirclePos(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
	
	public String getLocalizedMessage() {
		return localizedMessage;
	}
	
	
}
