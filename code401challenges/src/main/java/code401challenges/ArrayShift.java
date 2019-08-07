package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded) {
        int midIndex = arrToBeShifted.length / 2;;
        //need to add 1 to midIndex if input array length is odd.
        if (arrToBeShifted.length % 2 != 0) {
             midIndex++;
        }
        int[] results = new int[arrToBeShifted.length + 1];
        System.out.println("the size of results[] is: " + results.length);
        for (int i = 0; i < midIndex; i ++) {
            results[i] = arrToBeShifted[i];
        }
        System.out.println("results[] after left loop: " + Arrays.toString(results));
        results[midIndex] = intToBeAdded;
        System.out.println("results[] after middle: " + Arrays.toString(results));
        for (int l = midIndex + 1; l < results.length; l++) {
            results[l] = arrToBeShifted[l-1];
        }
        System.out.println("results[] after right loop: " + Arrays.toString(results));
        return results;
    }
}
