package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int[] arr = new int[]{5, 3, 2, 4, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }

    @Test
    public void mergeSortEmptyTest() {
        int[] arr = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }
}