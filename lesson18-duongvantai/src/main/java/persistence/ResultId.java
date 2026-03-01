package persistence;

import java.io.Serializable;
import java.util.Objects;

public class ResultId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer student;  
    private String subject;

    public ResultId() {}

    public ResultId(Integer student, String subject) {
		super();
		this.student = student;
		this.subject = subject;
	}

	public Integer getStudent() {
		return student;
	}

	public void setStudent(Integer student) {
		this.student = student;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultId)) return false;
        ResultId that = (ResultId) o;
        return Objects.equals(student, that.student) &&
               Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject);
    }
}
