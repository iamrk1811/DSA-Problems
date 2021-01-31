package questions.SearchingAndSorting;

public class SearchAnElementWhereAdjacentDifferByAtMostK {
    public int solve(int[] arr, int k, int x) {

        int i = 0;
        while(i < arr.length) {
            if (arr[i] == x) return i;

            i += Math.max(1, Math.abs(arr[i] - x) / k);
        }

        return -1;
    }
}
