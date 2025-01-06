package view;

import bean.Student;

import java.util.Arrays;

public class Ex01 {

    private static Student[] findGoodStudents(Student[] students) {
        Student[] goodStudents = new Student[students.length];
        int count = 0;
        for(Student student : students) {
            if(student.getRank().equals("A")){
                goodStudents[count++] = student;
            }
        }
        return Arrays.copyOfRange(goodStudents, 0, count);
    }

    private static Student[] findBadStudents(Student[] students) {
        Student[] badStudents = new Student[students.length];
        int count = 0;
        for(Student student : students) {
            if(student.getRank().equals("F")){
                badStudents[count++] = student;
            }
        }
        return Arrays.copyOfRange(badStudents, 0, count);
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(102, "Nam", "C"),
                new Student(103, "Bảo", "F"),
                new Student(104, "Hoàng", "D"),
                new Student(105, "Nguyên", "B"),
                new Student(107, "Vũ", "F"),
                new Student(109, "Lan", "A"),
                new Student(202, "Đạt", "C"),
                new Student(103, "Bảo", "F"),
                new Student(107, "Vũ", "C"),
                new Student(104, "Hoàng", "B")
        };

        System.out.println("Sinh vien tot: ");
        Student[] goodStudents = findGoodStudents(students);
        for(Student s : goodStudents) {
            System.out.println(s.toString());
        }

        System.out.println("Sinh vien hoc lai ctdl&gt: ");

        Student[] badStudents = findBadStudents(students);
        for(Student s : badStudents) {
            System.out.println(s.toString());
        }
    }

}
