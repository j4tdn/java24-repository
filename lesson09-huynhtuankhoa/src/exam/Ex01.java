package exam;
import static exam.Rank.*;

import java.util.Arrays;
public class Ex01 {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student(102, "Nam", C);
		students[1] = new Student(103, "Bao", D);
		students[2] = new Student(104, "Hoang", A);
		students[3] = new Student(105, "Nguyen", B);
		students[4] = new Student(107, "Vu", D);
		students[5] = new Student(109, "Lan", A);
		students[6] = new Student(202, "Dat", F);
		students[7] = new Student(103, "Bao", C);
		students[8] = new Student(107, "Vu", F);
		students[9] = new Student(104, "Hoang", B);
		
		getStudentRankA(students);
		System.out.println(Arrays.toString(getStudentLearnMore1Times(students)));
		
	}
	
	// Em làm thế này hiện tại kết quả đúng
	// Nhưng tổng quát ví dụ yêu cầu thay đổi hỏi tìm các học sinh xếp loại khác như D chẳng hạn
	// thì kết quả trả về có thể bị trùng
	// VD: Bạn Nam học môn này 2 lần và cả 2 lần đều bị D
	
	// Khai báo hàm nên là getStudents(Student[] students, Rank rank)
	public static void getStudentRankA(Student[] students) {
		for (Student student: students) {
			if (student.getRank().equals(Rank.A)) {
				System.out.println(student.toString());
			}
		}
	}
	
	// Em để ý các phần khai báo tên hàm hi
	public static Student[] getStudentLearnMore1Times(Student[] students) {
		Student[] studentF = new Student[5];
		int count = 0;
		
		// Kết quả tạm ra đúng nhưng cách làm chưa hay
		// A sẽ sửa tại lớp hi
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					studentF[count++] = students[i];
				}
			}
		}
		// Em có thể dùng hàm Arrays.copyOfRange(studentF, 0, count);
		Student[] finalStudentF = new Student[count];
		for (int i = 0; i < count; i++) {
			finalStudentF[i] = studentF[i]; 
		}
		return finalStudentF;
	}
}

class Student {
	private int id;
	private String name;
	private Rank rank;
	
	public Student(int id, String name, Rank rank) {
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

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
}
enum Rank {
	A, B, C, D, F
}
