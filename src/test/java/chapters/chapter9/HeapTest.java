package chapters.chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapTest {
    @Test
    public void createPriorityQueue() {
        Integer[] inputArray = {8, 3, 5, 7, 2, 15, 17, 19};
        Integer[] expectedArray = {19, 17, 15, 7, 2, 5, 8, 3};
        Heap heap = new Heap(inputArray);

        assertArrayEquals(expectedArray, heap.getHeap());
    }
}
