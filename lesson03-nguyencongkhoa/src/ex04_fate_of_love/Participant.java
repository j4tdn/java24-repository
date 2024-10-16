package ex04_fate_of_love;

import java.time.LocalDate;
import java.util.Arrays;

public class Participant {

	private String fullName;
	private String gender;
	private String address;
	private String[] hobbyList;
	private LocalDate birthDay;
	
	public Participant() {
	}

	public Participant(String fullName, String gender, String address, String[] hobbyList, LocalDate birthDay) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.address = address;
		this.hobbyList = hobbyList;
		this.birthDay = birthDay;
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

	public String[] getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(String[] hobbyList) {
		this.hobbyList = hobbyList;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "Participant [fullName=" + fullName + ", gender=" + gender + ", address=" + address + ", hobbyList="
				+ Arrays.toString(hobbyList) + ", birthDay=" + birthDay + "]";
	}
	
	public boolean compareAge(LocalDate other) {
		if (Math.abs(this.getBirthDay().getYear() - other.getYear()) < 8) {
			return true;
		}
		return false;
	}
	
	public String[] sameHobby(Participant other) {
		String[] listSameHB = new String [] {};
		int cnt = 0;
		for (String hobby : hobbyList) {
			for (String otherHB : other.hobbyList) {
				if (hobby.equalsIgnoreCase(otherHB)) {
					listSameHB[cnt++] = hobby;
				}
			}
		}
		return listSameHB;
	}
	
	public boolean checkConditions(Participant other) {
		if (this.gender.equalsIgnoreCase(other.gender)) {
			return false;
		} 
		
		if (this.hobbyList.length < 4 || other.hobbyList.length < 4) {
			return false;
		} else if (this.hobbyList.length >= 4 && other.hobbyList.length >= 4) {
			int cnt = 0;
			for (String hobby : hobbyList) {
				for (String otherHB : other.hobbyList) {
					if (hobby.equalsIgnoreCase(otherHB)) {
						cnt++;
					}
				}
			}
			if (cnt  < 4) {
				return false;
			}
		}
		
		if (!compareAge(other.birthDay)) {
			return false;
		}
		return true;
	}
	
}
