package chapters.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    @Test
    public void pushAndPopAllItems() {
        Stack stack = new Stack(2);
        assertEquals(0, stack.size());
        stack.push(5);
        stack.push(3);
        assertEquals(2, stack.size());
        assertEquals(3, stack.peek());
        assertEquals(3, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(0, stack.size());
    }
}
