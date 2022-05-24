package week2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    
    @Test
    void shouldCreateClassStudentWithName(){
        //given
        Student student = new EDVStudent("Beate die behaaarte",5,"Dümmlinghause");
        String name = "Günter";
        //when
        student.setName(name);
        //then
        assertEquals(name, student.getName());
    }

    @Test 
    void shouldCreateClassStudentWithLocation(){
        //given
        Student student = new HISStudent("Motoko Kusanagi",1,"Niihama-shi");
        String location = "Cologne";
        //when
        student.setLocation(location);
        //then
        assertEquals(location, student.getLocation());
    }

    @Test
    void shouldReturnStringWithStudentInfo(){
        //given
        Student student = new EDVStudent("Motoko Kusanagi",1,"Niihama-shi");
        //when
        String res = student.toString();
        //then
        assertEquals("Name: Motoko Kusanagi\nID: " + student.getId() + "\ngrade: 1\nOrt: Niihama-shi\n", res);
    }

    @Test 
    void shouldReturnStringWithSubject(){
        //given
        Student Asterix = new HISStudent("Asterix",1 , "Gallien");
        //then
        String res = Asterix.getSubject();
        assertEquals("history", res);
    }

}


