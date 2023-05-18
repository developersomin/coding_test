package inflearn.section7;


import java.util.Scanner;

public class GraphDfs10 {
    static int n;
    static int m;

    static int answer=0;
    static int[][] graph;
    static int[] check;

    public void DFS(int start) {
        if (start == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[start][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        GraphDfs10 T = new GraphDfs10();
        Scanner sc = new Scanner(System.in);
        n=5;
        m =8;
        graph = new int[n + 1][n + 1];
        check = new int[n+1];
        for (int i = 0; i < m; i++) {
            graph[sc.nextInt()][sc.nextInt()]=1;
        }
        check[1] = 1;
        T.DFS(1);


    }
}
