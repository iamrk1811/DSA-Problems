package questions.Array;

import java.util.ArrayList;

public class MergeTwoSortedArrayWithoutExtraSpace {
    private int gap(int gap) {
        if (gap <= 1) return 0;
        return gap / 2 + gap % 2;
    }
    public ArrayList<int[]> solve(int[] arr1, int[] arr2) {
        ArrayList<int[]> res = new ArrayList<>();
        int m = arr1.length, n = arr2.length;
        int i, j, gap = (m + n) / 2 + (m + n) % 2;
//        outer loop
        for (; gap > 0; gap = gap(gap)) {
//            inside the first array
            for (i = 0; i + gap < m; i++) {
                if (arr1[i] > arr1[i + gap]) swap(arr1, arr1, i, i + gap);
            }
//            inside both the arrays
            for (j = gap > m ? gap - n : 0; i < m && j < n; i++, j++) {
                if (arr1[i] > arr2[j]) swap(arr1, arr2, i, j);
            }
//            inside the the second array
            if (j < n) {
                for (j = 0; j + gap < n; j++) {
                    if (arr2[j] > arr2[j + gap] ) swap(arr2, arr2, j, j + gap);
                }
            }
        }
        res.add(arr1); res.add(arr2);
        return res;
    }
    private void swap(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
