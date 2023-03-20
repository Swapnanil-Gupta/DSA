package array;

import java.util.ArrayList;

public class LeadersInArr {
    public static ArrayList<Integer> getLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length - 1]);
        int maxKnownTillPoint = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxKnownTillPoint) {
                leaders.add(arr[i]);
                maxKnownTillPoint = arr[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = { 19, 10, 4, 10, 6, 5, 2 };
        System.out.println(getLeaders(arr));
    }
}
