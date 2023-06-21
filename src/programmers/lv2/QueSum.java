package programmers.lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueSum {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        int totalSum=0;
        int que2Sum=0;

        for (int i = 0; i < queue1.length; i++) {
            que1.add(queue1[i]);
            que2.add(queue2[i]);
            totalSum += queue1[i] + queue2[i];
        }

        while(!que2.isEmpty()){
            que2Sum += que2.poll();
            if (totalSum / 2 == que2Sum) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        QueSum t = new QueSum();
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        System.out.println(t.solution(queue1,queue2));
    }
}
