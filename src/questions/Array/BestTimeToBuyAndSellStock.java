package questions.Array;

public class BestTimeToBuyAndSellStock {
    public int solve(int[] arr) {
        int maxProfit = 0;
        int buyAt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (buyAt > arr[i]) buyAt = arr[i];
            else if (maxProfit < arr[i] - buyAt) maxProfit = arr[i] - buyAt;
        }
        return maxProfit;
    }
}
