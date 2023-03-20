package array;

import java.util.Arrays;

public class ReverseArray {
  public static void reverse(int[] arr) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 4, 5, 6};
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }
}
