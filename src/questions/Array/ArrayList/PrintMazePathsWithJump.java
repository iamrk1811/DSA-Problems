package questions.Array.ArrayList;

public class PrintMazePathsWithJump {
    public void print(int sourceRow, int sourceCol, int desRow, int desCol, String ans) {
        if (desCol == sourceCol && sourceRow == desRow) {
            System.out.println(ans);
            return;
        } else if (sourceCol > desCol || sourceRow > desRow) {
            return;
        }
//        Horizontal
        for (int i = 1; i <= desCol - sourceCol; i++) {
            print(sourceRow, sourceCol + i, desRow, desCol, ans + "H" + i);
        }
//        Vertical
        for (int i = 1; i <= desRow - sourceRow; i++) {
            print(sourceRow + i, sourceCol, desRow, desCol, ans + "V" + i);
        }
//        Diagonal
        for (int i =  1; i <= desCol - sourceCol && i <= desRow - sourceRow; i++) {
            print(sourceRow + i, sourceCol + i, desRow, desCol, ans + "D" + i);
        }
    }
}
