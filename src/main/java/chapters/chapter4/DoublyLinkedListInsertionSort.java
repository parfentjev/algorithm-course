package chapters.chapter4;

public class DoublyLinkedListInsertionSort {
    public void sort(DoublyLinkedList doublyLinkedList) {
        DoublyLinkedNode sortableNode = doublyLinkedList.getHead().getNextNode();

        while (sortableNode != null) {
            DoublyLinkedNode insetAfter = sortableNode.getPreviousNode();
            DoublyLinkedNode nextNode = sortableNode.getNextNode();

            while (insetAfter != null && insetAfter.getData() > sortableNode.getData()) {
                insetAfter = insetAfter.getPreviousNode();
            }

            sortableNode.getPreviousNode().setNextNode(sortableNode.getNextNode());

            if (sortableNode.getNextNode() != null)
                sortableNode.getNextNode().setPreviousNode(sortableNode.getPreviousNode());

            sortableNode.setPreviousNode(insetAfter);

            if (insetAfter == null) {
                sortableNode.setNextNode(doublyLinkedList.getHead());
                sortableNode.getNextNode().setPreviousNode(sortableNode);
                doublyLinkedList.setHead(sortableNode);
            } else {
                sortableNode.setNextNode(insetAfter.getNextNode());
                insetAfter.getNextNode().setPreviousNode(sortableNode);
                insetAfter.setNextNode(sortableNode);
            }

            sortableNode = nextNode;
        }
    }
}
