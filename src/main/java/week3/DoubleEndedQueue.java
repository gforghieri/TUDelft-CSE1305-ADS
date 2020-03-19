package week3;

/**
 * Implementation of a double ended queue.
 *
 * @param <T>
 *     Type of elements the queue can hold
 */
class DoubleEndedQueue<T> implements Deque<T> {
    /**
     * Position-based list to keep the elements of the queue
     */
    private final PositionList<T> list;

    /**
     * Constructs a new queue.
     * Chooses a circular linked list as an implementation of a position-based list.
     */
    public DoubleEndedQueue() {
        this.list = new CLList<>();
    }

    /**
     * @return the number of elements in the queue.
     */
    @Override
    public int size() { // y
        return list.size();
    }

    /**
     * @return true iff the queue contains no elements.
     */
    @Override
    public boolean isEmpty() { // y
        return list.isEmpty();
    }

    /**
     * @return the element at the front of the queue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    @Override
    public T getFirst() throws EmptyDequeException { // y
        if (list.getFirst() == null) throw new EmptyDequeException();
        return list.getFirst().getElement();
    }

    /**
     * @return the element at the end of the queue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    @Override
    public T getLast() throws EmptyDequeException { // y
        if (list.getLast() == null) throw new EmptyDequeException();
        return list.getLast().getElement();
    }

    /**
     * Adds an element to the front of the queue.
     *
     * @param element
     *     to add.
     */
    @Override
    public void addFirst(T element) { // y
        list.addFirst(element);
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element
     *     to add.
     */
    @Override
    public void addLast(T element) { // y
        list.addLast(element);
    }

    /**
     * Removes and return the element at the front of the queue.
     *
     * @return the element at the front of the queue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    @Override
    public T removeFirst() throws EmptyDequeException {
        if (list.size() == 0) throw new EmptyDequeException();
        T res = list.remove(list.getFirst());
        if (res == null) throw new EmptyDequeException();
        return res;
    }

    /**
     * Removes and return the element at the end of the queue.
     *
     * @return the element at the end of the queue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    @Override
    public T removeLast() throws EmptyDequeException {
        if (list.size() == 0) throw new EmptyDequeException();
        T res = list.remove(list.getLast());
        if (res == null) throw new EmptyDequeException();
        return res;
    }
}

/**
 * DO NOT MODIFY
 * Interface for the double ended queue.
 */
interface Deque<T> {
    /**
     * @return the number of elements in the deque.
     */
    public int size();

    /**
     * @return true iff the deque contains no elements.
     */
    public boolean isEmpty();

    /**
     * @return the element at the front of the dequeue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    public T getFirst() throws EmptyDequeException;

    /**
     * @return the element at the end of the dequeue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    public T getLast() throws EmptyDequeException;

    /**
     * Adds an element to the front of the deque.
     *
     * @param element
     *     to add.
     */
    public void addFirst(T element);

    /**
     * Adds an element to the back of the deque.
     *
     * @param element
     *     to add.
     */
    public void addLast(T element);

    /**
     * Removes and return the element at the front of the dequeue.
     *
     * @return the element at the front of the dequeue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    public T removeFirst() throws EmptyDequeException;

    /**
     * Removes and return the element at the end of the dequeue.
     *
     * @return the element at the end of the dequeue
     * @throws EmptyDequeException
     *     iff the queue is empty
     */
    public T removeLast() throws EmptyDequeException;
}

/**
 * DO NOT MODIFY
 * Interface for a node based list.
 *
 * @param <T>
 *     Type of elements the list can hold
 */
interface PositionList<T> {
    /**
     * @return the number of nodes/elements in the list.
     */
    public int size();

    /**
     * @return true iff the list is empty.
     */
    public boolean isEmpty();

    /**
     * @return the first node in the list or null if no such node exists.
     */
    public Position<T> getFirst();

    /**
     * @return the last node in the list or null if no such node exists.
     */
    public Position<T> getLast();

    /**
     * Finds the next element in the list given a position.
     *
     * @param p
     *     position to find the next element of.
     * @return the next element of p.
     * @throws InvalidPositionException
     *     iff p is invalid.
     */
    public Position<T> getNext(Position<T> p) throws InvalidPositionException;

    /**
     * Finds the previous element in the list given a position.
     *
     * @param p
     *     position to find the previous element of.
     * @return the previous element of p.
     * @throws InvalidPositionException
     *     iff p is invalid.
     */
    public Position<T> getPrev(Position<T> p) throws InvalidPositionException;

    /**
     * Adds an element to the front of the list.
     *
     * @param o
     *     element to add.
     */
    public void addFirst(T o);

    /**
     * Adds an element to th end of the list.
     *
     * @param o
     *     element to add.
     */
    public void addLast(T o);

    /**
     * Adds an element after a specified position.
     *
     * @param p
     *     position to place element after.
     * @param o
     *     element to insert.
     * @throws InvalidPositionException
     *     iff p is invalid.
     */
    public void addAfter(Position<T> p, T o) throws InvalidPositionException;

    /**
     * Adds an element before a specified position.
     *
     * @param p
     *     position that the element should be placed in front of.
     * @param o
     *     element to insert.
     * @throws InvalidPositionException
     *     iff p is invalid.
     */
    public void addBefore(Position<T> p, T o) throws InvalidPositionException;

    /**
     * Removes a position from the list.
     *
     * @param p
     *     position to remove.
     * @return the element of p.
     * @throws InvalidPositionException
     *     if p is invalid
     */
    public T remove(Position<T> p) throws InvalidPositionException;

    /**
     * Changes the value of the given position to the given element.
     *
     * @param p
     *     position to change the value of.
     * @param o
     *     the new element for p.
     * @return the old element of p.
     * @throws InvalidPositionException
     *     iff p is invalid.
     */
    public T set(Position<T> p, T o) throws InvalidPositionException;
}

/**
 * DO NOT MODIFY
 * Interface that represents a node in the list.
 *
 * @param <T>
 *     Type of element to hold
 */
interface Position<T> {
    T getElement();
}

