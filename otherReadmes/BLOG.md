# Merge Sort
Merge sort is one of the most efficient sorting techniques and it's based on the “divide and conquer” paradigm.

## Learning Objectives
Learn how to implement a merge sort algorithm for a list data structure.

### Algorithm
The algorithm can be described as the following 2 step process:

* Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
* Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.

### Pseudocode

ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left


### Readings and References
* Watch
  * https://www.youtube.com/watch?v=JSceec-wEyw

* Read
  * https://www.baeldung.com/java-merge-sort
  * https://en.wikipedia.org/wiki/Merge_sort

---

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
  

