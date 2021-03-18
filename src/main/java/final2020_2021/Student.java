package final2020_2021;

import java.util.*;

public class Student {


    private int id;

    private Student next;

    private Student previous;

    private Student skipAhead;

    private Student skipBack;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, Student previous, Student next) {
        this(id);
        this.previous = previous;
        this.next = next;
    }

    public Student(int id, Student previous, Student next, Student skipBack, Student skipAhead) {
        this(id, previous, next);
        this.skipBack = skipBack;
        this.skipAhead = skipAhead;
    }

    public int getId() {
        return id;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public Student getPrevious() {
        return previous;
    }

    public void setPrevious(Student previous) {
        this.previous = previous;
    }

    public Student getSkipAhead() {
        return skipAhead;
    }

    public void setSkipAhead(Student skipAhead) {
        this.skipAhead = skipAhead;
    }

    public Student getSkipBack() {
        return skipBack;
    }

    public void setSkipBack(Student skipBack) {
        this.skipBack = skipBack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(next, student.next) && Objects.equals(previous, student.previous) && Objects.equals(skipAhead, student.skipAhead) && Objects.equals(skipBack, student.skipBack);
    }
}

class EmptyListException extends RuntimeException {

    private static final long serialVersionUID = 42L;
}

class IllegalSeatNumberException extends RuntimeException {

    private static final long serialVersionUID = 42L;
}
