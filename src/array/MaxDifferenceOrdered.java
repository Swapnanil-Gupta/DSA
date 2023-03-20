package array;

public class MaxDifferenceOrdered {
    public static int getMaxDiffOrd(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(getMaxDiffOrd(arr));
    }
}
