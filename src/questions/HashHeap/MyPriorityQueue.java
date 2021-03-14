package questions.HashHeap;

import java.util.ArrayList;

public class MyPriorityQueue {
//    using Heap and Complete Binary Tree property
    ArrayList<Integer> list = new ArrayList<>();
    private void upHeapify(int childIndex) {
        if (childIndex == 0) return;
        int parentIndex = (childIndex - 1) / 2;
        if (list.get(parentIndex) > list.get(childIndex)) {
            int temp = list.get(parentIndex);
            list.set(parentIndex, list.get(childIndex));
            list.set(childIndex, temp);
            upHeapify(parentIndex);
        }
    }
    public void add(int data) {
        list.add(data);

        upHeapify(list.size() - 1);
    }
    public int peek() {
        if (this.size() == 0) return -1;
        else return list.get(0);
    }
    private void downHeapify(int parentIndex) {
        int min = parentIndex;
        int leftIndex = (2 * parentIndex) + 1;
        int rightIndex = (2 * parentIndex) + 2;

        if (leftIndex < list.size() && list.get(leftIndex) < list.get(min)) {
            min = leftIndex;
        }
        if (rightIndex < list.size() && list.get(rightIndex) < list.get(min)) {
            min = rightIndex;
        }
        if (min != parentIndex) {
            int temp = list.get(min);
            list.set(min, list.get(parentIndex));
            list.set(parentIndex, temp);
            downHeapify(min);
        }
    }
    public int remove() {
        if (this.size() == 0) return -1;

        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);

        int val = list.remove(list.size() - 1);
        downHeapify(0);
        return val;
    }
    public int size() {
        return list.size();
    }
}
