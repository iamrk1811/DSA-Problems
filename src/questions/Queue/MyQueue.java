package questions.Queue;

public class MyQueue {
    int[] arr;
    int size = 0, currentIndex = -1;

    public MyQueue(int size) {
        this.arr = new int[size];
    }
//    add
    public boolean add(int data) {
        if (size == this.arr.length) return false;
        this.currentIndex++;
        this.arr[this.currentIndex] = data;
        this.size++;
        return true;
    }
//    remove
    public int remove() {
        int deletedData = this.arr[0];
        for (int i = 0; i < this.arr.length - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.size--;
        this.currentIndex--;
        return deletedData;
    }
//    peek
    public int peek() {
        if (this.currentIndex == -1) return -1;
        return this.arr[0];
    }
//    size
    public int size() {
        return this.size;
    }
//    isEmpty
    public boolean isEmpty() {
        return size == 0;
    }
//    toString
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < this.size; i++) {
            str.append(this.arr[i]).append(" ");
        }
        return str.toString();
    }
}
