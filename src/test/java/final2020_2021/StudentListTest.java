package final2020_2021;

import static org.junit.Assert.*;

import java.util.*;
import java.util.function.*;

import org.junit.*;

public class StudentListTest {


    @Test
    public void oneElement() {
        StudentList list = new StudentList();
        list.addFirst(42);
        assertEquals(42, list.getHead().getId());
        assertEquals(42, list.getTail().getId());
    }

    @Test
    public void twoElements() {
        StudentList list = new StudentList();
        list.addFirst(3);
        list.addFirst(4);
        assertEquals(3, list.removeLast());
        assertEquals(4, list.removeLast());
    }

    @Test
    public void getPosition() {
        StudentList list = new StudentList();
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(1, list.getStudentAtSeat(0));
        assertEquals(2, list.getStudentAtSeat(1));
    }
}
