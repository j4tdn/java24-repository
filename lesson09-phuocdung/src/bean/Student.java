package bean;

public class Student {

	private int id;
	private String name;
	
	// String cũng được, nhưng em nên tạo enum ví dụ tên là Rank sẽ hay hơn, tránh gặp
	// các vấn đề liên quan đến chuỗi thường hoa ...
	// public enum Rank {}
	//     A, B, C, D, F
	// }
	private String rank;

	public Student() {
	}

	public Student(int id, String name, String rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

}
