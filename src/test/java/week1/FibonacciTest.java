package week1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test 
    void Fibonacci6() {
        //given
        int n = 6;
        //when
        var res = Fibonacci.getFibonacciFor(n);
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
    void Fibonacci49() {
        //given
        int n = 25;
        //when
        var res = Fibonacci.getFibonacciFor(n);
        //then
        Long exp = 75025L;
        assertEquals(exp, res);
    }
}
