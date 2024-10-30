package exercise;
import java.util.Scanner;
import bean.Student;
public class Ex01Student {
	private static Student[] student;
	public static void main(String[] args) {
		Scanner sv = new Scanner(System.in);
		
		Student sv1 = new Student(1,"Phước",9d,10d);
		Student sv2 = new Student(2,"Thắng",2d,3d);
		Student sv3 = new Student();
		System.out.println("Enter id: ");
		sv3.setIdStudent(Integer.parseInt(sv.nextLine()));
		System.out.println("Enter name: ");
		sv3.setName(sv.nextLine());
		System.out.println("Enter theory point: ");
		sv3.setPointTheory(Double.valueOf(sv.nextLine()));
		System.out.println("Enter practical point: ");
		sv3.setPointPractical(Double.valueOf(sv.nextLine()));
		
		student = new Student[]{sv1,sv2,sv3};
		averageScore();
		theoryIsgreaterThanPractice();
	}
	public static void averageScore() {
		System.out.println("Total students have scores in the average greater than 8.5:");
		for (Student student: student) {
			if (student.Average() > 8.5) {
				System.out.println(student.toString());
			}
					
		}
	}
	public static void theoryIsgreaterThanPractice() {
		System.out.println("<====================================================================================>");
		System.out.println("The total number of students with theory scores is greater than practice scores:");
		for (Student student: student) {
			if (student.Average() > student.getPointPractical()) {
				System.out.println(student.toString());
			}
		}
	}
	

}
