Implement a method count which, given an array of integer elements, returns another array containing the number of occurrences of each integer {0, ..., r} in the input array, where r is an integer to show the upper boundary of the integers that you need to count.

The returned array of counts will be of size r + 1, where the element at each index i corresponds to the number of occurrences of integer i (with i in {0, ..., r}).

Elements in the input array outside of the integer range from 0 to r can be ignored.

For example, given the input [0, 8, 1, 3, 1, 3, 10, 3] with r is 4, the output should be [1, 2, 0, 3, 0].

If the input array is null or of length 0, this will return null.

Space requirements: Method count should only use additional space for the count array.

Time requirements: The counts should be calculated in a single pass through the input array.

IMPORTANT: In an exam setting, your grade for this exercise would be overridden to 1, if you don’t satisfy the requirements mentioned above.