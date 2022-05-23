package week2;

import java.util.Arrays;

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

    public void remove(String studentName) {
        Student[] res = Arrays.copyOf(studArr,studArr.length-1);

    }
}
