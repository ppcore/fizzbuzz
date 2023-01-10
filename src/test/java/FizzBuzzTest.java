import org.example.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = ':',
            value = {
                    "0:0",
                    "1:1",
                    "2:2",
                    "Fizz:3",
                    "4:4",
                    "Buzz:5",
                    "Buzz:10",
                    "FizzBuzz:15"
            })
    void TestFizzBuzz(String expected, String actual) {
        assertEquals(expected, Application.FizzBuzz(Integer.parseInt(actual)));
    }
}
