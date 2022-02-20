package chapters.chapter4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DoublyLinkedListTest {
    @Test
    public void insertAtHeadAndPrintOut() {
        DoublyLinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);

        assertEquals("LinkedList{5, 15, 8, 19, 34, 1}", linkedList.toString());
    }

    @Test
    public void insertAtHeadAndVerifyLinkToPreviousAndNextNodes() {
        DoublyLinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);

        assertNull(linkedList.getHead().getPreviousNode());
        assertEquals(15, linkedList.getHead().getNextNode().getData());
    }

    @Test
    public void insertAtHeadAndVerifyListSize() {
        DoublyLinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);

        assertEquals(6, linkedList.size());
    }

    private DoublyLinkedList generateUnorderedList(int... values) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Arrays.stream(values).forEach(linkedList::insertAtHead);

        return linkedList;
    }
}
