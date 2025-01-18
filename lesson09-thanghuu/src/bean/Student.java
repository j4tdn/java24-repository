package bean;

public class Student {

	// Lưu ý tên biến, chữ cái đầu tiên phải viết thường em nghen
	public Integer MSV; // Hmm, ai cho đặt tên biến tiếng việt ri :(
	public String Name;
	
	// Em nên tạo 1 enum tên là Rank thì sẽ hay hơn hi
	// A nhớ từng hướng dẫn Enum rồi
	public String Rank;
	
	public Student() {
	}

	// Những phần thừa a xóa cố gắng để ý
	public Student(Integer mSV, String name, String rank) {
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
