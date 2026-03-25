package recursion;

public class BlobCounter {
    private static int N = 8;
    private static int[][] grid = {
        {1, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 0, 0},
        {1, 1, 0, 0, 1, 0, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 0},
        {1, 0, 0, 0, 1, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 1, 1}
    };

    private static final int IMAGE_COLOR = 1;
    private static final int ALREADY_COUNTED = 2;

    public static int countCells(int x, int y) {
        // 1. Base Case: 범위를 벗어나거나 색칠되지 않은/이미 센 곳
        if (x < 0 || y < 0 || x >= N || y >= N || grid[x][y] != IMAGE_COLOR) {
            return 0;
        }

        // 2. 현재 셀 카운트 및 중복 방지 표시
        grid[x][y] = ALREADY_COUNTED;

        // 3. Recursive Case: 인접한 8방향 모두 합산
        return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1) + countCells(x + 1, y + 1)
                + countCells(x - 1, y)                         + countCells(x + 1, y)
                + countCells(x - 1, y - 1) + countCells(x, y - 1) + countCells(x + 1, y - 1);
    }
}