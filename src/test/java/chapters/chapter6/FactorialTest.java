package chapters.chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void headFactorial() {
        int factorial = new Factorial().headFactorial(3);

        assertEquals(6, factorial);
    }

    @Test
    public void tailFactorial() {
        int factorial = new Factorial().tailFactorial(3, 1);

        assertEquals(6, factorial);
    }
}
