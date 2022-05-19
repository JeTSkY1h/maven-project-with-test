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
        assertEquals(8, res);
    }
    @Test 
    void Fibonacci0() {
        //given
        int n = 0 ;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        assertEquals(0, res);
    }
    @Test 
    void Fibonacci1() {
        //given
        int n = 1;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        assertEquals(1, res);
    }

    @Test 
    void Fibonacci40() {
        //given
        int n = 40;
        //when
        var res = Fibonacci.getFibonacci(n);
        //then
        assertEquals(102334155 , res);
    }
}
