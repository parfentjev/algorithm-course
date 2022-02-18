package chapters.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void sortReversedArray() {
        Integer[] intArray = {10, 8, 6, 4, 2, 0};
        Integer[] expectedOutput = {0, 2, 4, 6, 8, 10};
        new BubbleSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }

    @Test
    public void sortArrayWithValuesInRandomOrder() {
        Integer[] intArray = {4, 8, 10, 0, 2, 6};
        Integer[] expectedOutput = {0, 2, 4, 6, 8, 10};
        new BubbleSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }

    @Test
    public void sortArrayWithValuesInRandomOrderWithEqualingIntegers() {
        Integer[] intArray = {4, 8, 4, 10, 0, 2, 6};
        Integer[] expectedOutput = {0, 2, 4, 4, 6, 8, 10};
        new BubbleSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }
}
