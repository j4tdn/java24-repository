package enumeration;

// 1 Enum : chỉ có thể khai báo và sử dụng đối tượng tròn enum, bên ngoài không thể tạo ra thêm enum mới
public enum CirclePos {
	// 3 giá trị của CirclePos
	// CirclePos INSIDE = new 
	
	
	INSIDE("Trên đường tròn"),
	ONSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String localizedMessage;
	
	CirclePos(String localizedMessage){
		this.localizedMessage = localizedMessage;
	}
	public String getLocalizedMessage() {
		return localizedMessage;
	}

}
