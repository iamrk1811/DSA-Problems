package questions.SearchingAndSorting;

import java.util.Arrays;

public class CountTripletsSmallerThanX {
    public int solve(int[] arr, int sum) {
        Arrays.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1, right = arr.length - 1;

            while (left < right) {
                int total = arr[i] + arr[left] + arr[right];
                if (total < sum) {
                    counter += right - left;
                    left++;
                }
                if (total >= sum) right--;
            }
        }

        return counter;
    }
}
