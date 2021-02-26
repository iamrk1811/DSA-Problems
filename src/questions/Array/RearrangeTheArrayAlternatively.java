package questions.Array;

public class RearrangeTheArrayAlternatively {
//    input = 1, 2, 3, -4, -1, 4
//    output = -1, 2, -4, 4, 1, 3
//    just have to alternate one positive and one negative digits

    public int[] solve(int[] arr) {
//        rearrange the digits positive to negatives
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] < 0) {
                i++;
            } else {
                swap(arr, i, j);
                i++; j++;
            }
        }
        int lastSwapPosition = j;
        i = 0;
        while (i < j && j < arr.length) {
            swap(arr, i, j);
            j++;
            i += 2;
        }
        return arr;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
