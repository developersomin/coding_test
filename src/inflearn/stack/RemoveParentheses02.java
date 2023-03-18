package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses02 {

    public String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') ;//스택에서 빼라 근데 뺸 값이 ( 면 거짓이므로 while문 나옴
            } else {
                stack.push(c);
            }
        }
        for (char c : stack) {
            answer+=c;
        }
        /*for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }*/
        return answer;
    }

    public static void main(String[] args) {
        RemoveParentheses02 removeParentheses02 = new RemoveParentheses02();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(removeParentheses02.solution(s));


    }
}
