package chapters.chapter4;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(head);

        if (head != null)
            head.setPreviousNode(newNode);

        head = newNode;
    }

    public void setHead(DoublyLinkedNode head) {
        this.head = head;
    }

    public DoublyLinkedNode getHead() {
        return head;
    }

    public int size() {
        int size = 0;

        DoublyLinkedNode currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNextNode();
        }

        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append("LinkedList{");
        DoublyLinkedNode currentNode = head;

        while (currentNode != null) {
            stringBuilder.append(currentNode).append(currentNode.getNextNode() == null ? "" : ", ");
            currentNode = currentNode.getNextNode();
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
