package inflearn.quque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess06 {
    public int solution(int n, int k) {
        int answer=0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i); //큐에 넣음
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll()); //poll(뺴다) 한것으 넣어줌
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        SavePrincess06 savePrincess06 = new SavePrincess06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(savePrincess06.solution(n,k));
    }
}
