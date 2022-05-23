package week2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class StudentDBTest { 
    private Student[] studArr = new Student[] {
        new Student("Beate die behaarte",5,"Dümmlinghause"),
       new Student("Frank Castle", 3, "Boston"),
        new Student("Motoko Kusanagi",1,"Niihama-shi")
       };
    
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
         String expected = "Name: Beate die behaaarte\nID: " 
         + StudentDB.list()[0].getId() + "\ngrade: 5\nOrt: Dümmlinghause\n\nName: Frank Castle\nID: " 
         + StudentDB.list()[1].getId() +"\ngrade: 3\nOrt: Boston\n\nName: Motoko Kusanagi\nID: "
         + StudentDB.list()[2].getId() +"\ngrade: 1\nOrt: Niihama-shi\n\n";
        //when
        assertEquals(expected, StudentDB.toString());

     }

     @Test
     void shouldAddNewStudent(){
        StudentDB studentDB = new StudentDB(studArr);
        Student newS = new Student("Asterix",1 , "Gallien");
        
        Student[] expected = {studArr[0],studArr[1],studArr[2],newS};
        studentDB.add(newS);
        Student[] actual = studentDB.list();
        
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveStudent(){
        
        
        assertArrayEquals(expected, actual);
        
    }
 }