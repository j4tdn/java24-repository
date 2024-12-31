package enumeration;

public enum CirclePos {
	INSIDE ("Trên Đường tròn") ,
	ONSIDE ("Trong đường tròn"),
	OUTSIDE ("Ngoài đường tròn");
	private String localizedMessage;
	private CirclePos(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
	public String getLocalizedMessage() {
		return localizedMessage;
	}
}
