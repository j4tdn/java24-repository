package enumeration;

// CirclePos: Là 1 enum --> 1 KDL

// 1 Class: Tạo N đối tượng

public enum CirclePos {
	
	// 3 giá trị của CirclePos
	
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	
	private String localizedMessage;
	
	CirclePos(String localizedMesString){
		this.localizedMessage = localizedMessage;
	}
	
	public String getLocalizedMessage() {
		return localizedMessage;
	}
}
