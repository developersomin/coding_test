package programmers.lv1;

import java.util.Arrays;

public class NearestIdenticalLetter {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for (int i = 1; i < answer.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NearestIdenticalLetter T = new NearestIdenticalLetter();
        String s = "foobar";
        System.out.println(Arrays.toString(T.solution(s)));
    }
}
