package questions.Array;

public class NextPermutation {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] solve(int[] nums) {
//        check either we have a first deepest point or not
        int deepestPointDigitIndex = -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                deepestPointDigitIndex = i - 1;
                break;
            }
        }
        if (deepestPointDigitIndex == -1) {
            int start = 0, end = nums.length - 1;
            while (start <= end) {
                swap(nums, start, end);
                start++;
                end--;
            }
            return nums;
        }

        int justGreaterIndex = -1;
        for (int i = nums.length - 1; i >= deepestPointDigitIndex; i--) {
            if (nums[deepestPointDigitIndex] < nums[i]) {
                justGreaterIndex = i;
                break;
            }
        }

        swap(nums, deepestPointDigitIndex, justGreaterIndex);

//        1425 -> deepest digit is = 2 and just greater is 5
//        if we swap these two value then our number will be 1452
//        and again if we reverse the rest of the part then number will be
//        = 1425 which is the same as our input;
//        so when this situation occur, then after swapping the values just return
        if (nums.length - deepestPointDigitIndex == 2) return nums;

//        Now reverse the rest of the part
        int start = deepestPointDigitIndex + 1, end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }

        return nums;
    }
}
