package programmers.lv2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RotateParenthesis {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == map.get(s.charAt(j))) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(j));
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
            s = s.substring(1) + s.substring(0, 1);
            stack.clear();
        }

        return answer;
    }

    public static void main(String[] args) {
        RotateParenthesis T = new RotateParenthesis();
        String s = "}}}";

        System.out.println(T.solution(s));
    }
}
