package week2;
/**
 * Student
 */

public class Student {
    private String name;
    private int grade;
    private String location;

    public Student(String name, int grade, String location){
        this.name = name; 
        this.grade = grade; 
        this.location = location; 
    }

    void setGrade(int grade) {
        this.grade = grade;
    }

    int getGrade() {
        return this.grade;
    }

    void setName(String name){
        this.name = name;
    }

    void setLocation(String location){
        this.location = location;
    }

    String getName(){
        return this.name;
    }    
    String getLocation(){
        return this.location;
    }


}
