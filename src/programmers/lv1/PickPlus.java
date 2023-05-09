package programmers.lv1;

import java.util.*;

public class PickPlus {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> answer = new TreeSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        PickPlus T = new PickPlus();

        int[] numbers = {5,0,2,7};
        System.out.println(T.solution(numbers));

    }
}
