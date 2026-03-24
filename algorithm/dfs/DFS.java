package dfs;

import java.util.Scanner;

public class DFS {
    static int[][] adj; // 인접 행렬
    static boolean[] visited; // 방문 체크
    static int n, e; // 정점 수, 간선 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점 개수
        e = sc.nextInt(); // 간선 개수

        adj = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj[v1][v2] = adj[v2][v1] = 1; // 무방향 그래프
        }

        System.out.print("DFS 탐색 결과: ");
        dfs(1); // 1번 노드부터 시작
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && adj[v][i] == 1) {
                dfs(i);
            }
        }
    }
}