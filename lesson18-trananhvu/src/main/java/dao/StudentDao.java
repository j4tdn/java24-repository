package dao;

import dto.ClassStatisticDto;
import persistence.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudentByClass(Integer id);

    List<ClassStatisticDto>  getClassStatistic();

    List<Student> findGoodStudent();

    List<Student> findTopStudent();
}
