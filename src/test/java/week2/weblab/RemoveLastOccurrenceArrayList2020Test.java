package week2.weblab;

import java.util.ArrayList;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import org.junit.*;

public class RemoveLastOccurrenceArrayList2020Test {

    @Test
    public void testMultipleLast() {
        ArrayList<Integer> input = new ArrayList<>(asList(1, 1, 3, 5, 7, 1, 5, 9, 1));
        ArrayList<Integer> result = new ArrayList<>(asList(1, 1, 3, 5, 7, 1, 5, 9));
        RemoveLastOccurrenceArrayList2020.removeLastOccurrence(1, input);
        assertEquals(result, input);
    }
}

