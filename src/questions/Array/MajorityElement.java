package questions.Array;

public class MajorityElement {
    public int solve(int[] arr, int n) {

        int element = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == element) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    element = arr[i];
                    count = 1;
                }
            }
        }

        int checkCounter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                checkCounter++;
            }
        }

        if (checkCounter > n / 2) {
            return element;
        }
        return -1;
    }
}
