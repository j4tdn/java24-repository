package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
	private String name;
	private String gender;
	private String address;
	private String[] hobby;
	private LocalDate localDate;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, String address, String[] hobby, LocalDate localDate) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.hobby = hobby;
		this.localDate = localDate;
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

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public LocalDate getDateTime() {
		return localDate;
	}

	public void setDateTime(LocalDate localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", hobby="
				+ Arrays.toString(hobby) + ", dateTime=" + localDate + "]";
	}

}
