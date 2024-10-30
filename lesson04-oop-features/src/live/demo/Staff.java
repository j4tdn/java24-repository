package live.demo;

import java.text.DateFormat;

public class Staff extends ChairMan{
	private String name;
	private DateFormat dayOfBirth;
	private Double salaryPercentage;
	private String roomName;
	private String roomLeader;
	
	public Staff() {
		
	}

	public Staff(String name, DateFormat dayOfBirth, Double salaryPercentage, String roomName, String roomLeader) {
		super(name,dayOfBirth,salaryPercentage, null);
		this.roomName = roomName;
		this.roomLeader = roomLeader;
	}

	public String getRoomName() {
		return roomName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateFormat getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(DateFormat dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public Double getSalaryPercentage() {
		return salaryPercentage;
	}

	public void setSalaryPercentage(Double salaryPercentage) {
		this.salaryPercentage = salaryPercentage;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomLeader() {
		return roomLeader;
	}

	public void setRoomLeader(String roomLeader) {
		this.roomLeader = roomLeader;
	}

	@Override
	public String toString() {
		return "Staff [roomName=" + roomName + ", roomLeader=" + roomLeader + "]";
	}

	
	
}
