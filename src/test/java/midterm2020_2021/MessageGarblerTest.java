package midterm2020_2021;

import static org.junit.Assert.*;

import org.junit.*;

public class MessageGarblerTest {

    @Test
    public void testExampleA() {
        String message = "attack the coatis.";
        MessageGarbler mg = new MessageGarbler(3);
        String expected = "ttakcaht c etao.si";
        String encoded = new String(mg.encrypt(message.toCharArray()));
        assertEquals(expected, encoded);
    }

    @Test
    public void testExampleB() {
        String message = "attack the coatis.";
        MessageGarbler mg = new MessageGarbler(4);
        String expected = "attat kcc ehitao.s";
        String encoded = new String(mg.encrypt(message.toCharArray()));
        assertEquals(expected, encoded);
    }
}
