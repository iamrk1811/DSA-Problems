import questions.Array.SortArrayElementsByFrequency;

public class App {
    public static void main(String[] args) {
        SortArrayElementsByFrequency obj = new SortArrayElementsByFrequency();
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        int n = arr.length;
        System.out.println(obj.sortFrequencyUsingSortingAnd(arr, n));

    }
}
