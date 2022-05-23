package week2;

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

}
