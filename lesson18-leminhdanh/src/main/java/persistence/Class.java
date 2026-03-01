package persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "T01_CLASS")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_CLASS_ID")
    private int id;

    @Column(name = "C01_CLASS_NAME")
    private String name;

    @Column(name = "C01_TEACHER")
    private String teacher;

    @OneToMany(mappedBy = "classMapping")
    private List<Student> students;


    public Class() {
    }

    public Class(int id, String name, String teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}