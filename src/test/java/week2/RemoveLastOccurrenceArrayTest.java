package week2;

import static org.junit.Assert.*;

import org.junit.*;

public class RemoveLastOccurrenceArrayTest {
    @Test
    public void testRemoveArray_Empty() {
        int[] array = new int[0];
        assertEquals(0, RemoveLastOccurrenceArray.removeLastOccurrence(5, array).length);
    }

    @Test
    public void testFirstSimple() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(result, RemoveLastOccurrenceArray.removeLastOccurrence(1, input));
    }

    @Test
    public void testLastSimple() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(result, RemoveLastOccurrenceArray.removeLastOccurrence(10, input));
    }

    @Test
    public void testPositiveInMiddleDuplicate() {
        int[] input = {1, 2, 3, 3, 4, 5};
        int[] result = {1, 2, 3, 4, 5};
        assertArrayEquals(result, RemoveLastOccurrenceArray.removeLastOccurrence(3, input));
    }

    @Test
    public void testNegativeFirst() {
        int[] input = {-3, -1, 2, -3, 3, 4, 5, 0};
        int[] result = {-3, -1, 2, 3, 4, 5, 0};
        assertArrayEquals(result, RemoveLastOccurrenceArray.removeLastOccurrence(-3, input));
    }
}