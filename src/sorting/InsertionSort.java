package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 13, 4, 53, 25, 2 };
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
