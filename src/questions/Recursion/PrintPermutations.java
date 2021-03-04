package questions.Recursion;

public class PrintPermutations {
    public void print(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String part1 = str.substring(0, i);
            String part2 = str.substring(i + 1);

            print(part1 + part2, ans + ch); //YES
        }
    }
}
