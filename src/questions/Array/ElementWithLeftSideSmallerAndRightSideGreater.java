package questions.Array;

public class ElementWithLeftSideSmallerAndRightSideGreater {
    public int solve (int[] arr, int n) {
        int element = -1;
        int max = arr[0];

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= max) {
                boolean flag = true;
                // if (i + 1 != size)
                for (int j = i + 1; j < n; j++){
                    if (arr[i] > arr[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    element = arr[i];
                    break;
                } else {
                    max = arr[i];
                }
            }
        }
        return element;
    }
}
