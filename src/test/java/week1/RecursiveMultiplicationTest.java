package week1;

import static org.junit.Assert.*;

import org.junit.*;

public class RecursiveMultiplicationTest {
    @Test
    public void mp() {
        assertEquals(30, Solution.multiply(6, 5));
    }

    @Test
    public void both0() {
        assertEquals(0, Solution.multiply(0, 0));
    }

    @Test
    public void one0otherPos() {
        assertEquals(0, Solution.multiply(0, 2));
    }

    @Test
    public void one0otherNeg() {
        assertEquals(0, Solution.multiply(-5, 0));
    }

    @Test
    public void onePostotherNeg() {
        assertEquals(-5, Solution.multiply(-5, 1));
    }

    @Test
    public void firstPostOtherNeg() {
        assertEquals(-15, Solution.multiply(5, -3));
    }

    @Test
    public void bothNeg() {
        assertEquals(15, Solution.multiply(-5, -3));
    }


}
