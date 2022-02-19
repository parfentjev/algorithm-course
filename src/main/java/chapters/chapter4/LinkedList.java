package chapters.chapter4;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAtHead(int data) {
        head = new Node(data, head);
    }

    public void deleteAtHead() {
        head = head.getNextNode();
    }

    public Node findNode(int data) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData() == data)
                return currentNode;

            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public int size() {
        int size = 0;
        Node currentNode = head;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNextNode();
        }

        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append("LinkedList{");
        Node currentNode = head;

        while (currentNode != null) {
            stringBuilder.append(currentNode).append(currentNode.getNextNode() == null ? "" : ", ");
            currentNode = currentNode.getNextNode();
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
