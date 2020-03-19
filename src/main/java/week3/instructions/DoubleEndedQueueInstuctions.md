Read Chapter 6.3 (page 229) about double-ended queues of the book.

Implement a double-ended queue using a circularly linked list.

We have provided you the skeleton of class DoubleEndedQueue which you need to modify. You are expected to complete the implementation of this class by completing following methods:

size()
isEmpty()
getFirst()
getLast()
addFirst(T element)
addLast(T element)
removeFirst()
removeLast()
You can check the comments in the code to see what each method is expected to do.

You can implement the methods of DoubleEndedQueue using a CLList class that has been provided to you via the hidden library code. CLList implements the interface PositionList.

The PositionList interface has the following methods:

size()
isEmpty()
getFirst()
getLast()
getNext(Position<T> p)
getPrev(Position<T> p)
addFirst(T o)
addLast(T o)
addAfter(Position<T> p, T o)
addBefore(Position<T> p, T o)
remove(Position<T> p)
set(Position<T> p, T o)
In the second half of the solution template (after the first DO NOT MODIFY), you can find code descriptions for the Deque interface, PositionList interface, and Position interface.