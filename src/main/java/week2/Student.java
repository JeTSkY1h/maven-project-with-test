package week2;
/**
 * Student
 */

public class Student {
    private String name;
    private int grade;
    private String location;

    Student(String name, int grade, String location){
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

    public int getGrade() {
        return this.grade;
    }

    void setGrade(int grade) {
        this.grade = grade;
    }

    void setName(String name){
        this.name = name;
    }

    void setLocation(String location){
        this.location = location;
    }

    public String toString(){
        return "Name: " + this.name + "\n"
        + "Note: " + this.grade + "\n" 
        + "Ort: " + this.location;
    }

}
