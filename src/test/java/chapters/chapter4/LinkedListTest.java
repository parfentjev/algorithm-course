package chapters.chapter4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void insertAtHeadAndPrintOut() {
        LinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);

        assertEquals("LinkedList{5, 15, 8, 19, 34, 1}", linkedList.toString());
    }

    @Test
    public void sizeOfAnEmptyList() {
        LinkedList linkedList = generateUnorderedList();

        assertEquals(0, linkedList.size());
    }

    @Test
    public void sizeOfAListWithData() {
        LinkedList linkedList = generateUnorderedList(5, 15, 8);

        assertEquals(3, linkedList.size());
    }

    @Test
    public void deleteAtHeadAndPrintOut() {
        LinkedList linkedList = generateUnorderedList(5, 15, 8);
        linkedList.deleteAtHead();
        linkedList.insertAtHead(19);
        linkedList.insertAtHead(34);
        linkedList.insertAtHead(1);
        linkedList.deleteAtHead();

        assertEquals("LinkedList{34, 19, 15, 5}", linkedList.toString());
    }

    @Test
    public void findFirstNode() {
        LinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);
        Node node = linkedList.findNode(5);

        assertEquals(5, node.getData());
        assertNotNull(node.getNextNode());
    }

    @Test
    public void findMiddleNode() {
        LinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);
        Node node = linkedList.findNode(8);

        assertEquals(8, node.getData());
        assertNotNull(node.getNextNode());
    }

    @Test
    public void findLastNode() {
        LinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);
        Node node = linkedList.findNode(1);

        assertEquals(1, node.getData());
        assertNull(node.getNextNode());
    }

    @Test
    public void findNotExistingNode() {
        LinkedList linkedList = generateUnorderedList(1, 34, 19, 8, 15, 5);
        Node node = linkedList.findNode(100);

        assertNull(node);
    }

    protected LinkedList generateUnorderedList(int... values) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(values).forEach(linkedList::insertAtHead);

        return linkedList;
    }
}
