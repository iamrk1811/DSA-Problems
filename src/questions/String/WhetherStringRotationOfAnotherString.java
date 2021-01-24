package questions.String;

public class WhetherStringRotationOfAnotherString {
    public void solve (String str1, String str2) {
        StringBuilder temp = new StringBuilder(str2 + str2);

        System.out.println(temp.indexOf(str1));
    }
}
