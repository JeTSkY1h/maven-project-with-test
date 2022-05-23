import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {
    Student student = new Student();
    
    @Test
    void shouldCreateClassStudentWithName(){
        //given
        String name = "Günter";
        //when
        student.setName(name);
        //then
        assertEquals(name, student.getName());
    }

    @Test 
    void shouldCreateClassStudentWithGrade(){
        //given
        int grade = 1;
        //when
        student.setGrade(grade);
        //then
        assertEquals(grade, student.getGrade());
    }

    @Test 
    void shouldCreateClassStudentWithLocation(){
        //given
        String location = "Cologne";
        //when
        student.setLocation(location);
        //then
        assertEquals(location, student.getLocation());
    }


}


