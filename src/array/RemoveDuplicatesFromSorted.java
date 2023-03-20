package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {
  public static int removeDuplicates(int[] arr) {
    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[j] != arr[i]) {
        i++;
        arr[i] = arr[j];
      }
    }
    return i + 1;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {10, 20, 20, 30, 30, 40, 40, 40, 40};
    int res = removeDuplicates(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(res);
  }
}
