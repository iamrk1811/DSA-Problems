package questions.Array.ArrayList;

public class GetStairPathsCount {
    public int solve(int input) {
        if (input <= 0) {
            if (input == 0)
                return 1;
            return 0;
        }
        int countPaths = 0;
        countPaths += solve(input - 1);
        countPaths += solve(input - 2);
        countPaths += solve(input - 3);
        return countPaths;
    }
}
