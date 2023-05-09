package programmers.lv2;

import java.util.Arrays;

public class GreedyLifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min=0;
        for (int max = people.length - 1; max >= min; max--) {
            if (people[max] + people[min] <= limit) {
                min++;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        GreedyLifeboat T = new GreedyLifeboat();

        int[] people = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int limit = 100;
        System.out.println(T.solution(people, limit));

    }
}
