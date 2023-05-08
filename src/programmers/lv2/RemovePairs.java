package programmers.lv2;

import java.util.Stack;

public class RemovePairs {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (stack.isEmpty()) {
                stack.push(c[i]);
            } else {
                if (stack.peek() == c[i]) {
                    stack.pop();
                } else {
                    stack.push(c[i]);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;


    }

    public static void main(String[] args) {
        RemovePairs T = new RemovePairs();
        String s = "cdcd";

        System.out.println(T.solution(s));
    }
}
