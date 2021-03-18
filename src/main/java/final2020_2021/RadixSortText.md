The coatis and owls have managed to settle their differences and the two nations have started to cooperate with each other.
One of the projects between the nations involves the exchange of students, for this purpose the coatis have given the owls a list of student IDs.

These IDs are in the form of a string containing 4 letters and 2 digits, where the digits are always at the third and fifth position in the string. For example, "BC4D2A".

However, coatis are quite unorganized just like their relatives, the raccoons. Which is why they didn’t bother sorting the student IDs before handing them over to the owls.
The owls on the other hand are known to be really smart, organized, and fussy, so they would like to have these student IDs sorted in a particular order.

The owls would like to have the letters in the student IDs sorted in ascending order and the digits in the student IDs sorted in ascending order.

For example, given the strings:

"AA1B3B", "AB2A4B", "BC4D2A", "AB1B3B", "AB2A4A", "AC1B3B", "AC1D4B"
The sorted output would be:

"AA1B3B", "AB1B3B", "AB2A4A", "AB2A4B", "AC1B3B", "AC1D4B", "BC4D2A"
This alone would not be enough to demonstrate the fussiness of owls, as they also require the sorting of the student IDs to be done specifically by using radix sort starting from the most significant digit.

Your task is to implement the method sortStudentIds(List<String> studentIds), which takes as input a list of strings representing the student IDs and outputs a list containing these student IDs in the correct order, sorted using MSD radix sort.

IMPORTANT:

Your code will be manually checked to see if you have actually implemented the MSD radix sort algorithm.
You are not allowed to use a sorting algorithm from the Java library. If you do this, your grade will be overridden to 0.
Your solution will be manually checked to see if you have actually implemented the exercise and have not cheated the spec-test system in any way. Depending on that, points may be deducted.