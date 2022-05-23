package week2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {
    
    @Test
    void shouldCreateClassStudentWithName(){
        //given
        Student student = new Student("Beate die behaaarte",5,"Dümmlinghause");
        String name = "Günter";
        //when
        student.setName(name);
        //then
        assertEquals(name, student.getName());
    }

    @Test 
    void shouldCreateClassStudentWithGrade(){
        //given
        Student student = new Student("Frank Castle", 3, "Boston");
        int grade = 1;
        //when
        student.setGrade(grade);
        //then
        assertEquals(grade, student.getGrade());
    }

    @Test 
    void shouldCreateClassStudentWithLocation(){
        //given
        Student student = new Student("Motoko Kusanagi",1,"Niihama-shi");
        String location = "Cologne";
        //when
        student.setLocation(location);
        //then
        assertEquals(location, student.getLocation());
    }

    @Test
    void shouldReturnStringWithStudentInfo(){
        //given
        Student student = new Student("Motoko Kusanagi",1,"Niihama-shi");
        //when
        String res = student.toString();
        //then
        assertEquals("Name: Motoko Kusanagi\nNote: 1\nOrt: Niihama-shi", res);
    }

    



}


