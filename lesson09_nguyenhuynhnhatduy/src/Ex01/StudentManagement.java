package Ex01;

public class StudentManagement {
  public static void main(String[] args) {
	Student[] students = {
			new Student(102, "Nam", Grade.C),
			new Student(103, "Bảo", Grade.F),
			new Student(104, "Hoàng", Grade.D),
			new Student(105, "Nguyên", Grade.B),
			new Student(107, "Vũ", Grade.F),
			new Student(109, "Lan", Grade.A),
			new Student(202, "Đạt", Grade.C),
			new Student(103, "Bảo", Grade.F),
			new Student(107, "Vũ", Grade.C),
			new Student(104, "Hoàng", Grade.B)	
	};
	
	Student[] studentGradeA = getStudents(students, Grade.A);
	System.out.println("Sinh vien dat loai A");
	for(Student student: studentGradeA) {
		System.out.println(student);
	}
	
	Student[] studentGradeF = getStudents(students, Grade.F);
	System.out.println("Sinh vien dat loai F");
	for(Student student: studentGradeF) {
		System.out.println(student);
	}
}
  
  public static Student[] getStudents(Student[] students, Grade grade) {
	   int count =0;
	    for (int i = 0; i < students.length; i++) {
	        if (students[i].getGradeStudent() == grade) {
	            count++;
	        }
	    }

	   
	    Student[] result = new Student[count];
	    int index = 0;
	    for (int i = 0; i < students.length; i++) {
	        if (students[i].getGradeStudent() == grade) {
	            result[index++] = students[i];
	        }
	    }

	    return result;
	}
}
