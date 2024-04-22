package org.example.oop_questions;
// q no 6incapsulation and inheritance
public class Perosn {
    private String name;
    private int age;

    public Perosn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Employee extends Perosn{
    private String designation;
    private String employeeId;

    public Employee(String name, int age, String designation, String employeeId) {
        super(name, age);
        this.designation = designation;
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public static void main(String[] args) {
//        just call from here
    }
}
