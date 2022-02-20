package chapters.chapter4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListInsertionSortTest {
    @Test
    public void sortReversedArray() {
        DoublyLinkedList linkedList = generateList(0, 2, 4, 6, 8, 10);
        new DoublyLinkedListInsertionSort().sort(linkedList);

        assertEquals("LinkedList{0, 2, 4, 6, 8, 10}", linkedList.toString());
    }

    @Test
    public void sortArrayWithValuesInRandomOrder() {
        DoublyLinkedList linkedList = generateList(8, 2, 10, 0, 4, 6);
        new DoublyLinkedListInsertionSort().sort(linkedList);

        assertEquals("LinkedList{0, 2, 4, 6, 8, 10}", linkedList.toString());
    }

    @Test
    public void sortArrayWithValuesInRandomOrderWithEqualingIntegers() {
        DoublyLinkedList linkedList = generateList(8, 2, 10, 0, 4, 4, 6);
        new DoublyLinkedListInsertionSort().sort(linkedList);

        assertEquals("LinkedList{0, 2, 4, 4, 6, 8, 10}", linkedList.toString());
    }

    private DoublyLinkedList generateList(int... values) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Arrays.stream(values).forEach(linkedList::insertAtHead);

        return linkedList;
    }
}
