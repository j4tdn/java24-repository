package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
	private String name;
	private String gender;
	private String location;
	private String[] hobby;
	private LocalDate dateOfBirth;

	public Person() {
	}

	public Person(String name, String gender, String location, String[] hobby, LocalDate date) {
		this.name = name;
		this.gender = gender;
		this.location = location;
		this.hobby = hobby;
		this.dateOfBirth = date;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "name: " + name + ", gender: " + gender + ", location: " + location + ", hobby: "
				+ Arrays.toString(hobby) + ", date: " + dateOfBirth ;
	}
}
