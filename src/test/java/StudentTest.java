import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {
    
    @Test
    void shouldCreateClassStudentWithName(){
        Student student = new Student();
        //given
        String name = "Günter";
        //when
        student.setName(name);
        //then
        assertEquals(name, student.getName());
    }

    @Test 
    void shouldCreateClassStudentWithGrade(){
        Student student = new Student();
        //given
        int grade = 1;
        //when
        student.setGrade(grade);
        //then
        assertEquals(grade, student.getGrade());
    }

    @Test 
    void shouldCreateClassStudentWithLocation(){
        Student student = new Student();
        //given
        String location = "Cologne";
        //when
        student.setLocation(location);
        //then
        assertEquals(location, student.getLocation());
    }


}


