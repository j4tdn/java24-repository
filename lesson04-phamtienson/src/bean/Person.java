package bean;

import java.util.Date;

public abstract class Person {
    protected String fullName;
    protected Date dateOfBirth;
    protected double salaryCoefficient;
    
    public Person(String fullName, Date dateOfBirth, double salaryCoefficient) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.salaryCoefficient = salaryCoefficient;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public abstract double calculateSalary();
    public abstract void displayInfo();
}