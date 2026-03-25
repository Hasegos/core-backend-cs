package recursion;

public class MazeSolver {
    private static int N = 8;
    private static int[][] maze = {
        {0, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 0, 1, 1, 0, 1},
        {0, 0, 0, 1, 0, 0, 0, 1},
        {0, 1, 0, 0, 1, 1, 0, 0},
        {0, 1, 1, 1, 0, 0, 1, 1},
        {0, 1, 0, 0, 0, 1, 0, 1},
        {0, 0, 0, 1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private static final int PATHWAY = 0; // 갈 수 있는 길
    private static final int WALL = 1;    // 벽
    private static final int VISITED = 2; // 방문했으나 아직 출구인지 모름
    private static final int DEAD_END = 3; // 막힌 길

    public static boolean findPath(int x, int y) {
        // 1. Base Case: 범위를 벗어나거나 벽/방문한 곳인 경우
        if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] != PATHWAY) {
            return false;
        }
        // 2. Base Case: 출구에 도달한 경우
        if (x == N - 1 && y == N - 1) {
            maze[x][y] = VISITED;
            return true;
        }

        // 3. Recursive Case: 4방향 탐색
        maze[x][y] = VISITED;
        if (findPath(x - 1, y) || findPath(x, y + 1) || findPath(x + 1, y) || findPath(x, y - 1)) {
            return true;
        }

        // 4. Backtracking: 출구를 찾지 못한 경우 막힌 길로 표시
        maze[x][y] = DEAD_END;
        return false;
    }
}