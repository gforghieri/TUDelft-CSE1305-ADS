package week2;

import static org.junit.Assert.*;

import org.junit.*;

public class DLLImplementationTest {
    @Test
    public void testDLLImplementationConstructor() {
        DLLImplementation list = new DLLImplementation();
        assertEquals(0, list.size());
    }

    @Test
    public void testOneElement() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        assertEquals(42, list.getHead());
        assertEquals(42, list.getTail());
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtPosition() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(3);
        list.addLast(2);
        list.addAtPosition(1, 5);
        assertEquals(3, list.size());
        assertNull(list.removeFromPosition(10));
        assertEquals(3, list.size());
        assertEquals(3, list.removeFirst());
        assertEquals(5, list.removeFirst());
        assertEquals(2, list.removeFirst());
    }
}

