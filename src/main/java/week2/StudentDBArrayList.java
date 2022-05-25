package week2;

import java.util.ArrayList;

import week2.inheritance.Student;

public  class StudentDBArrayList {
    private ArrayList<Student> students;
    
    
    StudentDBArrayList( ArrayList<Student> students){
        this.students = students;
    }

    ArrayList<Student> list(){
        return students;
    }

    public String toString(){
        String res = "";
        for (Student student : students) {
            res += student.toString() + "\n";
        }
        return res;

    }

    public Student randomStudent(){
        int rNum = (int)Math.random()*students.size();
        return students.get(rNum);
    }

    public void addToDb(Student newStudent){
        students.add(newStudent);
    }

    public int getIndexByName(String name){
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void removeByIndex(int index){
        students.remove(index);
    }

        


    public void removeByName(String studentName) {
        students.remove(getIndexByName(studentName));
    }
}
