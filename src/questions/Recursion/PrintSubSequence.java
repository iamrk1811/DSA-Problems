package questions.Recursion;

public class PrintSubSequence {
    public void print(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String restOfTheString = str.substring(1);

        print(restOfTheString, ans + ""); // NO
        print(restOfTheString, ans + ch); // YES
    }
}
