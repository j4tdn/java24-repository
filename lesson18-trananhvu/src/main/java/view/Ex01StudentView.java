package view;

import connection.DbConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import service.StudentService;
import service.StudentServiceImpl;

public class Ex01StudentView {
    private static final StudentService studentService;

    static {
        studentService = new StudentServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println(studentService.getStudentByClass(1));

        System.out.println(studentService.getClassStatistic());

        System.out.println(studentService.findGoodStudent());

        System.out.println(studentService.findTopStudent());

    }
}
