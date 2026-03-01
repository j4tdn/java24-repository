package service;

import dao.HibernateStudentDao;
import dao.StudentDao;
import dto.ClassStatisticDto;
import persistence.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl() {
        studentDao = new HibernateStudentDao();
    }

    @Override
    public List<Student> getStudentByClass(Integer id) {
        return studentDao.getStudentByClass(id);
    }

    @Override
    public List<ClassStatisticDto> getClassStatistic() {
        return studentDao.getClassStatistic();
    }

    @Override
    public List<Student> findGoodStudent() {
        return studentDao.findGoodStudent();
    }

    @Override
    public List<Student> findTopStudent() {
        return studentDao.findTopStudent();
    }
}
