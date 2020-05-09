//package week3;
//
//import java.util.*;
//
//class StackToQueue<T> {
//    private Stack<T> s1 = new LibraryStack<>();
//    private Stack<T> s2 = new LibraryStack<>();
//
//    /**
//     * @return true iff there are no elements left.
//     */
//    public boolean isEmpty() {
//        boolean res;
//        if(s1.isEmpty() && s2.isEmpty()) return res = true;
//        res = false;
//        return res;
//    }
//
//    /**
//     * @return the number of elements in the queue.
//     */
//    public int size() {
//        if (isEmpty()) return 0;
//        return (s1.size() + s2.size());
//    }
//
//    /**
//     * Adds an element to the queue.
//     *
//     * @param i
//     *     element to enqueue.
//     */
//    public void enqueue(T i) {
//        if (s1.size() == 0) s1.push(i);
//        else {
//            T temp = s1.pop();
//            while(s2.size() != 0) s1.push(s2.pop());
//            s2.push(temp);
//            while(s1.size() != 0) s2.push(s1.pop());
//            s1.push(i);
//        }
//    }
//
//    /**
//     * Removes the first element from the queue.
//     *
//     * @return the first element from the queue.
//     * @throws NoSuchElementException
//     *     iff the queue is empty.
//     */
//    public T dequeue() throws NoSuchElementException {
//        if (s2.size() > 0) return s2.pop();
//        else if (s1.size() == 1) return s1.pop();
//        throw new NoSuchElementException();
//
//    }
//
//    /**
//     * Only returns (i.e. does not remove) the first element from the queue.
//     *
//     * @return the first element from the queue.
//     * @throws NoSuchElementException
//     *     iff the queue is empty.
//     */
//    public T first() throws NoSuchElementException {
//        if (s2.size() > 0) return s2.peek();
//        else if (s1.size() == 1) return s1.peek();
//        else throw new NoSuchElementException();
//    }
//}
//
///**
// * DO NOT MODIFY
// * Interface for a Stack.
// *
// * @param <T>
// *     Type of elements the Stack can hold
// */
//interface Stack<T> {
//    /**
//     * @return true iff it contains no elements.
//     */
//    public boolean isEmpty();
//
//    /**
//     * @return the number of elements in the stack.
//     */
//    public int size();
//
//    /**
//     * Add an element to the top of the stack
//     *
//     * @param e
//     *     element to push.
//     */
//    public void push(T e);
//
//    /**
//     * Removes the top element from the stack.
//     *
//     * @return the first element.
//     * @throws NoSuchElementException
//     *     iff the stack is empty
//     */
//    public T pop() throws NoSuchElementException;
//
//    /**
//     * @return the top element (does not pop it).
//     * @throws NoSuchElementException
//     *     iff the stack is empty
//     */
//    public T peek() throws NoSuchElementException;
//}