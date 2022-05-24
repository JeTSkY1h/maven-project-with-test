package week2;

import java.util.Arrays;

import week2.inheritance.Student;

public  class StudentDB {
    private Student[] studArr;
    
    
    StudentDB(Student[] studArr){
        this.studArr = studArr;
    }

    Student[] list(){
        return studArr;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < studArr.length; i++) {
            res += studArr[i].toString() + "\n";
        }
        return res;
    }

    public Student randomStudent(){
        int rNum = (int)Math.random()*studArr.length;
        return studArr[rNum];
    }

    public void add(Student newStudent){
        Student[] newArr = Arrays.copyOf(studArr, studArr.length + 1);
        newArr[newArr.length-1] = newStudent;
        this.studArr = newArr;
    }

    public void removeByIndex(int index){
        Student[] res = Arrays.copyOf(studArr,studArr.length-1);
        System.arraycopy(studArr, 0, res, 0, index);
        System.arraycopy(studArr, index + 1, res, index, studArr.length - (index +1) );
        this.studArr = res;
        }

    private int getIndexByName(String name){
        for (int i = 0; i < studArr.length; i++) {
            Student student = studArr[i];
            if(student.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void removeByName(String studentName) {
        removeByIndex(getIndexByName(studentName));
    }
}
