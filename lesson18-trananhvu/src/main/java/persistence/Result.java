package persistence;

import jakarta.persistence.*;

@Entity
@IdClass(ResultId.class)
@Table(name = "Result")
public class Result {

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Id
    private String subject;

    private Float score;

    public Result() {}

    public Result(Student student, String subject, Float score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public Float getScore() {
        return score;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}