import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] test1 = new int[] {1, 2, 3, 4, 5, 6};
    int[] test2 = new int[] {89, 2354, 3546, 23, 10, -923, 823, -12};
    int[] test3 = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
    int[] test4 = new int[0];

    System.out.println(Arrays.toString(reverseArray(test1)));
    System.out.println(Arrays.toString(reverseArray(test2)));
    System.out.println(Arrays.toString(reverseArray(test3)));
    System.out.println(Arrays.toString(reverseArray(test4)));
  }

  public static int[] reverseArray(int[] arr) {
    int[] temp = new int[arr.length];
    // System.out.println("temp array size = " + temp.length);
    for (int i = temp.length - 1; i >= 0; i--) {
      // System.out.println(i);
      temp[temp.length - 1 - i] = arr[i];
    }
    return temp;
  }
}