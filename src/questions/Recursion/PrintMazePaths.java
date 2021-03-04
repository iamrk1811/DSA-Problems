package questions.Recursion;

public class PrintMazePaths {
    public void print(int sourceRow, int sourceCol, int desRow, int desCol, String ans) {
        if (sourceCol == desCol && sourceRow == desRow) {
            System.out.println(ans);
            return;
        } else if (sourceCol > desCol || sourceRow > desRow) {
            return;
        }
        print(sourceRow, sourceCol + 1, desRow, desCol, ans + "H");
        print(sourceRow + 1, sourceCol, desRow, desCol, ans + "V");
    }
}
