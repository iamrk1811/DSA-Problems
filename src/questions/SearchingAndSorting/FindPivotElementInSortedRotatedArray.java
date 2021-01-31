package questions.SearchingAndSorting;

public class FindPivotElementInSortedRotatedArray {
    public int find(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= nums[high]){
//                 increasing order graph, so value will be lie on the left side
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[high];
    }
}
