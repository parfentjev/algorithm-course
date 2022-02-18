package chapters.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void searchElementInTheMiddle() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, 50);

        assertEquals(5, index);
    }

    @Test
    public void searchElementInTheFirstHalf() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, 20);

        assertEquals(2, index);
    }

    @Test
    public void searchElementInTheSecondHalf() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, 80);

        assertEquals(8, index);
    }

    @Test
    public void searchFirstElement() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, 0);

        assertEquals(0, index);
    }

    @Test
    public void searchLastElement() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, 100);

        assertEquals(10, index);
    }

    @Test
    public void searchNotExistingElementToTheRight() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, 200);

        assertEquals(-1, index);
    }

    @Test
    public void searchNotExistingElementToTheLeft() {
        Integer[] sortedArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = new BinarySearch().findElement(sortedArray, -200);

        assertEquals(-1, index);
    }
}
