package inflearn.section7;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphList11 {
    static int n;
    static int m;

    static int answer=0;
    static List<ArrayList<Integer>> graph;
    static int[] check;

    public void DFS(int start) {
        if (start == n) {
            answer++;
        } else {
            for (int nextNum : graph.get(start)) {
                if (check[nextNum] == 0) {
                    check[nextNum] = 1;
                    DFS(nextNum);
                    check[nextNum]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        GraphList11 T = new GraphList11();
        Scanner sc = new Scanner(System.in);
        n=5;
        m =9;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n+1];
        for (int i = 0; i < m; i++) {
            graph.get(sc.nextInt()).add(sc.nextInt());
        }
        check[1] = 1;
        T.DFS(1);


    }
}
