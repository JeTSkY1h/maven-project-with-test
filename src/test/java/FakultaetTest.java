import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {

    @Test
    void shouldReturn1because0() {
        //given
        int n = 0;
        //when
        int res = Fakultaet.fakultätFor(n);
        //then
        assertEquals(1,res);
    }

    @Test
    void shouldReturn1Because1() {
        //given
        int n = 1;
        //when
        int res = Fakultaet.fakultätFor(n);
        //then
        assertEquals(1,res);
    }

    @Test
    void shouldReturn2Because2() {
        //given
        int n = 2;
        //when
        int res = Fakultaet.fakultätFor(n);
        //then
        assertEquals(2,res);
    }

    @Test
    void shouldReturn6Because3() {
        //given
        int n = 3;
        //when
        int res = Fakultaet.fakultätFor(n);
        //then
        assertEquals(6,res);
    }

    @Test
    void shouldReturn1because0While() {
        //given
        int n = 0;
        //when
        int res = Fakultaet.fakultätWhile(n);
        //then
        assertEquals(1,res);
    }

    @Test
    void shouldReturn1Because1While() {
        //given
        int n = 1;
        //when
        int res = Fakultaet.fakultätWhile(n);
        //then
        assertEquals(1,res);
    }

    @Test
    void shouldReturn2Because2While() {
        //given
        int n = 2;
        //when
        int res = Fakultaet.fakultätWhile(n);
        //then
        assertEquals(2,res);
    }

    @Test
    void shouldReturn6Because3While() {
        //given
        int n = 3;
        //when
        int res = Fakultaet.fakultätWhile(n);
        //then
        assertEquals(6,res);
    }

    
}