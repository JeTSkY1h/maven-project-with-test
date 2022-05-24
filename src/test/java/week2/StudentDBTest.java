package week2;
import org.junit.jupiter.api.Test;

import week2.Interface.*;
import static org.junit.jupiter.api.Assertions.*;

 public class StudentDBTest { 
    private Student[] studArr = new Student[] {
        new EDVStudent("Beate die behaarte",5,"Dümmlinghause"),
       new HISStudent("Frank Castle", 3, "Boston"),
        new EDVStudent("Motoko Kusanagi",1,"Niihama-shi")
       };
    private Student Asterix = new HISStudent("Asterix",1 , "Gallien");
    
    @Test
     void ShouldListStudents(){
        //given
        StudentDB studentDB = new StudentDB(studArr);
        //when 
        Student[] res = studentDB.list();
        //then
        assertArrayEquals(studArr, studentDB.list());
        assertEquals("Beate die behaarte", res[0].getName());
     }

     @Test
     void ShouldListStudentsAsString(){
         //given
         StudentDB StudentDB = new StudentDB(studArr);
         //then
         String actual = StudentDB.toString();
         String expected = "Name: Beate die behaarte\nID: " 
         + StudentDB.list()[0].getId() + "\ngrade: 5\nOrt: Dümmlinghause\n\nName: Frank Castle\nID: " 
         + StudentDB.list()[1].getId() +"\ngrade: 3\nOrt: Boston\n\nName: Motoko Kusanagi\nID: "
         + StudentDB.list()[2].getId() +"\ngrade: 1\nOrt: Niihama-shi\n\n";
        //when
        assertEquals(expected, actual);

     }

     @Test
     void shouldAddNewStudent(){
        StudentDB studentDB = new StudentDB(studArr);
        Student[] expected = {studArr[0],studArr[1],studArr[2],Asterix};
        studentDB.add(Asterix);
        Student[] actual = studentDB.list();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveStudentByName(){
        //given
        StudentDB studentDB = new StudentDB(studArr);
        studentDB.add(Asterix);
        //When
        studentDB.removeByName("Asterix");
        Student[] actual =  studentDB.list();
        Student[] expected = studArr;
        
        assertArrayEquals(expected, actual);
        
    }
 }