package questions.Array;

public class TrappingRainWater {
    public int solve(int[] arr) {
        int[] leftMaxArr = new int[arr.length];
        int[] rightMaxArr = new int[arr.length];

        leftMaxArr[0] = arr[0];
        rightMaxArr[arr.length - 1] = arr[arr.length - 1];
//        identify left max for each element
        for (int i = 1; i < arr.length; i++)
            leftMaxArr[i] = Math.max(leftMaxArr[i - 1], arr[i]);
//        identify right max for each element
        for (int i = arr.length - 2; i >= 0; i--)
            rightMaxArr[i] = Math.max(rightMaxArr[i + 1], arr[i]);

//        count the total capacity
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            total += Math.min(leftMaxArr[i], rightMaxArr[i]) - arr[i];
        return total;
    }
    public int solve2(int[] arr) {
        int leftMax = 0, rightMax = 0, start = 0, end = arr.length - 1;
        int total = 0;
        while (start <= end) {
            if (arr[start] < arr[end]) {
                if (arr[start] > leftMax)
                    leftMax = arr[start];
                else
                    total += leftMax - arr[start];
                start++;
            } else {
                if (arr[end] > rightMax)
                    rightMax = arr[end];
                else
                    total += rightMax - arr[end];
                end--;
            }
        }
        return total;
    }
}
