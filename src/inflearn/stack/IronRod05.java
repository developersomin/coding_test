package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class IronRod05 {
    public int solution(String s) {
        int answer=0;
        Stack<Character> stack = new Stack<>();
        for (int i =0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (s.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        IronRod05 ironRod05 = new IronRod05();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(ironRod05.solution(s));
    }
}
