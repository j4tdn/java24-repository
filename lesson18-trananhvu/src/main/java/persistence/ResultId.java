package persistence;

import java.io.Serializable;
import java.util.Objects;

public class ResultId implements Serializable {

    private int student;
    private String subject;

    public ResultId() {}

    public ResultId(int student, String subject) {
        this.student = student;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultId)) return false;
        ResultId that = (ResultId) o;
        return student == that.student &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject);
    }
}