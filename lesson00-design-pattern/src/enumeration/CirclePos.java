package enumeration;

// CirclePosL: Là 1 enum --> 1 KDL

// 1 Class: tạo N đối tượng
// 1 Enum: Chỉ có thể khai báo và sử dụng đói tượng
// trong Enum, bên ngoài không thể tạo ra Enum mới
// --> private constructor

public enum CirclePos {
	
	// 3 giá trị của CirclePos
	// CirclePos INSIDE = new CirclePos()

	INSIDE("Trong đường tròn"),
	ONSIDES("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String localizedMessage;
	
	CirclePos(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
	
	public String getLocalizedMessage() {
		return localizedMessage;
	}
	
}
