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
         StudentDB res = new StudentDB(studArr);
         //then
         String expected = "Name: Beate die behaaarte\nID: " 
         + res.list()[0].getId() + "\ngrade: 5\nOrt: Dümmlinghause\n\nName: Frank Castle\nID: " 
         + res.list()[1].getId() +"\ngrade: 3\nOrt: Boston\n\nName: Motoko Kusanagi\nID: "
         + res.list()[2].getId() +"\ngrade: 1\nOrt: Niihama-shi\n\n";
        //when
        assertEquals(expected, res.toString());

     }
 }