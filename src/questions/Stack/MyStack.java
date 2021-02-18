package questions.Stack;

public class MyStack {
//    Using array
    int[] arr;
    int currentIndex = -1;
    int size = 0;
    public MyStack(int size) {
        arr = new int[size];
    }
//    push
    public boolean push(int data) {
//        stack is full
        if (size == arr.length) return false;

        this.currentIndex++;
        this.arr[this.currentIndex] = data;
        this.size++;
        return true;
    }
//    pop
    public int pop() {
        if (this.currentIndex == -1) return -1;

        int deletedItem = this.arr[this.currentIndex];
        this.currentIndex--;
        this.size--;
        return deletedItem;
    }
//    peek
    public int peek() {
        if (this.currentIndex == -1) return -1;
        return this.arr[this.currentIndex];
    }
//    size
    public int size() {
        return size;
    }
//    isEmpty
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < this.size; i++) {
            str.append(this.arr[i]).append(" ");
        }
        return str.toString();
    }
}
