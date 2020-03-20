package week3;

import static org.junit.Assert.*;

import org.junit.*;

public class UTest {
    @Test
    public void testFirstEmptyQueue() {
        try {
            new QueueToStack<Integer>().first();
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testOneElement() {
        Queue<Integer> q = new QueueToStack<>();
        q.enqueue(42);
        assertEquals(1, q.size());
        assertEquals(new Integer(42), q.dequeue());
    }
}

