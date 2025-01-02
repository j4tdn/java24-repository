package enumeration;

public enum CirclePos {
	INSIDE ("Trên đường tròn"), OUTSIDE("Ngoài đường tròn"), ONSIDE("trong đường tròn");
	
	private String localizedMessage;
	
	private CirclePos(String localizedMessage) {
		this.localizedMessage = localizedMessage;
		
	}
	
	public String getLocalizedMessage() {
		return localizedMessage;
	}
}
