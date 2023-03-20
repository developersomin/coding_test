package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix04 {
    public int solution(String s) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c-48);
            } else {
                int rt=stack.pop();
                int lt = stack.pop();
                if (c == '+') {
                    stack.push(lt + rt);
                }else if (c == '-') {
                    stack.push(lt - rt);
                }else if (c == '*') {
                    stack.push(lt * rt);
                }
                else if (c == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        return stack.get(0);
    }

    public static void main(String[] args) {
        Postfix04 postfix04 = new Postfix04();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(postfix04.solution(s));
    }
}
