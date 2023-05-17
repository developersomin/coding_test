package programmers.lv2;

import java.util.*;

public class TheHallOfFame {
    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }

        return answer;

    }

    public static void main(String[] args) {
        TheHallOfFame T = new TheHallOfFame();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(T.solution(k, score)));

    }
}