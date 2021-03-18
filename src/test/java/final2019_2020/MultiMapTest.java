//package final_2019_2020;
//
//import static org.junit.Assert.*;
//
//import java.util.*;
//
//import org.junit.*;
//
//public class MultiMapTest {
//
//    @Test
//    public void testEverythingOneItem() {
//        MultiMap map = new MultiMap();
//        map.put(1, 2);
//        assertFalse(map.isEmpty());
//        assertEquals(1, map.size());
//        assertEquals(Collections.singletonList(2), map.get(1));
//        assertFalse(map.remove(1, 3));
//        assertTrue(map.remove(1, 2));
//    }
//}
