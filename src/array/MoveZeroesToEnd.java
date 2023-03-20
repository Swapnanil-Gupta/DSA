package array;

import java.util.Arrays;

public class MoveZeroesToEnd {
  public static int moveZeroes(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[count];
        arr[count] = arr[i];
        arr[i] = temp;

        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 0, 0, 0, 20, 30, 0 };
    int res = moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(res);
  }
}
