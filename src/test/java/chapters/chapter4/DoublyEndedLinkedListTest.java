package chapters.chapter4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyEndedLinkedListTest extends LinkedListTest {
    @Test
    public void insertAtTailAndPrintOut() {
        DoublyEndedLinkedList linkedList = (DoublyEndedLinkedList) generateUnorderedList(1, 34, 19, 8, 15, 5);
        linkedList.insertAtTail(0);

        assertEquals("LinkedList{5, 15, 8, 19, 34, 1, 0}", linkedList.toString());
    }

    @Override
    protected LinkedList generateUnorderedList(int... values) {
        DoublyEndedLinkedList linkedList = new DoublyEndedLinkedList();
        Arrays.stream(values).forEach(linkedList::insertAtHead);

        return linkedList;
    }
}
