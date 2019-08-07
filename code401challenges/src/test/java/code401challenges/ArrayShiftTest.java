package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void arrayShift() {
        assertArrayEquals(new int[] {1, 2, 3, 4}, ArrayShift.arrayShift(new int[] {1, 2, 4}, 3));
        assertArrayEquals(new int[] {2, 4, 5, 6, 8}, ArrayShift.arrayShift(new int[] {2, 4, 6, 8}, 5));
        assertArrayEquals(new int[] {4, 8, 15, 16, 23, 42}, ArrayShift.arrayShift(new int[] {4,8,15,23,42}, 16));
        assertArrayEquals(new int[] {1}, ArrayShift.arrayShift(new int[] {}, 1));
    }
}