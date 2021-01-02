package questions.Array;

public class FindSmallestPositiveNumber {
    public int solve(int[] arr, int n) {
        int i = 0;

        while (i < n) {
            if (arr[i] > 0 && arr[i] <= n) {
                 int index = arr[i] - 1;
                 int prev = arr[i];
                 swap(arr, i, index);
                 if (arr[i] == i + 1 || arr[i] > n || prev == arr[i]) {
                     i++;
                 }
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return n + 1;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
