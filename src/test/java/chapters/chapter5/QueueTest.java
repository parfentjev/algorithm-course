package chapters.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    @Test
    public void createCircularQueue() {
        Queue queue = new Queue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.peek());

        assertEquals(1, queue.dequeue());

        queue.enqueue(4);
        assertEquals(2, queue.dequeue());
        queue.enqueue(5);
        assertEquals(3, queue.dequeue());
        queue.enqueue(6);
        assertEquals(4, queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);

        assertArrayEquals(new int[]{7, 8, 9}, queue.getItems());
    }
}
