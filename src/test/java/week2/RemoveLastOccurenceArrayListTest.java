package week2;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import org.junit.*;

public class RemoveLastOccurenceArrayListTest {

    @Test
    public void testMultipleLast() {
        ArrayList<Integer> input = new ArrayList<>(asList(1, 1, 3, 5, 7, 1, 5, 9, 1));
        ArrayList<Integer> result = new ArrayList<>(asList(1, 1, 3, 5, 7, 1, 5, 9));
        RemoveLastOccurrenceArrayList.removeLastOccurrence(1, input);
        assertEquals(result, input);
    }

    @Test
    public void testRemoveAll() {
        ArrayList<Integer> input = new ArrayList<Integer>(asList(1, 3, 4));
        ArrayList<Integer> result = new ArrayList<>(Collections.emptyList());
        RemoveLastOccurrenceArrayList.removeAll(input);
        assertEquals(result, input);
    }
}


