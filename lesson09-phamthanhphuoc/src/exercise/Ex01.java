package exercise;

import bean.Student;

public class Ex01 {
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

        System.out.println("Danh sách sinh viên đạt loại A:");
        findGradeAStudents(students);

    }

    // Kết quả tạm đúng
    // Nhưng nếu a chuyển qua tìm học sinh đặt loại C, sẽ có thể xảy ra trường hợp
    // là một bạn học loại C 2 lần, khi đó kết quả tên bạn đó sẽ bị trùng, chưa được
    public static void findGradeAStudents(Student[] students) {
        for (Student student : students) {
            if (student.getGrade() == 'A') {
                System.out.println(student);
            }
        }
    }

    
}
