package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void sortReversedArray() {
        int[] intArray = {10, 8, 6, 4, 2, 0};
        int[] expectedOutput = {0, 2, 4, 6, 8, 10};
        new BubbleSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }

    @Test
    public void sortArrayWithValuesInRandomOrder() {
        int[] intArray = {4, 8, 10, 0, 2, 6};
        int[] expectedOutput = {0, 2, 4, 6, 8, 10};
        new BubbleSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }

    @Test
    public void sortArrayWithValuesInRandomOrderWithEqualingIntegers() {
        int[] intArray = {4, 8, 4, 10, 0, 2, 6};
        int[] expectedOutput = {0, 2, 4, 4, 6, 8, 10};
        new BubbleSort().sort(intArray);

        assertArrayEquals(expectedOutput, intArray);
    }
}
