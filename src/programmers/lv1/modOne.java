package programmers.lv1;

import java.util.Scanner;

public class modOne {

    public int solution(int n) {
        int answer=0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        modOne T = new modOne();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));

    }
}
