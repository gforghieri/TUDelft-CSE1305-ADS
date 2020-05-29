import org.junit.Test;
import week2.CloningArrays;

import static org.junit.Assert.assertEquals;

public class FibTailRecTest {

    @Test
    public void fibTest1() {
        int result = FibTailRec.fibTailRec(5, 3, 1, 1);
        assertEquals(result, 5);
    }
}
