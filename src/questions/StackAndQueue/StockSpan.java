package questions.StackAndQueue;

import java.util.Stack;
class Pair {
    int data;
    int index;
}
public class StockSpan {
    public int[] solve(int[] arr) {
        Stack<Pair> stack = new Stack<>();
        Pair[] res = new Pair[arr.length];

        Pair item1 = new Pair();
        item1.data = -1;
        item1.index = 0;
        res[0] = item1;

        stack.push(item1);

//        left greater element
        for (int i = 1; i < res.length; i++) {
            while (!stack.isEmpty() && stack.peek().data <= arr[i]) stack.pop();
            if (stack.isEmpty()) {
                Pair item = new Pair();
                item.data = -1;
                item.index = i;
                res[i] = item;
            } else
                res[i] = stack.peek();

            Pair item = new Pair();
            item.data = arr[i];
            item.index = i;

            stack.push(item);
        }
        int[] resultArray = new int[arr.length];

        for (int i = 0; i < res.length; i++) {
            if (res[i].data == -1)
                resultArray[i] = i + 1;
            else
                resultArray[i] = i - res[i].index;
        }

        return resultArray;
    }

}
