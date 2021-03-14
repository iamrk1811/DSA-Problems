package questions.HashHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedList {
    static class Pair implements Comparable<Pair>{
        int listIndex;
        int dataIndex;
        int data;
        public Pair(int listIndex, int dataIndex, int data) {
            this.listIndex = listIndex;
            this.dataIndex = dataIndex;
            this.data = data;
        }
        @Override
        public int compareTo(Pair obj) {
            return this.data - obj.data;
        }
    }
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> list) {
        ArrayList<Integer> res = new ArrayList<>();

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < list.size(); i++) {
            Pair pair = new Pair(i, 0, list.get(i).get(0));
            pq.add(pair);
        }

        while (!pq.isEmpty()) {
            Pair pair = pq.remove();
            res.add(pair.data);

            pair.dataIndex++;
            if (pair.dataIndex < list.get(pair.listIndex).size()) {
                pair.data = list.get(pair.listIndex).get(pair.dataIndex);
                pq.add(pair);
            }
        }
        return res;
    }
}
