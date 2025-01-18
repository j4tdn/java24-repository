
package view;

import bean.Student;
import static bean.Grade.*;

import java.util.Arrays;

public class Ex01 {
    
    public static void main(String[] args) {
        Student[] students = {
    		new Student(102, "Nam", C),
    		new Student(103, "Bảo", F),
    		new Student(104, "Hoàng", D),
    		new Student(105, "Nguyên", B),
    		new Student(107, "Vũ", F),
    		new Student(109, "Lan", A),
    		new Student(202, "Đạt", C),
    		new Student(103, "Bảo", F),
    		new Student(107, "Vũ", C),
    		new Student(104, "Hoàng", B)
        };
        
        
        Student[] gradeStudents = findGradeAStudents(students);
        System.out.println("--> Danh sách sinh viên đạt loại A");
        for(Student student : gradeStudents){
            System.out.println(student);
        }
        
        
        Student[] repeatStudents = findRepeatStudents(students);
        
        
        System.out.println("--> Danh sách sinh viên đã học lại ");
        for(Student student : repeatStudents){
            System.out.println(student);
        }
    
    }
    
    // Có 2 vấn đề

    // 1. Em phải đi duyệt mảng students tìm A 2 lần --> lần 1 để tìm count, thừa
    //    A nhớ a chỉ cách làm tương tự rồi mà hè, a có sửa tạm như bên dưới
    
    // 2. Nếu chuyển qua tìm học sinh đặt loại C, sẽ có thể xảy ra trường hợp
    // là một bạn học loại C 2 lần, khi đó kết quả tên bạn đó sẽ bị trùng, chưa được
    private static Student[] findGradeAStudents(Student[] students){
    	Student[] result = new Student[students.length];
        int count =0;
        for(Student student : students){
            if(student.getGrade() == A){
            	result[count++] = student;
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }
    
    // Lỗi tương tự, và em cũng làm sai yêu cầu
    // Đề yêu cầu tìm học sinh học lại có nghĩa là xuất hiện 2 lần trở lên trong danh sách
    // chứ k phải tìm học sinh có học lực F
    private static Student[] findRepeatStudents(Student[] students){
        int count = 0;
        for(Student student : students){
            if(student.getGrade() == F){
                count++;
            } 
        }
        Student[] repeatStudents = new Student[count];
        int index = 0;
        for(Student student : students){
            if(student.getGrade() == F){
            	repeatStudents[index++] = student;
            }
            
        }
        return repeatStudents;
    }
    

}
    
    
