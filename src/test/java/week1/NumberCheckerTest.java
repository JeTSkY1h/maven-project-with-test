import org.junit.jupiter.api.Test;

import week1.NumberChecker;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @Test
    void shouldReturnTrueBecauseNumIsGreater100() {
        //given
        int n = 101;
        //then
        var res = NumberChecker.checkNum(n);
        //when
        assertTrue(res);
    }

    @Test
    void shouldReturnTrueBecauseNumIsLower100() {
        //given
        int n = 99;
        //then
        var res = NumberChecker.checkNum(n);
        //when
        assertFalse(res);
    }
}