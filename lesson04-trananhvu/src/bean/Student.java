package bean;

public class Student {
	private int id;
	private String name;
	private float theoScore;
	private float pracScore;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float theoScore, float pracScore) {
		this.id = id;
		this.name = name;
		this.theoScore = theoScore;
		this.pracScore = pracScore;
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

	public float getTheoScore() {
		return theoScore;
	}

	public void setTheoScore(float theoScore) {
		this.theoScore = theoScore;
	}

	public float getPracScore() {
		return pracScore;
	}

	public void setPracScore(float pracScore) {
		this.pracScore = pracScore;
	}

	public float getAverageScore() {
		return (pracScore + theoScore) / 2;
	}

	@Override
	public String toString() {
		return "==> Student [id=" + id + ", name=" + name + ", theoPoint=" + theoScore + ", pracPoint=" + pracScore
				+ ", averageScore=" + getAverageScore() + "]";
	}

}
