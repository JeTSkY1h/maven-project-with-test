package week1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test 
    void Fibonacci6() {
        //given
        int n = 6;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        long exp = 8;
        assertEquals(exp, res);
    }
    @Test 
    void Fibonacci0() {
        //given
        int n = 0;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        long exp = 0;
        assertEquals(exp, res);
    }
    @Test 
    void Fibonacci1() {
        //given
        int n = 1;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        long exp = 1;
        assertEquals(exp, res);
    }

    @Test 
    void Fibonacci40() {
        //given
        int n = 40;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        long exp = 102334155;
        assertEquals(exp, res);
    }
}
