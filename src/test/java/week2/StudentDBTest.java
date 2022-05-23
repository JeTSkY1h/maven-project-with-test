package week2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class StudentDBTest { 
     @Test
     void ShouldListStudents(){
        //given
        Student[] studArr = new Student[] {
             new Student("Beate die behaarte",5,"Dümmlinghause"),
            new Student("Frank Castle", 3, "Boston"),
             new Student("Motoko Kusanagi",1,"Niihama-shi")
            };
        StudentDB studentDB = new StudentDB(studArr);
         
        //when 
        Student[] res = studentDB.list();
        assertArrayEquals(studArr, studentDB.list());
        
        assertEquals("Beate die behaarte", res[0].getName());


     }

     @Test
     void ShouldListStudentsAsString(){
         //given
         Student[] studArr = new Student[] {
             new Student("Beate die behaaarte",5,"Dümmlinghause"),
            new Student("Frank Castle", 3, "Boston"),
             new Student("Motoko Kusanagi",1,"Niihama-shi")
         };
         String expected = "Name: Beate die behaaarte\nID: 0\ngrade: 5\nOrt: Dümmlinghause\n\nName: Frank Castle\nID: 1\ngrade: 3\nOrt: Boston\n\nName: Motoko Kusanagi\nID: 2\ngrade: 1\nOrt: Niihama-shi\n\n";
         //then
         StudentDB res = new StudentDB(studArr);
        //when
        assertEquals(expected, res.toString());

     }
 }