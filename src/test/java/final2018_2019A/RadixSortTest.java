package final2018_2019A;

import org.junit.*;

import java.util.ArrayList;
import java.util.*;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

public class RadixSortTest {

    @Test(timeout = 100)
    public void testEmpty() {
        assertEquals(new ArrayList<>(), RadixSort.radixSortMSD(new ArrayList<>()));
    }

//    @Test(timeout = 100)
    @Test
    public void testReversed() {
        List<String> data = asList("donut", "cherry", "banana", "apple");
        List<String> data2 = asList("apple", "banana", "cherry", "donut");
        assertEquals(data2, RadixSort.radixSortMSD(data));
    }

    @Test
    public void test2() {
        List<String> data = asList("pig", "cat", "parrot", "monkey");
        List<String> data2 = asList("cat", "monkey", "parrot", "pig");
        assertEquals(data2, RadixSort.radixSortMSD(data));
    }

    
}
