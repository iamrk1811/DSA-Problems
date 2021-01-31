package questions.SearchingAndSorting;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FindPairGivenDifference {
    public void solve1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            int[] arr = new int[size];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < size; i++) map.put(arr[i], i);

            boolean flag = false;

            for (int i = 0; i < arr.length; i++) {
                int x = arr[i] - target;

                if (map.containsKey(x)) {
                    if (map.get(x) != i) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) System.out.println(1);
            else System.out.println(-1);
        }
    }

    public void solve2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            int[] arr = new int[size];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            boolean flag = false;
            for (int i = size - 1; i >= 0; i--) {
                int x = arr[i] - target;
                int result = binarySearch(arr, x);
                if (result == 1) {
                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            if (!flag) System.out.println("-1");
        }

    }
    private int binarySearch ( int[] arr, int target){
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return 1;

            if (target < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}

