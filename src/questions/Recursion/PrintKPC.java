package questions.Recursion;

public class PrintKPC {
    public void print(String[] arr, String input, String ans) {
        if (input.length() == 0) {
            System.out.println(ans);
            return;
        }

        char btn = input.charAt(0);
        String restOfTheInput = input.substring(1);

        String firstString = arr[(int) btn - 48];
        for (char ch : firstString.toCharArray()) {
            print(arr, restOfTheInput, ans + ch); //YES
        }

    }
}
