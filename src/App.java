import questions.Array.FindSmallestPositiveNumber;
public class App {
    public static void main(String[] args) {
        FindSmallestPositiveNumber obj = new FindSmallestPositiveNumber();
        int[] arr = {1, 1 };
//        int[] arr = {3, 4, 7, 1};

        int n = arr.length;
        System.out.println(obj.solve(arr, n));

    }
}
