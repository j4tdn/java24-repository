package bean;

public class Student {
	// kí tự đầu tiên của biến em nên viết thường hi
    private int Id;
    private String FullName;
    
    // char cũng được
    // nhưng em nên dùng Enum sẽ hay hơn nha
    
    // char ví dụ như em chỗ thì dùng xếp loại A, a bị xung đột trong khi nó chỉ là 1 loại học
    // lực 'A'
    // Trong khi enum nó fix theo tên biến, giá trị của Enum ko bị vấn đề đó
    private char Grade;

    public Student(int Id, String FullName, char grade) {
        this.Id = Id;
        this.FullName = FullName;
        this.Grade = grade;
    }

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public char getGrade() {
		return Grade;
	}
	public void setGrade(char grade) {
		Grade = grade;
	}
	@Override
    public String toString() {
        return "Student{" +
                "id=" + Id +
                ", name='" + FullName + '\'' +
                ", grade=" + Grade +
                '}';
    }
}