package programmers.lv2;

import java.util.Arrays;

public class EnglishEnding {
    public int[] solution(int n, String[] str) {
        int[] answer = {0,0};
        for (int i = 1; i < str.length; i++) {
            if (str[i - 1].charAt(str[i-1].length() - 1) != str[i].charAt(0)) {
                answer[1] = (int)i / n +1;
                answer[0] = i % n +1;
                break;
            }
            for (int j = 0; j <= i - 1; j++) {
                if (str[i] == str[j]) {
                    answer[1] = (int)i / n +1;
                    answer[0] = i % n +1;
                    break;
                }
            }

        }


        return answer;
        }


    public static void main(String[] args) {
        EnglishEnding T = new EnglishEnding();
        int n = 3;
        String[] str = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(T.solution(n,str)));

    }
}
