package AdditionalPracticeTest;

import static org.junit.Assert.*;

import AdditionalPractice.Pair;
import AdditionalPractice.SLList;
import org.junit.*;

public class SLListTest {
   @Test(timeout = 100)
   public void testAddOneElement() {
     SLList<String> list = new SLList<>();
     list.addFirst("Hello World");
     assertEquals("Hello World", list.getFirst());
   }

   @Test(timeout = 100)
   public void testAddRemoveNull() {
     SLList<Object> list = new SLList<>();
     list.addFirst(null);
     assertNull(list.removeFirst());
   }

    @Test(timeout = 100)
    public void testZipNull() {
        SLList<Integer> list1 = new SLList<>();
        list1.addFirst(42);
        list1.addFirst(43);
        list1.addFirst(44);
        SLList<Pair<Integer, Integer>> zipped = list1.zip(null);
        assertNull(zipped.getFirst());
    }

    @Test(timeout = 100)
    public void testZipNull2() {
        SLList<Integer> list2 = new SLList<>();
        list2.addFirst(42);
        list2.addFirst(43);
        list2.addFirst(44);
        SLList<Pair<Integer, Integer>> zipped = list2.zip(null);
        assertNull(zipped.getFirst());
    }

   @Test(timeout = 100)
   public void testZipOnePair() {
     SLList<Integer> list1 = new SLList<>();
     SLList<Integer> list2 = new SLList<>();
     list1.addFirst(42);
     list2.addFirst(1337);
     SLList<Pair<Integer, Integer>> zipped = list1.zip(list2);
     assertEquals(new Pair<>(42, 1337), zipped.getFirst());
   }

   @Test(timeout = 100)
   public void testAppendNull() {
     SLList<String> list1 = new SLList<>();
     list1.addFirst("Hello");
     list1.append(null);
     assertEquals("Hello", list1.removeFirst());
     assertNull(list1.getFirst());
   }

   @Test(timeout = 100)
   public void testAppendOneElement() {
     SLList<String> list1 = new SLList<>();
     SLList<String> list2 = new SLList<>();
     list1.addFirst("Hello");
     list2.addFirst("World");
     list1.append(list2);
     assertEquals("Hello", list1.removeFirst());
     assertEquals("World", list1.removeFirst());
     assertNull(list1.getFirst());
   }

   @Test(timeout = 100)
   public void testDropEvenOneElement() {
     SLList<Integer> list = new SLList<>();
     list.addFirst(42);
     list.dropEven();
     assertNull(list.getFirst());
   }

    @Test(timeout = 100)
    public void testDropEvenOneElement2() {
        SLList<String> list = new SLList<>();
        list.addFirst("6");
        list.addFirst("5");
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.addFirst("0");
        list.dropEven();
        assertEquals("1", list.getFirst());
    }

    @Test(timeout = 100)
    public void testZipOnePair2() {
        SLList<Integer> list1 = new SLList<>();
        SLList<Integer> list2 = new SLList<>();
        list1.addFirst(42);
        list2.addFirst(1337);
        list2.addFirst(1338);
        SLList<Pair<Integer, Integer>> zipped = list1.zip(list2);
        assertEquals(new Pair<>(42, 1337), zipped.getFirst());
    }

    @Test(timeout = 100)
    public void testZipOnePair3() {
        SLList<Integer> list1 = new SLList<>();
        SLList<Integer> list2 = new SLList<>();
        list1.addFirst(42);
        list1.addFirst(1337);
        list2.addFirst(1338);
        SLList<Pair<Integer, Integer>> zipped = list1.zip(list2);
        assertEquals(new Pair<>(1337, 1338), zipped.getFirst());
    }
}

