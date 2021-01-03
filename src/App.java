import questions.Array.MajorityElement;
public class App {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] arr = {2, 2, 1, 1, 1, 2, 2}; // target 5

//        int[] arr = {4,5,6,7,8,1,2,3};

        int n = arr.length;
        System.out.println(obj.solve(arr, n));

    }
}
