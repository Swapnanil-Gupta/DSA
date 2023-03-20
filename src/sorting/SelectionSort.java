package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 13, 4, 53, 25, 2 };
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
