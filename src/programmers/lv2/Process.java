package programmers.lv2;

import java.util.*;

public class Process {
    public int solution(int[] priorities, int location) {

        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int x : priorities) {
            queue.add(x);
        }
        Arrays.sort(priorities);
        int endIndex = priorities.length - 1;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (poll == priorities[endIndex-answer]) {

            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Process T = new Process();

        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(T.solution(priorities,location));

    }
}
