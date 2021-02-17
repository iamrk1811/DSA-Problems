package questions.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthSmallest(int[] arr, int low, int high, int k)
    {
        int pivotIndex = partition(arr, low, high);
        if (pivotIndex == k - 1) return arr[pivotIndex];
        if (k - 1 < pivotIndex) return kthSmallest(arr, low, pivotIndex - 1, k);
        else return kthSmallest(arr, pivotIndex + 1, high, k);
    }
    public static int partition(int[] arr, int low, int high) {
        int i = low, j = low, pivot = arr[high];

        while (i <= high) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++; j++;
            } else i++;
        }
        return j - 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int kthSmallestUsingHeap(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val: arr) pq.add(val);

        while (k > 1) {pq.remove(); k--;}

        return pq.remove();
    }
}
