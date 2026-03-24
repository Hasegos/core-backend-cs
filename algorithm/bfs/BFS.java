package bfs;

import java.util.*;

public class BFS {
    static int[][] adj;
    static boolean[] visited;
    static int n, e;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();

        adj = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj[v1][v2] = adj[v2][v1] = 1;
        }

        System.out.print("BFS 탐색 결과: ");
        bfs(1);
    }

    public static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        visited[start] = true;

        while (!que.isEmpty()) {
            int v = que.poll();
            System.out.print(v + " ");

            for (int i = 1; i <= n; i++) {
                if (!visited[i] && adj[v][i] == 1) {
                    que.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}