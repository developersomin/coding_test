package programmers.lv2;

import java.util.Arrays;
import java.util.HashSet;

public class EnglishEnding {
    public int[] solution(int n, String[] str) {
        int[] answer = {0,0};
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (str[i - 1].charAt(str[i-1].length() - 1) != str[i].charAt(0)||hashSet.contains(str[i])) {
                answer[1] = (int)i / n +1;
                answer[0] = i % n +1;
                break;
            }
            hashSet.add(str[i]);
        }


        return answer;
        }


    public static void main(String[] args) {
        EnglishEnding T = new EnglishEnding();
        int n = 2;
        String[] str = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(T.solution(n,str)));

    }
}
