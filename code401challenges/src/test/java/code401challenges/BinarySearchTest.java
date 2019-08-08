package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        assertEquals("test if key is left of middle", 1,
                BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 2));
        assertEquals("test if key is right of middle", 5,
                BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 6));
        assertEquals("test if key is at middle", 3,
                BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 4));
        assertEquals("test if key is not found", -1,
                BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 9));
        assertEquals("test if key at the beginning", 0,
                BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 1));
        assertEquals("test if key at the end", 6,
                BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 7));
    }

}
