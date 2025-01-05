
package view;

import bean.Student;
import static bean.Grade.*;

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
    
    private static Student[] findGradeAStudents(Student[] students){
        int count =0;
        for(Student student : students){
            if(student.getGrade() == A){
                count++;
            }
        }
        Student[] gradeAStudents = new Student[count];
        int index = 0;
        for(Student student : students){
            if(student.getGrade() == A){
                gradeAStudents[index++] = student;
            }
        }
        return gradeAStudents;
    }
    
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
    
    
