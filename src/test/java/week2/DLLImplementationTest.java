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
    public void testaddFirst1() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        assertEquals(42, list.getHead());
        assertEquals(42, list.getTail());
        assertEquals(1, list.size());
    }

    @Test
    public void testaddFirst2() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        list.addFirst(2);
        assertEquals(2, list.getHead());
        assertEquals(42, list.getTail());
        assertEquals(2, list.size());
    }

    @Test
    public void testaddFirst3() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(8);
        assertEquals(8, list.getHead());
        assertEquals(42, list.getTail());
        assertEquals(4, list.size());
    }

    @Test
    public void removeFirst1() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(8);
        assertEquals(8, list.removeFirst());
        assertEquals(4, list.getHead());
        assertEquals(3, list.size());
    }

    @Test
    public void removeFirst2() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(8);
        list.removeFirst();
        list.removeFirst();
        assertEquals(2, list.getHead());
        assertEquals(2, list.size());
    }

    @Test
    public void removeFirst3() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(42);
        list.addFirst(2);
        list.addFirst(4);
        list.removeFirst();
        list.removeFirst();
        assertEquals(42, list.removeFirst());
        assertEquals(0, list.size());
    }

    @Test
    public void removeFirst4() {
        DLLImplementation list = new DLLImplementation();
        assertEquals(null, list.removeFirst());
        assertEquals(0, list.size());
    }

    @Test
    public void testAddLast1() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);
        list.addFirst(0);
        list.addLast(2);
        list.addLast(4);
        assertEquals(0, list.getHead());
        assertEquals(4, list.getTail());
        assertEquals(4, list.size());
    }

    @Test
    public void testAddLast2() {
        DLLImplementation list = new DLLImplementation();
        list.addLast(5);
        list.addLast(7);
        assertEquals(5, list.getHead());
        assertEquals(7, list.getTail());
        assertEquals(2, list.size());
    }

    @Test
    public void testAddLast3() {
        DLLImplementation list = new DLLImplementation();
        list.addLast(5);
        assertEquals(5, list.getHead());
        assertEquals(5, list.getTail());
        assertEquals(1, list.size());
    }

    @Test
    public void testAddLast4() {
        DLLImplementation list = new DLLImplementation();
        list.addLast(null);
        assertEquals(null, list.removeFirst());
        assertEquals(null, list.getHead());
        assertEquals(null, list.size());
    }

    @Test
    public void testRemoveLast1() {
        DLLImplementation list = new DLLImplementation();
        list.addLast(5);
        list.addLast(7);
        assertEquals(7, list.removeLast());
        assertEquals(5, list.getHead());
        assertEquals(5, list.getTail());
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveLast2() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);
        assertEquals(5, list.removeLast());
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveFromPosition1() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);
        list.addFirst(4);
        assertEquals(5, list.removeFromPosition(1));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveFromPosition2() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);;
        assertEquals(5, list.removeFromPosition(0));
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveFromPosition3() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);;
        assertEquals(null, list.removeFromPosition(1));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveFromPosition4() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);;
        assertEquals(5, list.removeFromPosition(0));
        assertEquals(0, list.size());
    }


    @Test
    public void testRemoveFromPosition5() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(3, list.removeFromPosition(2));
        assertEquals(3, list.size());
    }

    @Test
    public void testReverse1() {
        DLLImplementation list = new DLLImplementation();
        list.addFirst(2);
        list.addFirst(1);
        DLLImplementation reverse = new DLLImplementation();
        reverse.addFirst(1);
        reverse.addFirst(2);
        assertEquals(2, list.reverse().getHead());
        assertEquals(reverse.getTail(), list.reverse().getTail());
    }



//    @Test
//    public void testAddAtPosition() {
//        DLLImplementation list = new DLLImplementation();
//        list.addFirst(3);
//        list.addLast(2);
//        list.addAtPosition(1, 5);
//        assertEquals(3, list.size());
//        assertNull(list.removeFromPosition(10));
//        assertEquals(3, list.size());
//        assertEquals(3, list.removeFirst());
//        assertEquals(5, list.removeFirst());
//        assertEquals(2, list.removeFirst());
//    }
}

