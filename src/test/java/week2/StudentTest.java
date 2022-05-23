package week2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {
    
    @Test
    void shouldCreateClassStudentWithName(){
        Student student = new Student("Beate die behaaarte",5,"Dümmlinghause");
        //given
        String name = "Günter";
        //when
        student.setName(name);
        //then
        assertEquals(name, student.getName());
    }

    @Test 
    void shouldCreateClassStudentWithGrade(){
        Student student = new Student("Frank Castle", 3, "Boston");
        //given
        int grade = 1;
        //when
        student.setGrade(grade);
        //then
        assertEquals(grade, student.getGrade());
    }

    @Test 
    void shouldCreateClassStudentWithLocation(){
        Student student = new Student("Motoko Kusanagi",1,"Niihama-shi");
        //given
        String location = "Cologne";
        //when
        student.setLocation(location);
        //then
        assertEquals(location, student.getLocation());
    }

    



}


