package programmers.lv1;


import java.util.Arrays;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int answer=0;
        Arrays.sort(score);

        int box = score.length / m;
        for (int i = 1; i <= box; i++) {

            answer += score[score.length - m * i] * m;
        }


        return answer;
    }


    public static void main(String[] args) {
        FruitSeller T = new FruitSeller();

        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(T.solution(k,m,score));

    }
}
