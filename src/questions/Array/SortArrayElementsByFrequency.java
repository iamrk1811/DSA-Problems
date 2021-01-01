package questions.Array;

import java.lang.reflect.Array;
import java.util.*;

class Pair implements Comparable<Pair> {
    int frequency;
    int element;
    public Pair(int element, int frequency) {
        this.frequency = frequency;
        this.element = element;
    }
    public int compareTo(Pair other) {
        if (this.frequency > other.frequency) {
            return 1;
        } else if (this.frequency < other.frequency) {
            return -1;
        } else {
            if (this.element < other.element) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
public class SortArrayElementsByFrequency {
    public ArrayList<Integer> sortByFreqUsingHashAndHeap(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map=  new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());

        for (Integer element: map.keySet()) {
            int frequency = map.get(element);
            Pair temp = new Pair(element, frequency);

            pq.add(temp);
        }

        while (pq.size() > 0) {
            Pair temp = pq.remove();

            int element = temp.element;
            int frequency = temp.frequency;

            for (int i = 1; i <= frequency; i++) {
                list.add(element);
            }
        }

        return list;
    }

    public ArrayList<Integer> sortFrequencyUsingSortingAnd(int[] arr, int n) {
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int distinctElementCount = 1;
        int currentElement = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] != currentElement) {
                currentElement = arr[i];
                distinctElementCount++;
            }
        }
//        System.out.println(distinctElementCount);
        int[][] twoD = new int[distinctElementCount][2];

        int rowIndex = 0;
        currentElement = arr[0];

        twoD[rowIndex][0] = currentElement;
        twoD[rowIndex][1] = 1;

        for (int i = 1; i < n; i++) {
            if (currentElement != arr[i]) {
                currentElement = arr[i];
                rowIndex++;
                twoD[rowIndex][0] = currentElement;
                twoD[rowIndex][1] = 1;
            } else {
                twoD[rowIndex][1]++;
            }
        }
//        for (int[] x: twoD) {
//            System.out.println(Arrays.toString(x));
//        }

        Arrays.sort(twoD, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return -1;
                } else if (o1[1] < o2[1]) {
                    return 1;
                } else {
                    if (o1[0] < o2[0]) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
//        for (int[] x: twoD) {
//            System.out.println(Arrays.toString(x));
//        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < distinctElementCount; i++) {
            int element = twoD[i][0];
            int frequency = twoD[i][1];

            for (int j = 1; j <= frequency; j++) {
                list.add(element);
            }
        }

        return list;
    }
}
