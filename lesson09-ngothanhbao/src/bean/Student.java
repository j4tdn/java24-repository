package bean;

public class Student {
	private int id;
	private String name;
	
	// Character là KDL đối tượng của KDL char
	// Trong bài này em nên dùng Enum để lưu sẽ hay hơn hi
	// Tạo enum ví dụ Level, Rank ...
	private Character rank;
	
	public Student() {
	}

	public Student(int id, String name, Character rank) {
		super();
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

	public Character getRank() {
		return rank;
	}

	public void setRank(Character rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
}
