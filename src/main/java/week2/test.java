package week2;

import week2.Interface.EDVStudent;
import week2.Interface.HISStudent;
import week2.Interface.Student;

public class test {
    public static void main(String[] args) {
        Student[] studArr = new Student[] {
            new EDVStudent("Beate die behaaarte",5,"Dümmlinghause"),
            new HISStudent("Frank Castle", 3, "Boston"),
            new EDVStudent("Motoko Kusanagi",1,"Niihama-shi")
        };
        StudentDB test = new StudentDB(studArr);
        System.out.println(test.toString());
        
    }
}
