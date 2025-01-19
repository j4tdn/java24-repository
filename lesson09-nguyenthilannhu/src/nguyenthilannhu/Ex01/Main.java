// tên package không được viết hoa em hi
package nguyenthilannhu.Ex01;

public class Main {
	
	// 1. Em phải đi duyệt mảng students tìm A 2 lần --> lần 1 để tìm count, thừa
    //    A nhớ a chỉ cách làm tương tự rồi mà hè, a có sửa tạm như bên dưới
    
    // 2. Nếu chuyển qua tìm học sinh đặt loại C, sẽ có thể xảy ra trường hợp
    // là một bạn học loại C 2 lần, khi đó kết quả tên bạn đó sẽ bị trùng, chưa được
     public static Student[] getStudentsWithGradeA(Student[] students) {
	        int count = 0;
	        for (Student student : students) {
	            if (student.grade == 'A') {
	                count++;
	            }
	        }

	        Student[] gradeAStudents = new Student[count];
	        int index = 0;
	        for (Student student : students) {
	            if (student.grade == 'A') {
	                gradeAStudents[index++] = student;
	            }
	        }
	        return gradeAStudents;
	    }

	   
	    public static Student[] getStudentsRetaking(Student[] students) {
	    	// Hình như những cái a nói a hướng dẫn em không học thì phải
	    	// A nói là không bao giờ cho mảng fix length như này cả
	    	
	    	// Kết quả có thể tạm ra đúng nhưng cách làm kiểu hard code
	        int[] idCount = new int[1000];
	        for (Student student : students) {
	            idCount[student.id]++;
	        }

	        int retakingCount = 0;
	        for (int id : idCount) {
	            if (id > 1) {
	                retakingCount++;
	            }
	        }

	        Student[] retakingStudents = new Student[retakingCount];
	        int index = 0;
	        boolean[] added = new boolean[1000];

	        for (Student student : students) {
	            if (idCount[student.id] > 1 && !added[student.id]) {
	                retakingStudents[index++] = student;
	                added[student.id] = true;
	            }
	        }
	        return retakingStudents;
	    }

	    public static void main(String[] args) {
	        Student[] students = {
	                new Student(102, "Nam", 'C'),
	                new Student(103, "Bảo", 'F'),
	                new Student(104, "Hoàng", 'D'),
	                new Student(105, "Nguyên", 'B'),
	                new Student(107, "Vũ", 'F'),
	                new Student(109, "Lan", 'A'),
	                new Student(202, "Đạt", 'C'),
	                new Student(103, "Bảo", 'F'),
	                new Student(107, "Vũ", 'C'),
	                new Student(104, "Hoàng", 'B')
	                
	        };

	       
	        Student[] gradeAStudents = getStudentsWithGradeA(students);
	        System.out.println("Danh sách sinh viên đạt loại A:");
	        for (Student student : gradeAStudents) {
	            System.out.println(student);
	        }

	       
	        Student[] retakingStudents = getStudentsRetaking(students);
	        System.out.println("\nDanh sách sinh viên học lại:");
	        for (Student student : retakingStudents) {
	            System.out.println(student);
	        }
	    }
	
}
