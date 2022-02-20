package chapters.chapter4;

public class SortedLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else if (newNode.getData() < head.getData())
            replaceHead(newNode);
        else
            insertNode(newNode);
    }

    private void replaceHead(Node newHead) {
        newHead.setNextNode(head);
        head = newHead;
    }

    private void insertNode(Node newNode) {
        Node currentNode = head;

        while (currentNode.getNextNode() != null && newNode.getData() > currentNode.getNextNode().getData()) {
            currentNode = currentNode.getNextNode();
        }

        newNode.setNextNode(currentNode.getNextNode());
        currentNode.setNextNode(newNode);
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
