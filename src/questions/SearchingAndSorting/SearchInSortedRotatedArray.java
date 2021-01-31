package questions.SearchingAndSorting;

public class SearchInSortedRotatedArray {
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] >= arr[low]) {
//                left increasing order
                if (target <= arr[mid] && target >= arr[low])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
//                right increasing order
                if (target >= arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}
