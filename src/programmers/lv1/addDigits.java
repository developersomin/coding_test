package programmers.lv1;

import java.util.Scanner;

public class addDigits {

    public int solution(int n) {
        int answer=0;
        while (n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        addDigits T = new addDigits();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));


    }
}
