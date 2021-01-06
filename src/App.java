import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import questions.Array.MedianOfTwoSortedArray;
import questions.Array.MedianOfTwoSortedArray;
public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {3, 5};

//        int n = arr.length;
        System.out.println(obj.solve1(arr1, arr2));

    }
}
