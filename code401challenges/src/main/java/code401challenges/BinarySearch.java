package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int mid = 0;
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] < key) {
                min = mid + 1;
            } else if (arr[mid] > key) {
                max = mid - 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }
}
