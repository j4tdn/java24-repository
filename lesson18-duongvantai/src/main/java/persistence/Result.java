package persistence;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "T03_RESULT")
@IdClass(ResultId.class)
public class Result {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C03_STUDENT_ID")
    private Student student;

    @Id
    @Column(name = "C03_SUBJECT")
    private String subject;

    @Column(name = "C03_SCORE")
    private BigDecimal score;

	public Result(Student student, String subject, BigDecimal score) {
		super();
		this.student = student;
		this.subject = subject;
		this.score = score;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Result [student=" + student + ", subject=" + subject + ", score=" + score + "]";
	}

   
}