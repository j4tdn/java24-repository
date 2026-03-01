package service;

import dto.ClassStatisticDto;
import persistence.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentByClass(Integer id);

    List<ClassStatisticDto> getClassStatistic();

    List<Student> findGoodStudent();

    List<Student> findTopStudent();
}
