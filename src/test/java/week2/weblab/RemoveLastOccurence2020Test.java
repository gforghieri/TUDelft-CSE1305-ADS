package week2.weblab;

import static org.junit.Assert.*;

import org.junit.*;

public class RemoveLastOccurence2020Test {


    @Test
    public void testRemoveArray_Empty() {
        int[] array = new int[0];
        assertEquals(0, RemoveLastOccurence2020.removeLastOccurrence(5, array).length);
    }

    @Test
    public void testFirstSimple() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(result, RemoveLastOccurence2020.removeLastOccurrence(1, input));
    }

    @Test
    public void testLastSimple() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(result, RemoveLastOccurence2020.removeLastOccurrence(10, input));
    }

    @Test
    public void test1() {
        int[] input = {-5, 2, 2, 4, -1, 6, 253, 8, -5, 10};
        int[] result = {-5, 2, 2, 4, -1, 6, 253, 8, 10};
        assertArrayEquals(result, RemoveLastOccurence2020.removeLastOccurrence(-5, input));
    }

    @Test
    public void test2() {
        int[] input = {-5, 2, 2, 4, -1, 6, 253, 8, -5, 10};
        int[] result = {-5, 2, 4, -1, 6, 253, 8, -5, 10};
        assertArrayEquals(result, RemoveLastOccurence2020.removeLastOccurrence(2, input));
    }
    @Test
    public void test3() {
        int[] input = {-5, 4, -1, 6, 253, 8, -5, 10};
        int[] result = {-5, 4, -1, 6, 253, 8, -5, 10};
        assertArrayEquals(result, RemoveLastOccurence2020.removeLastOccurrence(2, input));
    }
}
