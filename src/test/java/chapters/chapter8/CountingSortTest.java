package chapters.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingSortTest {
    @Test
    public void sortArrayWithValuesInRandomOrder() {
        Integer[] intArray = {3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9, 1};
        Integer[] expectedOutput = {1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9, 10, 10};
        new CountingSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }
}
