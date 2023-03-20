package array;

public class SecondLargestElement {
  public static int secondLargest(int[] arr) {
    int largest = arr[0];
    int sLargest = -1;
    for(int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        sLargest = largest;
        largest = arr[i];
      } else if (arr[i] < largest) {
        if (arr[i] > sLargest || sLargest == -1) {
          sLargest = arr[i];
        }
      }
    }
    return sLargest;
  }
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 10, 12, 30, 10 };
    System.out.println(secondLargest(arr));
  }
}
