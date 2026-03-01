package dao;

import dao.base.GenericDao;
import dto.ClassStatisticDto;
import persistence.Student;

import java.util.List;

public class HibernateStudentDao extends GenericDao implements StudentDao {
    private static final String Q_GET_ALL_BY_CLASS_ID = ""
            + "SELECT id, name, gender "
            + "FROM student "
            + "WHERE class_id = :class_id";

    private static final String Q_COUNT_GOOD_STUDENT_BY_CLASS = ""
            + "SELECT new dto.ClassStatisticDto(c.name, COUNT(DISTINCT s.id)) "
            + "FROM Student s "
            + "JOIN s.classMapping c "
            + "JOIN s.results r "
            + "WHERE (r.subject = 'Math' AND r.score >= 8) "
            + "OR (r.subject = 'Literature' AND r.score >= 8) "
            + "GROUP BY c.name, s.id "
            + "HAVING COUNT(DISTINCT r.subject) = 2";

    private static final String Q_FIND_GOOD_STUDENT = ""
            + "SELECT s "
            + "FROM Student s "
            + "JOIN s.results r "
            + "GROUP BY s.id "
            + "HAVING AVG(r.score) >= 8.2";

    private static final String Q_TOP_STUDENT_BY_CLASS = ""
            + "SELECT s "
            + "FROM Student s "
            + "JOIN s.results r "
            + "GROUP BY s "
            + "HAVING NOT EXISTS ( "
            + "    SELECT 1 "
            + "    FROM Student s2 "
            + "    JOIN s2.results r2 "
            + "    WHERE s2.classMapping = s.classMapping "
            + "    GROUP BY s2 "
            + "    HAVING AVG(r2.score) > AVG(r.score) "
            + ")";


    @Override
    public List<Student> getStudentByClass(Integer id) {
        return openSession()
                .createNativeQuery(Q_GET_ALL_BY_CLASS_ID, Student.class)
                .setParameter("class_id", id)
                .getResultList();
    }

    @Override
    public List<ClassStatisticDto> getClassStatistic() {
        return openSession()
                .createQuery(Q_COUNT_GOOD_STUDENT_BY_CLASS, ClassStatisticDto.class)
                .getResultList();
    }

    @Override
    public List<Student> findGoodStudent() {
        return openSession()
                .createQuery(Q_FIND_GOOD_STUDENT, Student.class)
                .getResultList();
    }

    @Override
    public List<Student> findTopStudent() {
        return openSession()
                .createQuery(Q_TOP_STUDENT_BY_CLASS, Student.class)
                .getResultList();
    }
}
