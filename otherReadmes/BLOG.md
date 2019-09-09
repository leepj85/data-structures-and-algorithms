# Insertion Sort
In place comparison-based sorting algorithm that sorts a list one item at a time. It is less efficient on large lists than other sorting algorithms such as quick sort, heap sort, and merge sort but more efficient than bubble sort and selection sort.

#### A few advantages of insertion:
  * Adaptive - efficient for data sets that are already substantially sorted or for small data sets.
  * Stable - does not change if the values are equal.
  * In-place - requires constant space O(1).

## Learning Objectives
Learn how to implement an insertion sort algorithm for a list data structure.

### Algorithm
Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.

### Pseudocode

    InsertionSort(int[] arr)

      FOR i = 1 to arr.length

        int j <-- i - 1
        int temp <-- arr[i]

        WHILE j >= 0 AND temp < arr[j]
          arr[j + 1] <-- arr[j]
          j <-- j - 1

        arr[j + 1] <-- temp

### Readings and References
* Watch
  * https://www.youtube.com/watch?v=OGzPmgsI-pQ 

* Read
  * https://en.wikipedia.org/wiki/Insertion_sort
