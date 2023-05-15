package programmers.lv2;

import java.util.*;

public class QueueFunction {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i]+1);
            }

        }
        int tmp = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            if (tmp < queue.peek()) {
                list.add(count);
                tmp = queue.poll();
                count = 1;
            } else {
                count++;
                queue.poll();
            }
        }

        list.add(count);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;

    }

    public static void main(String[] args) {
        QueueFunction T = new QueueFunction();

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(T.solution(progresses,speeds)));

    }
}
