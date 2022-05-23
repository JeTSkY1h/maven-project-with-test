import org.junit.jupiter.api.Test;

import week1.Adder;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    void shouldAddTwoPostiveNumbers() {
        //given
        var n = 20;
        var n1 = 23;

        //when
        int res = Adder.add(n,n1);
        //then
        assertEquals(43, res);
    }
}