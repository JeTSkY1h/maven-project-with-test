package week2.StudentDB;
import java.util.*;
import week2.StudentDB.inheritance.*;

public class StudentDBHashMap {
    private Map<String, Student> students = new HashMap<String, Student>();
    
    
    public StudentDBHashMap( Map<String, Student> students){
        this.students = students;
    }

    Map<String, Student> list(){
        return students;
    }

    public String toString(){
        String res = "";
        for (Map.Entry<String, Student> student : students.entrySet()) {
            res += student.getValue().toString() + "\n";
        }
        return res;
    }


    public Student randomStudent(){
        int rNum = (int)Math.random()*students.size();
        return students.get(rNum);
    }

    public void addToDb(Student newStudent){
        if(students.containsKey(newStudent.getId())){
            throw new RuntimeException("Student existiert Bereits.");
        }
        students.put(newStudent.getId(),newStudent);
    }

    public String getUUIDByName(String name){
        for (Map.Entry<String, Student> student : students.entrySet()) {
            
            if (student.getValue().getName().equals(name)){
                return student.getValue().getId();
            }
        }
        return "";
    }

    public void removeByUID(String id){
        students.remove(id);
    }

        
    public void removeByName(String studentName) {
        students.remove(getUUIDByName(studentName));
    }   
}