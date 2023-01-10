import org.example.Application;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void Input0() {
        assertEquals("0",Application.FizzBuzz(0));
    }

    @Test
    void Input1() {
        assertEquals("1",Application.FizzBuzz(1));
    }

    @Test
    void Input2() {
        assertEquals("2",Application.FizzBuzz(2));
    }

    @Test
    void Input3() {
        assertEquals("Fizz",Application.FizzBuzz(3));
    }

    @Test
    void Input4() {
        assertEquals("4",Application.FizzBuzz(4));
    }

    @Test
    void Input5() {
        assertEquals("Buzz",Application.FizzBuzz(5));
    }

    @Test
    void Input6() {
        assertEquals("Fizz",Application.FizzBuzz(6));
    }

    @Test
    void Input10() {
        assertEquals("Buzz", Application.FizzBuzz(10));
    }

    @Test
    void Input15() {
        assertEquals("FizzBuzz",Application.FizzBuzz(15));
    }
}
