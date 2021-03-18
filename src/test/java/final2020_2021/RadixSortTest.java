package final2020_2021;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import java.util.*;
import java.util.ArrayList;

import org.junit.*;


public class RadixSortTest {
    

    @Test
    public void testExample() {
        assertEquals(asList("AA1B3B", "AB1B3B", "AB2A4A", "AB2A4B", "AC1B3B", "AC1D4B", "BC4D2A"), RadixSort.sortStudentIds(asList("AA1B3B", "AB2A4B", "BC4D2A", "AB1B3B", "AB2A4A", "AC1B3B", "AC1D4B")));
    }

    @Test
    public void testNull() {
        assertNull(RadixSort.sortStudentIds(null));
    }

    @Test
    public void testEmpty() {
        assertEquals(Collections.emptyList(), RadixSort.sortStudentIds(Collections.emptyList()));
    }
}
