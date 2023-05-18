package inflearn.section7;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs8 {
    int[] jump = {1, -1, 5};
    int[] check = new int[10001];
    Queue<Integer> queue = new LinkedList<>();

    public int DFS(int s, int e) {
        queue.add(s);
        int jumpCount=0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int a = queue.poll();
                for (int j = 0; j < jump.length; j++) {
                    int cur = a + jump[j];
                    if (cur == e) {
                        return jumpCount+1;
                    }
                    if (cur >= 1 && cur <= 10000 && check[cur] == 0) {
                        check[cur] = 1;
                        queue.add(cur);
                    }
                }
            }
            jumpCount++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Bfs8 T = new Bfs8();
        int s = 8;
        int e = 3;
        System.out.println(T.DFS(s,e));

    }
}
