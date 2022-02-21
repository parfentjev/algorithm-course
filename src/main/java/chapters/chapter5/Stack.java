package chapters.chapter5;

public class Stack {
    private final int[] items;

    private int topItemIndex = -1;

    public Stack(int maxSize) {
        this.items = new int[maxSize];
    }

    public void push(int value) {
        items[++topItemIndex] = value;
    }

    public int pop() {
        return items[topItemIndex--];
    }

    public int peek() {
        return items[topItemIndex];
    }

    public int size() {
        return topItemIndex + 1;
    }
}
