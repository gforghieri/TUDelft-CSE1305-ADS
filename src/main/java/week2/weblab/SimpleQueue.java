package week2.weblab;

import java.util.LinkedList;
// import java.util.List;
import java.lang.Exception;
import java.util.NoSuchElementException;

class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    /**
     * @return true iff the queue contains no elements.
     */
    public boolean isEmpty() {
        return this.list == null || this.list.size() == 0;
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element to add.
     */
    public void enqueue(T element) {
        list.addFirst(element);
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element at the front of the dequeue
     * @throws EmptyDequeException iff the queue is empty
     */
    public T dequeue() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException();
        return list.removeFirst();
    }
}