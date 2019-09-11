package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortTest() {
        QuickSort qs = new QuickSort();
        int[] arr = new int[]{5, 3, 2, 4, 1};
        int[] sorted = new int[]{1, 2, 3, 4, 5};
        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(sorted, arr);
    }
}