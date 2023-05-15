package programmers.lv1;


import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public int solution(int n) {
        /*int answer=1;

        for (int i = 3; i <= n; i++) {
            boolean primeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber == true) {
                answer++;
            }

        }
        return answer;*/

        int answer = 0;
        int[] number = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            number[i] = i;
        }
        for (int i = 2; i < n + 1; i++) {
            if (number[i] != 0) {
                for (int j = i + i; j < n + 1; j = j + i) {
                    number[j] = 0;
                }
            }
        }

        for (int i = 2; i < n + 1; i++) {
            if (number[i] != 0) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        int n = 10;
        System.out.println(T.solution(n));

    }
}
