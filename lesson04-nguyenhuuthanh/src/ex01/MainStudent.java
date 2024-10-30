package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    //public ArrayList<Student> students= new ArrayList<>();
	public Student[] students = new Student[3];
	int studentCount =0;

    public void addStudent(Student student) {
    	if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Mảng đầy");
        }
    	
    	
    }
    public Student ipStudent() {
    	Scanner sc = new Scanner(System.in);
    	Student student = new Student();
    	System.out.print("Nhập mã sinh viên:");
    	student.setStudentId(sc.nextInt());
    	sc.nextLine();
    	System.out.print("Nhập tên sinh viên:");
    	student.setName(sc.nextLine());
    	System.out.print("Nhập điểm lý thuyết:");
    	student.setTheoryPoint(sc.nextDouble());
    	System.out.print("Nhập điểm thực hành:");
    	student.setPracticePoint(sc.nextDouble());
    	return student;
    }

    public void displayAllStudents() {
        System.out.println("Danh sách sinh viên :");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void findStudentsWithHighAverage() {
        System.out.println("\nDanh sách sinh viên có điểm trung bình lớn hơn 8.5 :");
        for (Student student : students) {
            if (student.averagePoint() > 8.5) {
                System.out.println(student);
            }
        }
    }

    public void findStudentsWithHigherTheoryPoint() {
        System.out.println("\nDS sinh viên có điểm lý thuyết > điểm thực hành :");
        for (Student student : students) {
            if (student.getTheoryPoint() > student.getPracticePoint()) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        MainStudent x = new MainStudent();

       
        Student sv1 = new Student(1, "Nguyen Van A", 9.0d, 8.5d);
        x.addStudent(sv1);
        Student sv2 = new Student(2, "Nguyen Van B", 8.0d, 7.5d);
        x.addStudent(sv2);
        System.out.println("Nhập thông tin");
        Student newStudent = x.ipStudent();
        x.addStudent(newStudent);
        x.displayAllStudents();
        x.findStudentsWithHighAverage();
        x.findStudentsWithHigherTheoryPoint();
        
    }
}
