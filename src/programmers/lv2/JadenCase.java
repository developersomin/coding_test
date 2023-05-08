package programmers.lv2;

import java.util.Scanner;

public class JadenCase {
    public String solution(String n) {

        String answer = "";
        String[] str = n.toLowerCase().split("");
        boolean isNextUpper = true;

        for (String ss : str) {
            answer += isNextUpper ? ss.toUpperCase() : ss;
            isNextUpper = ss.equals(" ") ? true : false;
        }
        return answer;
    }

    public static void main(String[] args) {
        JadenCase T = new JadenCase();
        Scanner kb = new Scanner(System.in);
        String n=kb.nextLine();
        System.out.println(T.solution(n));

    }
}
