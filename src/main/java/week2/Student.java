package week2;

import java.util.Objects;
import java.util.UUID;

/**
 * Student
 */

public class Student {

    private String name;
    private int grade;
    private String location;
    private final String id = UUID.randomUUID().toString();

    Student(String name,int grade, String location){
        this.name = name; 
        this.grade = grade; 
        this.location = location; 
    }

    public String getName(){
        return this.name;
    }    
    public String getLocation(){
        return this.location;
    }

    public int getgrade() {
        return this.grade;
    }

    public String getId() {
        return id;
    }

    void setName(String name){
        this.name = name;
    }

    void setLocation(String location){
        this.location = location;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\n"
        + "ID: " + this.id + "\n"
        + "grade: " + this.grade + "\n" 
        + "Ort: " + this.location + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && name.equals(student.name) && location.equals(student.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, location);
    }
}
