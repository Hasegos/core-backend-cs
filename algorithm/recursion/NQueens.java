package recursion;

public class NQueens {
    private static int N = 8;
    private static int[] cols = new int[N + 1]; // index는 행, value는 열 위치

    public static boolean queens(int level) {
        // 1. 유망한지 체크 (현재 퀸을 놓은 위치가 유효한가?)
        if (!isPromising(level)) return false;

        // 2. Base Case: 모든 퀸을 다 놓았을 때
        if (level == N) return true;

        // 3. Recursive Case: 다음 행의 모든 열에 대해 시도
        for (int i = 1; i <= N; i++) {
            cols[level + 1] = i;
            if (queens(level + 1)) return true;
        }
        return false;
    }

    private static boolean isPromising(int level) {
        for (int i = 1; i < level; i++) {
            // 같은 열에 있거나, 대각선에 위치하는지 체크
            if (cols[i] == cols[level] || Math.abs(cols[level] - cols[i]) == level - i) {
                return false;
            }
        }
        return true;
    }
}