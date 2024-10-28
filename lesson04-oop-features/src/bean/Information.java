package bean;

public class Information {

	private String name;
	private String date;
	private Double salary;
	private int rangeTitle;
	private String roomName;
	
	
	public Information() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getRangeTitle() {
		return rangeTitle;
	}

	public void setRangeTitle(int rangeTitle) {
		this.rangeTitle = rangeTitle;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "Information [name=" + name + ", date=" + date + ", salary=" + salary + ", rangeTitle=" + rangeTitle
				+ ", roomName=" + roomName + "]";
	}
	
}
