package week2.Interface;

import java.util.UUID;

public class EDVStudent implements Student {

    private String name;
    private int grade;
    private String location;
    private final String id = UUID.randomUUID().toString();
    private String subject = "EDV";

    public EDVStudent(String name,int grade, String location){
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
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getSubject() {
        return this.subject;
    }


    @Override
    public String toString(){
        return "Name: " + this.name + "\n"
        + "ID: " + this.id + "\n"
        + "grade: " + this.grade + "\n" 
        + "Ort: " + this.location + "\n";
    }
}
