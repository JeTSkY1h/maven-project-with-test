import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {
    @Test
    void shouldReturnArrayWith10Students() {
        //given
        int n = 10;
        //then
        var res = Arrays.studentsMethod(n);
        //when
        String[] expected = {
            "Student 0",
            "Student 1",
            "Student 2",
            "Student 3",
            "Student 4",
            "Student 5",
            "Student 6",
            "Student 7",
            "Student 8",
            "Student 9",
        };

        assertArrayEquals(expected, res);
        
    }


    @Test
    void shouldReturnArrayWith1Students() {
        //given
        int n = 1;
        //then
        var res = Arrays.studentsMethod(n);
        //when
        String[] expected = {
            "Student 0",
        };

        assertArrayEquals(expected, res);
        
    }

    @Test 
    void shouldReturn10(){
        //given
        int[] nArr = {1,2,3,4};
        //then
        var res = Arrays.ArraySum(nArr);
        //when
        assertEquals(10, res);
    }

    @Test
    void shouldReturn39(){
        //given
        int[] nArr = {10,10,11,8};
        //then
        var res = Arrays.ArraySum(nArr);
        //when
        assertEquals(39, res);
    }
}
