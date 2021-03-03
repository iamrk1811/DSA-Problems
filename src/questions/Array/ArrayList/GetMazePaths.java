package questions.Array.ArrayList;

import java.util.ArrayList;

public class GetMazePaths {
    public ArrayList<String> solve(int sourceRow, int sourceCol, int desRow, int desCol) {
        if (sourceRow == desRow && sourceCol == desCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        } else if (sourceRow > desRow || sourceCol > desCol) {
            return new ArrayList<String>();
        }
//        Horizontal Path
        ArrayList<String> path1 = solve(sourceRow, sourceCol + 1, desRow, desCol);
//        Vertical Path
        ArrayList<String> path2 = solve(sourceRow + 1, sourceCol, desRow, desCol);

        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1) paths.add("H" + path);
        for (String path : path2) paths.add("V" + path);

        return paths;
    }
}
