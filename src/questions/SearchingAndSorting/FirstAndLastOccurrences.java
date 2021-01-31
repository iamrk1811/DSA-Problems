package questions.SearchingAndSorting;

public class FirstAndLastOccurrences {
    public int solve(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;

    }
}
