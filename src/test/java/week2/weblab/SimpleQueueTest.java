package week2.weblab;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleQueueTest {
    @Test
    public void example() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(42);
        System.out.println(queue);
        assertFalse(queue.isEmpty());
    }
}
