package week3;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.*;

public class UTest {
    @Test
    public void testReverseSingleElement() {
        LibraryQueue<Integer> q = new LibraryQueue<>();
        q.enqueue(42);
        Integer before = q.front();
        q.reverse();
        assertEquals(before, q.front());
    }

    @Test
    public void testReverseEmptyQueue() {
        LibraryQueue<Integer> q = new LibraryQueue<>();
        assertTrue(q.isEmpty());
        q.reverse();
        assertTrue(q.isEmpty());
    }

    @Test
    public void testReverseTwoElements() {
        LibraryQueue<Integer> q = new LibraryQueue<>();
        ArrayList<Integer> l = new ArrayList<>();
        q.enqueue(42);
        q.enqueue(21);
        l.add(21);
        l.add(42);
        q.reverse();
        // Check all elements are in reverse order.
        for (Integer i : l) {
            assertEquals(i, q.dequeue());
        }
        // Check the size has not increased, as it should be empty now.
        assertTrue(q.isEmpty());
    }
}

