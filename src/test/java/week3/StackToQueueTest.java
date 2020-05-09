//package week3;
//
//import static org.junit.Assert.*;
//
//import org.junit.*;
//
//public class StackToQueueTest {
//        @Test
//        public void testFirstEmptyQueue() { // done
//            try {
//                new StackToQueue<Integer>().first();
//                fail();
//            } catch (Exception e) {
//            }
//        }
//
//        @Test
//        public void testIsEmpty() { // done
//            StackToQueue<Integer> q = new StackToQueue<>();
//            assertEquals(0, q.size());
//            assertEquals(true, q.isEmpty());
//        }
//
//        @Test
//        public void testOneElement() {
//            StackToQueue<Integer> q = new StackToQueue<>();
//            q.enqueue(42);
//            assertEquals(1, q.size());
//            assertEquals(new Integer(42), q.dequeue());
//        }
//
//        @Test
//        public void test2Element() {
//            StackToQueue<Integer> q = new StackToQueue<>();
//            q.enqueue(42);
//            q.enqueue(10);
//            assertEquals(2, q.size());
//            q.dequeue();
//            assertEquals(new Integer(10), q.dequeue());
//        }
//
//
//    }
//
//
//
