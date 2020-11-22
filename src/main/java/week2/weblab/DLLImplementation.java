package week2.weblab;

class DLLImplementation {
    class Node {
        // Each node object has these three fields
        private Object element;
        private Node previous;
        private Node next;

        // Constructor: Creates a Node object with element = e, previous = p and next = n
        Node(Object e, Node p, Node n) {
            element = e;
            previous = p;
            next = n;
        }

        // This function gets Object e as input and sets e as the element of the Node
        public void setElement(Object e) {
            element = e;
        }

        // This function returns the element variable of the Node
        public Object getElement() {
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

        // This function gets Node p as input and sets the previous variable of the current Node object as p.
        public void setPrevious(Node p) {
            previous = p;
        }

        // This function returns the previous Node
        public Node getPrevious() {
            return previous;
        }

//        @Override
//        public String toString() {
//            return this.element.toString();
//        }
    }

    // Each object in DLList has one field head, which points to the starting Node of DLList.
    private Node head;
    // Each object in DLList has one field tail, which points to the final Node of DLList.
    private Node tail;

    /**
     * Constructor: initialises the head and tail fields as null
     */
    public DLLImplementation() {
        head = null;
        tail = null;
    }

    /**
     * @return The element in the head Node of the DLL
     */
    public Object getHead() {
        return head.getElement();
    }

    /**
     * @return The element in the tail Node of the DLL
     */
    public Object getTail() {
        return tail.getElement();
    }

    /**
     * Adds element e in a new Node to the head of the list.
     *
     * @param e The element to add.
     */
    public void addFirst(Object e) {
        Node newHead;
        if (size() == 0) {
            newHead = new Node(e, null, null);
            head = newHead;
            tail = newHead;
        } else {
            newHead = new Node(e, null, head);
            head.setPrevious(newHead);
            head = newHead;
        }
    }

    /**
     * Remove the first Node in the list and return its element.
     *
     * @return The element of the head Node. If the list is empty, this method returns null.
     */
    public Object removeFirst() {
        if (size() == 0) return null;
        Object toReturn = head.getElement();
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.getPrevious().setNext(null);
            head.setPrevious(null);
        }
        return toReturn;
    }

    /**
     * Adds element e in a new Node to the tail of the list.
     *
     * @param e The element to add.
     */
    public void addLast(Object e) {
        if (size() == 0) addFirst(e);
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node last = new Node(e, current, null);
            current.setNext(last);
            tail = last;
        }
    }

    /**
     * Remove the last Node in the list and return its element.
     *
     * @return The element of the tail Node. If the list is empty, this method returns null.
     */
    public Object removeLast() {
        if (size() == 0) {
            return null;
        }
        Node current = head;
        if (size() == 1) {
            head = null;
            tail = null;
        } else {
            while (current.next != null) {
                current = current.next;
            }

            tail = current.getPrevious();
            current.setPrevious(null);
            tail.setNext(null);
        }
        return current.getElement();
    }


    /**
     * @return the number of Nodes in the list
     */
    public int size() {
        int res = 0;
        Node current = head;

        while (current != null) {
            current = current.getNext();
            res++;
        }
        return res;
    }

    /**
     * Adds element e in a new Node which is inserted at position pos.
     * The list is zero indexed, so the first element in the list corresponds to position 0.
     * This also means that `addAtPosition(0, e)` has the same effect as `addFirst(e)`.
     * If there is no Node in position pos, this method adds it to the last position.
     *
     * @param pos The position to insert the element at.
     * @param e   The element to add.
     */
    public void addAtPosition(int pos, Object e) {
        if (pos == 0) addFirst(e);
        else if (pos > size() - 1) addLast(e);
        else {
            int i = 0;
            Node current = head;
            while (i < pos) {
                current = current.next;
                i++;
            }
            Node toInsert = new Node(e, current.previous, current);
            current.previous.setNext(toInsert);
            current.setPrevious(toInsert);
        }
    }

    /**
     * Remove Node at position pos and return its element.
     * The list is zero indexed, so the first element in the list corresponds to position 0.
     * This also means that `removeFromPosition(0)` has the same effect as `removeFirst()`.
     *
     * @param pos The position to remove the Node from.
     * @return The element of the Node in position pos. If there is no Node in position pos, this method returns null.
     */
    public Object removeFromPosition(int pos) {
        if (pos == 0) return removeFirst();
        if (pos > size() - 1 || pos < 0) return null;
        if (pos == size() - 1) return removeLast();
        int i = 0;
        Node current = head;
        while (i < pos) {
            current = current.next;
            i++;
        }
        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        return current.getElement();
    }

    /**
     * @return A new DLL that contains the elements of the current one in reversed order.
     */
    public DLLImplementation reverse() {
        if (size() == 0) return null;
        DLLImplementation newDLL = new DLLImplementation();
        // custom addFirst
        Node current = head;
        Node newHead = new Node (current.getElement(), null, null);
        Node temp = newHead;
        for (int i = 0; i < size(); i++) {
            if (newDLL.size() == 0) {
                newDLL.head = newHead;
                newDLL.tail = newHead;
                current = current.next;
            } else {
                newHead = new Node(current.getElement(), null, temp);
                temp.setPrevious(newHead);
                newDLL.head = newHead;
                current = current.next;
                temp = newHead;
            }
        }
        return newDLL;
    }
}

