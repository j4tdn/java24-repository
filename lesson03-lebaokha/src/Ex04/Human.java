package Ex04;

import java.time.LocalDate;

public class Human {

	private String fullName;
	private String gender;
	private String address;
	private String[] hobbies;
	private LocalDate dateOfBirth;

	public Human() {

	}

	public Human(String fullName, String gender, String address, String[] hobbies, LocalDate dateOfBirth) {
		this.fullName = fullName;
		this.gender = gender;
		this.address = address;
		this.hobbies = hobbies;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		return "Họ và tên: " + fullName + "\nGiới tính: " + gender + "\nĐịa chỉ: " + address + "\nSở thích: "
				+ String.join(", ", hobbies) + "\nNgày sinh: " + dateOfBirth + "\n";
	}

}
