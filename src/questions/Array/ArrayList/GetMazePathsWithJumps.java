package questions.Array.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetMazePathsWithJumps {
    public ArrayList<String> solve(int sourceRow, int sourceCol, int desRow, int desCol) {
        if (desCol == sourceCol && desRow == sourceRow) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        } else if (sourceCol > desCol || sourceRow > desRow) {
            return new ArrayList<String>();
        }
        ArrayList<String> paths = new ArrayList<>();
//        Horizontal path
        for (int i = 1; i <= desCol - sourceCol; i++) {
            ArrayList<String> recRes = solve(sourceRow, sourceCol + i, desRow, desCol);
            for (String path : recRes) {
                paths.add("H" + i + path);
            }
        }
//        Vertical path
        for (int i = 1; i <= desRow - sourceRow; i++) {
            ArrayList<String> recRes = solve(sourceRow + i, sourceCol, desRow, desCol);
            for (String path : recRes) {
                paths.add("V" + i + path);
            }
        }
//        Diagonal path
        for (int i = 1; i <= desCol - sourceCol && i <= desRow - sourceRow; i++) {
            ArrayList<String> resRec = solve(sourceRow + i, sourceCol + i, desRow, desCol);
            for (String path : resRec) {
                paths.add("D" + i + path);
            }
        }
        return paths;
    }
}
