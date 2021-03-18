package AdditionalPractice;

import java.util.*;

public class SLList<T> {
    class Node {
        // Each Node object has these two fields
        private T element;
        private Node next;

        // Constructor: Creates a Node object with element = e and next = n
        Node(T e, Node n) {
            element = e;
            next = n;
        }

        // This function gets T e as input and sets e as the element of the Node
        public void setElement(T e) {
            element = e;
        }

        // This function returns the element variable of the Node
        public T getElement() {
            return element;
        }

        // This function gets Node n as input and sets the next variable of the current Node object as n.
        public void setNext(Node n) {
            next = n;
        }

        // This function returns the next Node
        public Node getNext() {
            return next;
        }
    }

    // Each object in SLList has one field head, which points to the starting Node of SLList.
    private Node head;

    /**
     * Constructor: initialises the head field as null
     */
    public SLList() {
        head = null;
    }

    /**
     * @return The element in the first Node of this SLL. If the list is empty, this method returns null.
     */
    public T getFirst() {
        if (head == null)
            return null;
        return head.getElement();
    }

    /**
     * Adds element e in a new Node to the head of the list.
     *
     * @param e The element to add.
     */
    public void addFirst(T e) {
        // list can be empty
        if (getFirst() == null) {
            // if the list is empty, create new node and make it the head
            // and link it to null
            Node newNode = new Node(e, null);
            this.head = newNode;
        }
        // list is not empty
        else {
            // create new node, link it to head
            Node newNode = new Node(e, head);
            // make newnode the head
            this.head = newNode;
        }
    }

    /**
     * Remove the first Node in the list and return its element.
     *
     * @return The element of the first Node. If the list is empty, this method returns null.
     */
    public T removeFirst() {
        // if the list empty, return null
        if (getFirst() == null) return null;
        else {
            // else get the head and put its element in temp var
            // make the head.next the new head
            T returnElement = head.getElement();
            head = head.getNext();
            return returnElement;
        }
    }

    /**
     * Combine this list with the other list.
     * Each element of the resulting list is a Pair object holding one element of this list
     * and the corresponding element at the same position of the other list.
     * If one list is longer than the other, any extra elements should be dropped.
     * Example: Zipping [1, 2] with [5, 6, 7] results in [(1, 5), (2, 6)], where (x, y) denotes a Pair object.
     *
     * @param other The other list to combine elements with. Is treated as an empty list if it is null.
     * @return A new list with alternated elements of this list and the other list.
     */
    public SLList<Pair<T, T>> zip(SLList<T> other) {
        SLList<Pair<T,T>> zippedList = new SLList<>();
        if (other == null || this.getFirst() == null) return zippedList;
        SLList<T> temp1 = new SLList<>();
        SLList<T> temp2 = new SLList<>();
        Node current = head;
        Node otherCurrent = other.head;
        // while firstlist has elements removefirst of this and add to temp1
        // while firstlist has elements removefirst of other nd add to temp2
        while(current != null && otherCurrent != null) {
            temp1.addFirst(this.removeFirst());
            temp2.addFirst(other.removeFirst());
            current = head;
            otherCurrent = other.head;
        }
        // while temp1 has elements addfirst(new pair temp1 and temp2)
        Node temp1Current = temp1.head;
        while (temp1Current != null) {
            Pair<T,T> newPair = new Pair<>(temp1.removeFirst(), temp2.removeFirst());
            zippedList.addFirst(newPair);
            temp1Current = temp1.head;
        }
        return zippedList;
    }

    /**
     * Appends another SLL to this SLL.
     *
     * @param other The list to append to this list. Is treated as an empty list if it is null.
     */
    public void append(SLList<T> other) {
        // if other list is null return
        if (other == null) return;
        else {
            // loop to the end of first list
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // for loop appending elements of second list one-by-one
            Node otherCurrent = other.head;
            current.setNext(otherCurrent);
            while (otherCurrent.getNext() != null) {
                current.setNext(otherCurrent);
                otherCurrent = otherCurrent.getNext();
            }
        }
    }

    /**
     * Removes all elements at the even positions in this list.
     * Note that the head of the list is element number 0, which is an even position.
     */
    public void dropEven() {
        // list is null or first element is null return
        if (getFirst() == null) return;
            // else drop every i % 2 == 0 element
            // when i % 2 == 0 connect previous to next
            // else advance
        else {
            Node previous = head;
            Node current = head;
            Node next = head;

            int i = 0;
            while (current != null) {
                if (i == 0) {
                    head = head.getNext();
                    previous = current;
                    current = current.getNext();
                    if (current != null) next = current.getNext();
                } else if ((i % 2) == 0) {
                    previous.setNext(next);
                    previous = current;
                    current = current.getNext();
                    if (current != null) next = current.getNext();
                } else {
                    previous = current;
                    current = current.getNext();
                    if (current != null) next = current.getNext();
                }
                i++;
            }
        }
    }
}