package week2.tutorials;

import java.util.*;

class LibraryStack {

    List<String> items;

    public LibraryStack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void push(String s) {
        this.items.add(s);
    }

    public String pop() {
        return this.items.remove(this.items.size() - 1);
    }

    public String top() {
        return this.items.get(this.items.size() - 1);
    }
}

class LibraryQueue {

    List<String> items;

    public LibraryQueue() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void enqueueFront(String s) {
        this.items.add(0, s);
    }

    public void enqueueBack(String s) {
        this.items.add(s);
    }

    public String dequeue() {
        return this.items.remove(0);
    }

    public String first() {
        return this.items.get(0);
    }
}
