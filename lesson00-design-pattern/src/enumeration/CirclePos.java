package enumeration;

// CirclePos: Là 1 enum --> 1 KDL

// 1 Class: Tạo N đối tượng
// 1 Enum : Chỉ có thể khai báo và sử dụng đối tượng trong enum, bên ngoài không thể tạo ra thêm enum mới
// --> default : private constructor

public enum CirclePos {
	
	// 3 giá trị của CirclePos
	// public static final CirclePos INSIDE = new CirlcePos();
	INSDIE("Trên đường tròn"),
	ONSIDE("Trong đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	
	private String localizedMessage;
	
	CirclePos(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
	
	public String getLocalizedMessage() {
		return localizedMessage;
	}
}
