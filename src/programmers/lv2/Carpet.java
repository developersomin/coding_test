package programmers.lv2;

import java.util.Arrays;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                int length = i; //세로  3
                int width = sum/i; //가로  4
                if (((width - 1) + (length - 1)) * 2 == brown ) {

                    answer[0] = width;
                    answer[1] = length;
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Carpet T = new Carpet();

        int brown = 8;
        int yellow = 1;
        System.out.println(Arrays.toString(T.solution(brown,yellow)));

    }

}
