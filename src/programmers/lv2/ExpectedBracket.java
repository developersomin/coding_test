package programmers.lv2;

import java.util.Arrays;

public class ExpectedBracket {
    public long solution(int n, int a, int b) {
        int answer=0;
        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        ExpectedBracket T = new ExpectedBracket();

        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(T.solution(n,a,b));

    }
}
