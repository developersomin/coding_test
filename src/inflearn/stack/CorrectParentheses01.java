package inflearn.stack;

import inflearn.hash.HaggeubHoejang01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses01 {
    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.empty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        CorrectParentheses01 correctParentheses01 = new CorrectParentheses01();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(correctParentheses01.solution(s));


    }
}
