package questions.Array.Matrix;

public class SearchIn2DMatrix {
    public boolean solve(int[][] arr, int target) {
//        assume that every row is sorted
//        so i can apply binary search over this array

        for (int i = 0; i < arr.length; i++) {
            int[] oneArray = arr[i];
            boolean result = binarySearch(oneArray, target);

            if (result)
                return true;
        }
        return false;
    }
    boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public boolean solve2(int[][] arr, int target) {
        int low = 0, high = arr.length * arr[0].length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / arr[0].length;
            int column = mid % arr[0].length;

            if (arr[row][column] == target) {
                return true;
            } else if (target < arr[row][column]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
