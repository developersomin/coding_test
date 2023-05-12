package programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class SequenceSums {
    public int solution(int[] elements) {
        int answer = 0;

        Set<Integer> set = new HashSet<>(); // 1,4,7,9
        for (int x : elements) {
            set.add(x);
        }

        return answer;

    }




    public static void main(String[] args) {
        SequenceSums T = new SequenceSums();
        int[] elements= {7, 9, 1, 1, 4};

        System.out.println(T.solution(elements));
    }
}
