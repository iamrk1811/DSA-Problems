package questions.HashHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPriorityQueue {
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();
    private int size = 0;
    public void add(int data) {
        if (min.size() > 0 && min.peek() < data) {
            min.add(data);
        } else {
            max.add(data);
        }

        if (max.size() - min.size() > 1) {
            min.add(max.remove());
        } else if (min.size() - max.size() > 1) {
            max.add(min.remove());
        }
        size++;
    }
    public int remove(){
        if (size == 0) return -1;
        if (max.size() >= min.size()) {
            size--;
            return max.remove();
        } else {
            size--;
            return min.remove();
        }
    }
    public Integer peek() {
        if (size == 0) return -1;
        if (max.size() >= min.size()) {
            return max.peek();
        } else {
            return min.peek();
        }
    }
    public int size() {
        return this.size;
    }
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int val : max) {
            str.append(val).append(" ");
        }
        for (int val : min) {
            str.append(val).append(" ");
        }

        return str.toString();
    }
}
