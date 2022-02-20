package chapters.chapter4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedLinkedListTest {
    @Test
    public void addElementAtBeginning() {
        SortedLinkedList sortedLinkedList = generateSortedList(0, 30, 20, 40, 50, 10);
        sortedLinkedList.insert(-10);

        assertEquals("LinkedList{-10, 0, 10, 20, 30, 40, 50}", sortedLinkedList.toString());
    }

    @Test
    public void addElementAtMiddle() {
        SortedLinkedList sortedLinkedList = generateSortedList(0, 30, 20, 40, 50, 10);
        sortedLinkedList.insert(25);

        assertEquals("LinkedList{0, 10, 20, 25, 30, 40, 50}", sortedLinkedList.toString());
    }

    @Test
    public void addElementAtEnd() {
        SortedLinkedList sortedLinkedList = generateSortedList(0, 30, 20, 40, 50, 10);
        sortedLinkedList.insert(60);

        assertEquals("LinkedList{0, 10, 20, 30, 40, 50, 60}", sortedLinkedList.toString());
    }

    private SortedLinkedList generateSortedList(int... values) {
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        Arrays.stream(values).forEach(sortedLinkedList::insert);

        return sortedLinkedList;
    }
}
