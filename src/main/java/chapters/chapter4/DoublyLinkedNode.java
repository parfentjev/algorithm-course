package chapters.chapter4;

public class DoublyLinkedNode {
    private final int data;
    private DoublyLinkedNode previousNode;
    private DoublyLinkedNode nextNode;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public DoublyLinkedNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedNode previousNode) {
        this.previousNode = previousNode;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
