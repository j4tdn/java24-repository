package bean;

import java.time.LocalDate;

public class Human {
	private String name;
	private String gender;
	private String address;
	private String[] hobby;
	private LocalDate dob;
	
	public Human() {
	}

	public Human(String name, String gender, String address, String[] hobby, LocalDate dob) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.hobby = hobby;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getHobby(/*String[] hobby*/) {
		/*
		 * for (String hob: hobby) { System.out.println(hob); }
		 */
		return hobby;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", address=" + address + ", dayOfBirth="
				+ dob + "]";
	}
}
