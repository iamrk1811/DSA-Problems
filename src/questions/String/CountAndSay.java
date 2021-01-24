package questions.String;

public class CountAndSay {
    public String solve(int n) {
        String str = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder newString = new StringBuilder();

            int counter = 1; char val = str.charAt(0);
            for (int j = 1; j < str.length(); j++) {
                if (val == str.charAt(j)) counter++;
                else {
                    newString.append(counter); newString.append(val);
                    counter = 1; val = str.charAt(j);
                }
            }
            newString.append(counter);
            newString.append(val);

            str = newString.toString();
        }

        return str;
    }
}
