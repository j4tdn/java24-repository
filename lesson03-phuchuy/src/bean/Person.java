package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {

	private String name;
	private String gender;
	private String address;
	private String[] hooby;
	private LocalDate birth;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, String address, String[] hooby, LocalDate birth) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.hooby = hooby;
		this.birth = birth;
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

	public String[] getHooby() {
		return hooby;
	}

	public void setHooby(String[] hooby) {
		this.hooby = hooby;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", hooby="
				+ Arrays.toString(hooby) + ", birth=" + birth + "]";
	}

}
