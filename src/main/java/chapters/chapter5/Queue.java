package chapters.chapter5;

public class Queue {
    private final int maxSize;
    private final int[] items;

    private int headItemIndex = -1;
    private int tailItemIndex = -1;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.items = new int[maxSize];
    }

    public void enqueue(int value) {
        boolean emptySpaceInQueueExists = Math.abs(tailItemIndex - headItemIndex) < maxSize;

        tailItemIndex++;

        if (tailItemIndex > maxSize - 1 && emptySpaceInQueueExists) {
            tailItemIndex = 0;
        }

        if (headItemIndex > maxSize - 1 && emptySpaceInQueueExists) {
            headItemIndex = -1;
        }

        if (headItemIndex == -1) {
            headItemIndex++;
        }


        items[tailItemIndex] = value;
    }

    public int dequeue() {
        return items[headItemIndex++];
    }

    public int peek() {
        return items[headItemIndex];
    }

    public int[] getItems() {
        return items;
    }
}