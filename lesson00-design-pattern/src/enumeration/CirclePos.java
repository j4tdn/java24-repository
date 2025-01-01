package enumeration;

/*
 * CirclePos: Là 1 enum --> 1 KDL
 * 
 * 1 Class: Tạo N đói tượng
 * 1 Enum: chỉ  có thể khai báo và sử dụng đối tượng
 * trong enum, bên ngoài ko thể tjao ra thêm enum ới
 * --> private constructor
 */

public enum CirclePos {
	
	// 3 giá trị  của CirclePos
	// public static final CirclePos INSIDE = new CirclePos();
	INSIDE("Trên đường tròn"),
	ONSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String localizedMessage;
	
	private CirclePos(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
	public String getLocalizedMessage() {
		return localizedMessage;
	}

	
}
