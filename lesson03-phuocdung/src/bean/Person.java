package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
	
	private String name;
	private String gender;
	private String address;
	private String[] interest;
	private LocalDate birthday;
	
	public Person() {
		
	}

	public Person(String name, String gender, String address, String[] interest, LocalDate birthday) {
	
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.interest = interest;
		this.birthday = birthday;
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

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", interest="
				+ Arrays.toString(interest) + ", birthday=" + birthday + "]";
	}
	
	
	
	
	

}
