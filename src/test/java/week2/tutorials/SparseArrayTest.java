package week2.tutorials;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import week2.tutorials.House.*;
import week2.tutorials.Street.*;

public class SparseArrayTest {
    @Test
    public void testExample() {
        Street street = new Street(Arrays.asList("Ernie", "Cookie Monster", "Bert", "Count von Count", "Sam Eagle", "Statler", "Waldorf", "Big Bird", "Oscar the Grouch", "Elmo"));
        CookieList cookieList = new CookieList(street);
        cookieList.pruneStreet(Arrays.asList("Bert", "Sam Eagle", "Statler", "Waldorf", "Oscar the Grouch"));
        List<House> expected = Arrays.asList(new House(0, "Ernie"), new House(1, "Cookie Monster"), new House(3, "Count von Count"), new House(7, "Big Bird"), new House(9, "Elmo"));
        List<House> res = cookieList.listAllFriendlyHouses();
        assertEquals(expected, res);
    }

    @Test
    public void testNonInhabitants() {
        Street street = new Street(Arrays.asList("Ernie", "Cookie Monster", "Bert", "Count von Count", "Sam Eagle", "Statler", "Waldorf", "Big Bird", "Oscar the Grouch", "Elmo"));
        CookieList cookieList = new CookieList(street);
        cookieList.pruneStreet(Arrays.asList("Bert", "Grumpy", "Squidward", "Sam Eagle", "Statler", "Waldorf", "Eeyore", "Oscar the Grouch"));
        List<House> expected = Arrays.asList(new House(0, "Ernie"), new House(1, "Cookie Monster"), new House(3, "Count von Count"), new House(7, "Big Bird"), new House(9, "Elmo"));
        List<House> res = cookieList.listAllFriendlyHouses();
        assertEquals(expected, res);
    }
}

