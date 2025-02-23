//package view;
//
//import java.util.Arrays;
//
//import bean.Student;
//import common.Rank;
//import model.DataModel;
//
//public class Ex01 {
//	
//	public static void main(String[] args) {
//		Student[] students = DataModel.mockStudents();
//		
//		Student[] output = getStudents(students, Rank.A); 
//		
//		generate(null, students);
//		
//		
//
//	}
//	private static void generate(String prefix, Student[] students) {
//		System.err.println(prefix + " {");
//		for (Student student : students) {
//			System.out.println("   - " + student);
//		}
//		System.out.println("}\n");
//	}
//	
//	private static Student[] getStudents(Student[] students, Rank rank) {
//		Student[] result = new Student[students.length];
//		int count = 0;
//		for (Student student : students) {
//			if (student.getRank() == rank && !isExist(result, student, count)) {
//				result[count++] = student;
//			}
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//}
