package array;

public class ArraySorted {
  public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 3, 4, 6, 5, 5 };
    System.out.println(isSorted(arr));
  }
}
