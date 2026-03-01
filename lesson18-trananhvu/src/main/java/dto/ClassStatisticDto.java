package dto;

public class ClassStatisticDto {
    private String className;
    private Long totalStudents;

    public ClassStatisticDto() {
    }

    public ClassStatisticDto(String className, Long totalStudents) {
        this.className = className;
        this.totalStudents = totalStudents;
    }

    public Long getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(Long totalStudents) {
        this.totalStudents = totalStudents;
    }

    @Override
    public String toString() {
        return "ClassStatistic{" +
                "className='" + className + '\'' +
                ", totalStudents=" + totalStudents +
                '}';
    }
}
