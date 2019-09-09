package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] arr = new int[]{4,2,3,5,1};
        int[] check = new int[]{1,2,3,4,5};
        assertArrayEquals(check, InsertionSort.insertionSort(arr));
    }
}