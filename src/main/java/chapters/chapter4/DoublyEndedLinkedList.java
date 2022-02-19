package chapters.chapter4;

public class DoublyEndedLinkedList extends LinkedList {
    private Node tail;

    @Override
    public void insertAtHead(int data) {
        super.insertAtHead(data);

        if (tail == null)
            tail = getHead();
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (tail != null)
            tail.setNextNode(newNode);

        if (getHead() == null)
            insertAtHead(data);

        tail = newNode;
    }
}
