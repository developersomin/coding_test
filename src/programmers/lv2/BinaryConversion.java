package programmers.lv2;

import java.util.Arrays;

public class BinaryConversion {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int one = 0;

        while (one != 1) {
            int tmp = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    tmp++;
                } else {
                    answer[1]++;
                }
            }
            s = Integer.toBinaryString(tmp);
            one = tmp;
            answer[0]++;
        }

        return answer;


    }

    public static void main(String[] args) {
        BinaryConversion T = new BinaryConversion();
        String s = "1111111";

        System.out.println(T.solution(s));
    }
}
