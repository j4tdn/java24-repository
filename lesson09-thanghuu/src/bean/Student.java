package bean;

public class Student {

	public Integer MSV;
	public String Name;
	public String Rank;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer mSV, String name, String rank) {
		super();
		MSV = mSV;
		Name = name;
		Rank = rank;
	}

	public Integer getMSV() {
		return MSV;
	}

	public void setMSV(Integer mSV) {
		MSV = mSV;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	@Override
	public String toString() {
		return "Student [MSV=" + MSV + ", Name=" + Name + ", Rank=" + Rank + "]";
	}
	
	
	
}
