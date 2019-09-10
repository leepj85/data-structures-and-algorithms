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
