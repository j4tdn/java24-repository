package bean;

public class Student {
	private int id;
	private String name;
	private String ranking;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String ranking) {
		this.id = id;
		this.name = name;
		this.ranking = ranking;
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

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ranking=" + ranking + "]";
	}
	
	

}
