package bean;

public class StudentCounter {
	private Student student;
	private int amount;

	
	public static StudentCounter of(Student student, int count) {
		return new StudentCounter();
	}
	
	public StudentCounter() {
	}
	
	private StudentCounter(Student student, int amount) {
		this.student = student;
		this.amount = amount;
	}
	public Student getStudent() {
		return student;
	}
	public int getAmount() {
		return amount;
	}
	//sc.plus();
	public void plus() {
		amount++;
	}
	@Override
	public String toString() {
		return "StudentCounter(" + student.getId() + ", "+ amount +")";
	}
	
	
}
