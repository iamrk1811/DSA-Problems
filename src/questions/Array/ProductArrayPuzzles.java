package questions.Array;

public class ProductArrayPuzzles {
    public int[] solve(int[] arr) {
        long product = 1;
        for (int val: arr) {
            product *= val;
        }

        for (int i = 0; i < arr.length; i++) arr[i] = (int) (product / arr[i]);
        return arr;
    }
    public int[] solve2(int[] arr) {
        long[] left = new long[arr.length];
        long[] right = new long[arr.length];

//        left part
        long currentProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            currentProduct *= arr[i];
            left[i] = currentProduct;
        }
//        right
        currentProduct = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            currentProduct *= arr[i];
            right[i] = currentProduct;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = (int) right[i + 1];
            }else if (i == arr.length - 1){
                arr[i] = (int) left[i - 1];
            } else {
                arr[i] = (int) (left[i - 1] * right[i + 1]);
            }

        }
        return arr;
    }
}
