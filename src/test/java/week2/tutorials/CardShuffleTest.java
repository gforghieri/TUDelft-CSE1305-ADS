package week2.tutorials;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class CardShuffleTest {

    @Test
    public void testFourCards() {
        List<Card> deck = new ArrayList<>(Arrays.asList(new Card(1, 0), new Card(1, 1), new Card(1, 2), new Card(1, 3)));
        List<Card> res = new ArrayList<>(Arrays.asList(new Card(1, 0), new Card(1, 2), new Card(1, 1), new Card(1, 3)));

        assertEquals(res, CardShuffle.cardShuffle(deck));
    }

   @Test
   public void testOneSuit() {
     List<Card> deck = new ArrayList<>();
     List<Card> res = new ArrayList<>();
     for (int i = 1; i <= 13; i++) {
       deck.add(new Card(i, 0));
     }
     for (int i = 1; i <= 13; i++) {
       deck.add(new Card(i, 1));
     }
     for (int i = 1; i <= 13; i++) {
       res.add(new Card(i, 0));
       res.add(new Card(i, 1));
     }
     assertEquals(res, CardShuffle.cardShuffle(deck));
   }
}

