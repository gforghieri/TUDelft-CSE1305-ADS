//package week3;
//
//import static org.junit.Assert.*;
//
//import org.junit.*;
//
//public class UTest {
//    @Test
//    public void testConstructor() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        assertEquals(0, deq.size());
//        assertTrue(deq.isEmpty());
//    }
//
//    @Test
//    public void testAddFirstNoLongerEmpty() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addFirst(42);
//        assertEquals(1, deq.size());
//        assertFalse(deq.isEmpty());
//    }
//
//    @Test
//    public void testAddLastNoLongerEmpty() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addLast(42);
//        assertEquals(1, deq.size());
//        assertFalse(deq.isEmpty());
//    }
//
//    @Test
//    public void testAddGetFirst() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addFirst(42);
//        assertEquals(new Integer(42), deq.getFirst());
//    }
//
//    @Test
//    public void testAddGetLast() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addLast(42);
//        assertEquals(new Integer(42), deq.getFirst());
//    }
//
//    @Test
//    public void testGetFirstEmptyList() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        boolean caught = false;
//        try {
//            deq.getFirst();
//        } catch (EmptyDequeException e) {
//            caught = true;
//        }
//        assertTrue(caught);
//    }
//
//    @Test
//    public void testGetLastEmptyList() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        boolean caught = false;
//        try {
//            deq.getLast();
//        } catch (EmptyDequeException e) {
//            caught = true;
//        }
//        assertTrue(caught);
//    }
//
//    @Test
//    public void testAddFirstEqualsLast() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addFirst(42);
//        assertSame(deq.getFirst(), deq.getLast());
//    }
//
//    @Test
//    public void testAddLastEqualsFirst() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addLast(42);
//        assertSame(deq.getLast(), deq.getFirst());
//    }
//
//    @Test
//    public void testRemoveFirst() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addFirst(42);
//        assertEquals(new Integer(42), deq.removeFirst());
//        assertTrue(deq.isEmpty());
//    }
//
//    @Test
//    public void testRemoveLast() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addFirst(42);
//        assertEquals(new Integer(42), deq.removeLast());
//        assertTrue(deq.isEmpty());
//    }
//
//    @Test
//    public void testRemoveFirstAddLast() throws EmptyDequeException {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        deq.addLast(42);
//        assertEquals(new Integer(42), deq.removeFirst());
//        assertTrue(deq.isEmpty());
//    }
//
//    @Test
//    public void testRemoveFirstEmptyList() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        try {
//            deq.removeFirst();
//            fail();
//        } catch (EmptyDequeException e) {
//        }
//    }
//
//    @Test
//    public void testRemoveLastEmptyList() {
//        Deque<Integer> deq = new DoubleEndedQueue<>();
//        try {
//            deq.removeLast();
//            fail();
//        } catch (EmptyDequeException e) {
//        }
//    }
//}
//
