package week1;

import static org.junit.Assert.*;

import org.junit.*;

public class UTest {
    @Test
    public void mp() {
        assertEquals(20, RecursiveMultiplication.multiply(4, 5));
    }
}
