package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Player {
	
	private String fullname;
	private boolean gender;
	private String address;
	private String[] hobbies;
	private LocalDate dateOfBirth;
	
	public Player() {
	}

	public Player(String fullname, boolean gender, String address, String[] hobbies, LocalDate dateOfBirth) {
		this.fullname = fullname;
		this.gender = gender;
		this.address = address;
		this.hobbies = hobbies;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Player [fullname=" + fullname + ", gender=" + gender + ", address=" + address + ", hobbies="
				+ Arrays.toString(hobbies) + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
