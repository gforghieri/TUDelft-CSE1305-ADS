package final2020_2021;

class StudentList {

    private Student head;

    private Student tail;

    public Student getHead() {
        return head;
    }

    public Student getTail() {
        return tail;
    }

    /**
     * Adds a student with the given ID to the head of the list.
     *
     * @param id ID of student to add.
     */
    public void addFirst(int id) {
        Student newHead; // create newhead variable
        if (head == null) { // case 1 list is empty, so head is null
            newHead = new Student(id, null, null, null, null);
            head = newHead;
            tail = newHead;
        } else { // case 2 list is not empty so we have to link previous head and link new head to each other
            newHead = new Student(id, null, head);
            head.setPrevious(newHead);
            head = newHead;

            Student current = head;
            int counter = 0;
            while (current.getNext() != null) {
                if (counter == 3) {
                    head.setSkipAhead(current);
                }
                current = current.getNext();
                counter++;
            }
        }
    }

    /**
     * Remove the last student from the list and return their ID.
     *
     * @return The ID of the last student.
     * @throws EmptyListException If the list is empty.
     */
    public int removeLast() {
        if (tail == null) throw new EmptyListException();
        Student prev = tail.getPrevious();
        int id = tail.getId();
        if (prev != null)
            prev.setNext(null);
        tail = prev;
        return id;

        // if(tail == null) throw new EmptyListException();
        // if(tail == head) return removeFirst();

        // int id = tail.getId();
        // Student n = tail.getPrevious();
        // n.setNext(null);
        // tail = n;

        // return id;
    }

    /**
     * Returns the ID of the student at the given seat.
     *
     * @param seatNumber Seat to find student of.
     * @return The ID of the student at the given seat.
     * @throws IllegalSeatNumberException If there is no seat with this number.
     */
    public int getStudentAtSeat(int seatNumber) {
        // start looping from head, seatNumber is position "index" in list
        // loop with 3 ahead or 3 backwards
        // when seatNumber and currentIndex difference is less than 3 do .next max 2 times

        int pos = seatNumber;
        int id = -1;

        if (pos == 0) return head.getId(); // if first index return id of head;
        else if (pos < 0) throw new IllegalSeatNumberException(); // less then 0 index is invalid
            // also more than the size of the list is also invalid but we dont know size yet.
        else {
            int counter = 0;
            Student current = head;
            while ((pos - counter) >= 0) {
                if ((pos - counter) >= 3) {
                    // skipAhead
                    if (current.getSkipAhead() != null) {
                        current = current.getSkipAhead();
                        counter = counter + 3;
                    } else {
                        throw new IllegalSeatNumberException();
                    }
                } else if ((pos - counter) == 0) {
                    id = current.getId();
                    break;
                } else {
                    if (current.getNext() != null) {
                        current = current.getNext();
                        counter++;
                    } else {
                        throw new IllegalSeatNumberException();
                    }
                }
            }
        }
        return id;
    }


    /**
     * Remove the first Student in the list and return its element.
     *
     * @return The element of the head Student. If the list is empty, this method throws exception emptylist.
     */
    public int removeFirst() {
        if (head == null) throw new EmptyListException();
        ;
        Student next = head.getNext();
        int headId = head.getId();
        if (next != null)
            next.setPrevious(null);
        head = next;
        return headId;
    }
}
